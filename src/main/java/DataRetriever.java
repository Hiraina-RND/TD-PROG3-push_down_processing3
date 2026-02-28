import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataRetriever {
    public List<VehicleKmResult> getTotalKmByVehicle() {
        DBConnection dbConnection = new DBConnection();
        String sql = """
                SELECT v.id as vehicule_id,
                       SUM(t.nbre_km) as total_km
                FROM vehicule v
                JOIN trajet t ON v.id = t.id_vehicule
                GROUP BY v.id
                ORDER BY v.id
                """;
        List<VehicleKmResult> resultList = new ArrayList<>();

        try(
                Connection connection = dbConnection.getConnection();
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet resultSet = ps.executeQuery()
        ) {
            while(resultSet.next()) {
                resultList.add(
                        new VehicleKmResult(
                                resultSet.getInt("vehicule_id"),
                                resultSet.getDouble("total_km")
                        )
                );
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error executing query", e);
        }
        if (resultList.isEmpty()) {
            throw new RuntimeException("No result found");
        }
        return resultList;
    }

    public DestinationKmResult getTotalKmByDestination() {
        DBConnection dbConnection = new DBConnection();
        String sql = """
                select SUM(case when t.destination = 'ANTANANARIVO' then t.nbre_km end) as antananarivo_total_km,
                       SUM(case when t.destination = 'AMPEFY' then t.nbre_km end) as ampefy_total_km,
                       SUM(case when t.destination = 'ANDASIBE' then t.nbre_km end) as andasibe_total_km
                from trajet t
                """;
        DestinationKmResult result = new DestinationKmResult();

        try(
                Connection connection = dbConnection.getConnection();
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet resultSet = ps.executeQuery()
        ) {
            if(resultSet.next()) {
                result.setAntananarivoTotalKm(resultSet.getDouble("antananarivo_total_km"));
                result.setAmpefyTotalKm(resultSet.getDouble("ampefy_total_km"));
                result.setAndasibeTotalKm(resultSet.getDouble("andasibe_total_km"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error executing query", e);
        }
        return result;
    }
}
