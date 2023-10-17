package Product;

public class Wine extends Product{

    private static final double WINE_TAX_RATE = 0.10;
    private double volume;


    public Wine(double basePrice, String barcode, String name, double volume) {
        super(basePrice, barcode, name);
        this.volume = volume;
    }

    @Override
    public double calculateTotalPrice() {
        return super.calculateTotalPrice() * (1 + WINE_TAX_RATE);
    }


    @Override
    public String toString() {
        return "Wine{" +
                "volume=" + volume +
                ", basePrice=" + basePrice +
                ", barcode='" + barcode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
