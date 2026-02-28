public class DestinationKmResult {
    private Double antananarivoTotalKm;
    private Double ampefyTotalKm;
    private Double andasibeTotalKm;

    @Override
    public String toString() {
        return "DestinationKmResult{" +
                "antananarivoTotalKm=" + antananarivoTotalKm +
                ", ampefyTotalKm=" + ampefyTotalKm +
                ", andasibeTotalKm=" + andasibeTotalKm +
                '}';
    }

    public DestinationKmResult(Double antananarivoTotalKm, Double ampefyTotalKm, Double andasibeTotalKm) {
        this.antananarivoTotalKm = antananarivoTotalKm;
        this.ampefyTotalKm = ampefyTotalKm;
        this.andasibeTotalKm = andasibeTotalKm;
    }

    public DestinationKmResult() {
    }

    public Double getAntananarivoTotalKm() {
        return antananarivoTotalKm;
    }

    public void setAntananarivoTotalKm(Double antananarivoTotalKm) {
        this.antananarivoTotalKm = antananarivoTotalKm;
    }

    public Double getAmpefyTotalKm() {
        return ampefyTotalKm;
    }

    public void setAmpefyTotalKm(Double ampefyTotalKm) {
        this.ampefyTotalKm = ampefyTotalKm;
    }

    public Double getAndasibeTotalKm() {
        return andasibeTotalKm;
    }

    public void setAndasibeTotalKm(Double andasibeTotalKm) {
        this.andasibeTotalKm = andasibeTotalKm;
    }
}
