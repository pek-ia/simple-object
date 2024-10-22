public class MainApp {
    public static void main(String[] args) {
        // Get some values from the user, ora CSV file, or the network
        String myFavoriteBrand = "JBL";
        String newestModel = "SK10000XLQ";
        double priceOnAmazon = 130.0;
        boolean bluetooth = true;


        HeadphonesRecord myEarBuds = new HeadphonesRecord(myFavoriteBrand, newestModel, priceOnAmazon, bluetooth);

        HeadphonesRecord otherHeadset = new HeadphonesRecord("Sound Effectia", "X-01", 4.00, false);

        printHeadphones(myEarBuds);
        printHeadphones(otherHeadset);

    }

    static void printHeadphones(HeadphonesRecord h){

        System.out.println(h.brand() + " has a new model! : " + h.model());
    }
}
