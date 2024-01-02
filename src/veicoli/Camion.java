package veicoli;

public class Camion extends Veicolo {
    private int numeroAssi;

    public Camion(String numTelaio, String modello, String alimentazione, String targa, int numeroAssi) {
        super(numTelaio, modello, alimentazione, targa);
        this.numeroAssi = numeroAssi;
    }

    public int getNumeroAssi() {
        return numeroAssi;
    }

    // Targa nel formato: CCDDDDDD
    public boolean controllaTarga() {
        return super.getTarga().matches("^[A-Z]{2}\\d{6}$");
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumero assi: " + numeroAssi + "\n\n";
    }
}
