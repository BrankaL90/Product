package Radnik;

public class RadnikPoSatu extends Radnik{

    private int radjeniSati;
    private double satnica;


    public RadnikPoSatu(String ime, String prezime, String brojRacuna,int radjeniSati, double satnica) {
        super(ime, prezime, brojRacuna);
        this.radjeniSati = radjeniSati;
        this.satnica = satnica;
    }
    @Override
    public void calculatePaycheck() {
        plata = radjeniSati * satnica;
    }
}
