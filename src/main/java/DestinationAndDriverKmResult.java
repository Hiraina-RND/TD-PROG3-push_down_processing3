public class DestinationAndDriverKmResult {
    private Integer driverId;
    private String destination;
    private Double total_km;

    @Override
    public String toString() {
        return "DestinationAndDriverKmResult{" +
                "driverId='" + driverId + '\'' +
                ", destination='" + destination + '\'' +
                ", total_km=" + total_km +
                '}';
    }

    public DestinationAndDriverKmResult(Integer driverId, String destination, Double total_km) {
        this.driverId = driverId;
        this.destination = destination;
        this.total_km = total_km;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverName(Integer driverId) {
        this.driverId = driverId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Double getTotal_km() {
        return total_km;
    }

    public void setTotal_km(Double total_km) {
        this.total_km = total_km;
    }
}
