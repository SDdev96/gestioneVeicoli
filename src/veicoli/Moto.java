package veicoli;

public class Moto extends Veicolo {
    private boolean guidaLibera;

    public Moto(String numTelaio, String modello, String alimentazione, String targa, boolean guidaLibera) {
        super(numTelaio, modello, alimentazione, targa);
        this.guidaLibera = guidaLibera;
    }

    public boolean getGuidaLibera() {
        return guidaLibera;
    }

    // Targa nel formato: CCDDDDD
    public boolean controllaTarga() {
        return super.getTarga().matches("^[A-Z]{2}\\d{5}$");
    }

    @Override
    public String toString() {
        return super.toString() + "\n Guida libera: " + guidaLibera + "\n\n";
    }
}
