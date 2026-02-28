public class Main {
    static void main(String[] args) {
        DataRetriever dataRetriever = new DataRetriever();
        System.out.println(dataRetriever.getTotalKmByVehicle());
        System.out.println("===================");
        System.out.println(dataRetriever.getTotalKmByDestination());
        System.out.println("===================");
        System.out.println(dataRetriever.getTotalKmByDestinationAndDriver());
    }
}
