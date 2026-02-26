public class VehicleKmResult {
    private Integer vehicleId;
    private double totalKm;

    @Override
    public String toString() {
        return "VehicleKmResult{" +
                "vehicleId=" + vehicleId +
                ", totalKm=" + totalKm +
                '}';
    }

    public VehicleKmResult(Integer vehicleId, double totalKm) {
        this.vehicleId = vehicleId;
        this.totalKm = totalKm;
    }

    public VehicleKmResult() {
    }

    public Integer getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    public double getTotalKm() {
        return totalKm;
    }

    public void setTotalKm(double totalKm) {
        this.totalKm = totalKm;
    }
}
