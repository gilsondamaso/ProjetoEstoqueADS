package classes;

public class Produto2 {
    private String nome;
    private double preco;
    private int quantidade;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto2 [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }
    
}
