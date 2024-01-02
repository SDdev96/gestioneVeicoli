package box;

import veicoli.Veicolo;

public abstract class Box {
    public int maxPosti;
    private String nome;

    public Box(int maxPosti, String nome) {
        this.maxPosti = maxPosti;
        this.nome = nome;
    }

    public abstract void entra(Veicolo v) throws BoxException;

    public abstract Veicolo esce() throws BoxException;

    @Override
    public String toString() {
        return "Nome box: " + nome + "\t- Capienza: " + maxPosti+"\n";
    }
}
