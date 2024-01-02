package veicoli;

public class Autovettura extends Veicolo {
    private int numeroPosti;

    public Autovettura(String numTelaio, String modello, String alimentazione, String targa, int numeroPosti) {
        super(numTelaio, modello, alimentazione, targa);
        this.numeroPosti = numeroPosti;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    // Targa nel formato: CCDDDCC
    public boolean controllaTarga() {
        return super.getTarga().matches("^[A-Z]{2}\\d{3}[A-Z]{2}$");
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero Posti: " + numeroPosti + "\n\n";
    }
}
