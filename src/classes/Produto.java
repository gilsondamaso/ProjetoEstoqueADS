package classes;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double ValorTotal(){
        return preco * quantidade;        
    }
    //this
    public void AddProduto(int qtd){
        this.quantidade += qtd;        
    }

    public void RemProduto(int qtd){
        this.quantidade -= qtd;        
    }
    
    @Override
    public String toString() {        
        return nome 
        + ", R$ "
        + String.format("%.2f", preco)  
        + ", "
        + quantidade
        + " unidades, Valor Total: R$ "
        + String.format("%.2f",ValorTotal());
    }    
}
