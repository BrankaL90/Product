package Product;

public class Main {
    public static void main(String[] args) {

        Wine wine = new Wine(100, "123456", "Red Wine", 0.75); // 0.75 liters
        System.out.println("Wine total price: RSD" + wine.calculateTotalPrice());

        Chocolate chocolate = new Chocolate(50, "789012", "Dark Chocolate", 200); // 200 grams
        System.out.println("Chocolate total price: RSD" + chocolate.calculateTotalPrice());
    }

    }

