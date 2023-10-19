import collections.Animal;

public class Gato extends Animal {

    private boolean pelos;

    public Gato(String nome, int id, String raca, String porte) {
        super(nome, id, raca, porte);
        this.pelos =pelos;
    }

    public boolean isPelos() {
        return pelos;
    }

    public void setPelos(boolean pelos) {
        this.pelos = pelos;
    }
}



