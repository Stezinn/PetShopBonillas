import collections.Animal;

public class Cachorro extends Animal {

    private String porte;

    public Cachorro(String nome, int id, String raca, String porte) {
        super(nome, id, raca, porte);
        this.porte = porte;
    }

    public String consultarPorte() {
        return ("Pequeno,Medio,Grande");

    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
}

