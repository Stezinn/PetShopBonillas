package collections;

public class Animal {


    private String nome;
    private int id;
    private String raca ;

    public Animal(String nome, int id, String raca, String porte) {
        this.nome =nome;
        this.id=id;
        this.raca=raca;

    }

    public Animal(String nome, String raca, int id) {
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

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }



}
