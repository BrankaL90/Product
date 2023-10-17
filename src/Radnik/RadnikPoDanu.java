package Radnik;

public class RadnikPoDanu extends Radnik{

    private int radjeniDani;
    private double dnevnica;

    public RadnikPoDanu(String ime, String prezime, String brojRacuna, int radjeniDani, double dnevnica) {
        super(ime, prezime, brojRacuna);
        this.radjeniDani = radjeniDani;
        this.dnevnica = dnevnica;
    }

    @Override
    public void calculatePaycheck() {

        plata = radjeniDani * dnevnica;

    }
}
