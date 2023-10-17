package Radnik;

public class Ispis {
    public static void main(String[] args) {

        RadnikPoSatu radnikPoSatu = new RadnikPoSatu("Pera", "Peric", "123456789", 8, 500);
        RadnikPoDanu radnikPoDanu = new RadnikPoDanu("Sima", "Simic", "345678912", 5, 3000);
        RadnikFixno radnikFixno = new RadnikFixno("Zika", "Zivkovic", "123987654", 40000);

        radnikPoDanu.calculatePaycheck();
        radnikPoSatu.calculatePaycheck();
        radnikFixno.calculatePaycheck();

        System.out.println("Radnik po danu" );
        radnikPoDanu.displayInfo();

        System.out.println("Radnik po satu");
        radnikPoSatu.displayInfo();

        System.out.println("Radnik fixno");
        radnikFixno.displayInfo();

    }
}
