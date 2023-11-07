import collections.Animal;
import java.util.ArrayList;

public class Dono {
    private String  nome;
    private int id;


    ArrayList<Animal> animals;

    public Dono(String nome, int i) {
        this.nome = nome;
        this.animals = new ArrayList<>();
        this.id=id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

