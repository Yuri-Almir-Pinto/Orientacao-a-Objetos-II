import java.util.ArrayList;

public class clienteAtividade {
    private int id;
    private String nome;
    private int idade;
    private ArrayList<Float> orçamentos = new ArrayList<Float>();
    private static int idAtual = 0;

    public clienteAtividade() {
        this.id = idAtual;
        idAtual += 1;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public ArrayList<Float> getOrçamentos() {
        return orçamentos;
    }
    public void setOrçamento(Float orçamento) {
        orçamentos.add(orçamento);
    }

}
