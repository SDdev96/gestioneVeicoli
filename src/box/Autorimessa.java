package box;

import veicoli.Veicolo;

public class Autorimessa extends Box {
    private Veicolo[] veicoli;
    private int testa;
    private int coda;
    private int riemp;

    public Autorimessa(int maxPosti, String nome) {
        super(maxPosti, nome);
        veicoli = new Veicolo[maxPosti];
    }

    public boolean autorimessaPiena() {
        return riemp == veicoli.length;
    }

    public boolean autorimessaVuota() {
        return riemp == 0;
    }

    @Override
    public void entra(Veicolo v) throws AutorimessaPienaException, TargaNonValidaException {
        if (!v.controllaTarga())
            throw new TargaNonValidaException("Targa " + v.getTarga() + " non valida. Ingresso vietato");

        if (autorimessaPiena())
            throw new AutorimessaPienaException("Autorimessa piena");

        veicoli[coda] = v;
        coda = (coda + 1) % veicoli.length; // quando coda + 1 == veicoli.length: coda = 0 (perchè il resto è 0)
        riemp++;
    }

    @Override
    public Veicolo esce() throws AutorimessaVuotaException {
        if (autorimessaVuota())
            throw new AutorimessaVuotaException("Autorimessa vuota");

        Veicolo v = veicoli[testa];
        veicoli[testa] = null;
        testa = (testa + 1) % veicoli.length; // quando testa + 1 == veicoli.length: testa = 0 (perchè il resto è 0)
        riemp--;
        return v;

    }

    @Override
    public String toString() {
        if (autorimessaVuota())
            return "Autorimessa vuota";

        String stringa = super.toString() + "\nVeicoli presenti:\n";
        for (Veicolo v : veicoli) {
            if (v != null)
                stringa += v.toString();
        }
        return stringa;
    }
}
