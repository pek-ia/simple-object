public class Headphones {
    private String brand;
    private String model;
    private double price;
    private boolean wireless;

    public Headphones(String brand, String model, double price, boolean wireless) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.wireless = wireless;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public boolean isWireless() {
        return wireless;
    }
}
