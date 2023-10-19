public class Dono {
    private String  nome;
    private int id;

    public Dono(String nome, int i) {
        this.nome=nome;
        this.id=id;
    }

    //Fazer s lista dos pets
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

