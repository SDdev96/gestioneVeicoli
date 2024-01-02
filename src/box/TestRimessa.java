package box;

import veicoli.*;

public class TestRimessa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Autorimessa a = new Autorimessa(5, "Parcheggio E1");

        // ----------------------------TEST ENTRATA AUTO--------------------------
        try {
            a.entra(new Camion("sdf244", "Fiat CX45", "Gasolio", "TT656671", 4));
        } catch (AutorimessaPienaException | TargaNonValidaException e) {
            e.printStackTrace();
        }
        try {
            a.entra(new Camion("spl265", "Volvo PTG", "Gasolio", "YH96671", 6));
        } catch (AutorimessaPienaException | TargaNonValidaException e) {
            e.printStackTrace();
        }
        try {
            a.entra(new Autovettura("mk23t", "Fiat Punto", "Metano", "EA566FM", 5));
        } catch (AutorimessaPienaException | TargaNonValidaException e) {
            e.printStackTrace();
        }
        try {
            a.entra(new Autovettura("cgt612", "Fiat Idea", "Gasolio", "AQ9Y7UUU", 5));
        } catch (AutorimessaPienaException | TargaNonValidaException e) {
            e.printStackTrace();
        }
        try {
            a.entra(new Moto("das7896", "Honda Hornet", "Benzina", "AT51233", false));
        } catch (AutorimessaPienaException | TargaNonValidaException e) {
            e.printStackTrace();
        }
        try {
            a.entra(new Moto("gdt7896", "Suzuki Bandit", "Benzina", "AT5123N", false));
        } catch (AutorimessaPienaException | TargaNonValidaException e) {
            e.printStackTrace();
        }
        try {
            a.entra(new Autovettura("abt135", "Audi a6", "Gasolio", "FF221GM", 2));
        } catch (AutorimessaPienaException | TargaNonValidaException e) {
            e.printStackTrace();
        }
        try {
            a.entra(new Autovettura("fcv555", "Suzuki Swift", "Metano", "CZ479AA", 4));
        } catch (AutorimessaPienaException | TargaNonValidaException e) {
            e.printStackTrace();
        }

        System.out.println(a);

        try {
            a.entra(new Autovettura("fcv555", "Suzuki Swift", "Metano", "CZ479AA", 4));
        } catch (AutorimessaPienaException | TargaNonValidaException e) {
            e.printStackTrace();
        }

        // ----------------------------TEST USCITA AUTO--------------------------
        try {
            a.esce();
        } catch (AutorimessaVuotaException e) {
            e.printStackTrace();
        }
        try {
            a.esce();
        } catch (AutorimessaVuotaException e) {
            e.printStackTrace();
        }
        try {
            a.esce();
        } catch (AutorimessaVuotaException e) {
            e.printStackTrace();
        }
        try {
            a.esce();
        } catch (AutorimessaVuotaException e) {
            e.printStackTrace();
        }
        try {
            a.esce();
        } catch (AutorimessaVuotaException e) {
            e.printStackTrace();
        }
        try {
            a.esce();
        } catch (AutorimessaVuotaException e) {
            e.printStackTrace();
        }
    }
}
