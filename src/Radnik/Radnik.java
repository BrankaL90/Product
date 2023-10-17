package Radnik;

public abstract class Radnik {

    protected String ime;
    protected String prezime;
    protected String brojRacuna;
    protected double plata;

    public Radnik(String ime, String prezime, String brojRacuna) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojRacuna = brojRacuna;}

    public void displayInfo() {
        System.out.println("Name: " + ime);
        System.out.println("Surname: " + prezime);
        System.out.println("Account Number: " + brojRacuna);
        System.out.println("Paycheck: $" + plata);
    }


    @Override
    public String toString() {
        return "Radnik{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", brojRacuna='" + brojRacuna + '\'' +
                ", plata=" + plata +
                '}';
    }

    public abstract void calculatePaycheck();
}
