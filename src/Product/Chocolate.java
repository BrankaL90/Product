package Product;

public class Chocolate extends Product{

    private double weight;


    public Chocolate(double basePrice, String barcode, String name, double weight) {
        super(basePrice, barcode, name);
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Chocolate{" +
                "weight=" + weight +
                ", basePrice=" + basePrice +
                ", barcode='" + barcode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
