package Product;

public abstract class Product {

    protected double basePrice;
    protected String barcode;
    protected String name;
    protected static final double TAX_RATE = 0.20;

    public Product(double basePrice, String barcode, String name) {
        this.basePrice = basePrice;
        this.barcode = barcode;
        this.name = name;
    }

    public double calculateTotalPrice() {
        return basePrice * (1 + TAX_RATE);
    }

    @Override
    public String toString() {
        return "Product{" +
                "basePrice=" + basePrice +
                ", barcode='" + barcode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}




