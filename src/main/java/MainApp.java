public class MainApp {
    public static void main(String[] args) {
        // Get some values from the user, ora CSV file, or the network
        String myFavoriteBrand = "JBL";
        String newestModel = "SK10000XLQ";
        double priceOnAmazon = 130.0;
        boolean bluetooth = true;


        Headphones myEarBuds = new Headphones(myFavoriteBrand, newestModel, priceOnAmazon, bluetooth);

        Headphones otherHeadset = new Headphones("ElCrummy", ".01", 4.00, false);

        printHeadphones(myEarBuds);
        printHeadphones(otherHeadset);

    }

    static void printHeadphones(Headphones h){

        System.out.println(h.getBrand() + "has a new model! : " + h.getModel());
    }
}
