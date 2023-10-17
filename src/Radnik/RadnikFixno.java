package Radnik;

public class RadnikFixno extends Radnik {

    private double fixnaPlata;
    public RadnikFixno(String ime, String prezime, String brojRacuna, double fixnaPlata) {
        super(ime, prezime, brojRacuna);
        this.fixnaPlata = fixnaPlata;
    }

    @Override
    public void calculatePaycheck() {
        plata= fixnaPlata;

    }
}
