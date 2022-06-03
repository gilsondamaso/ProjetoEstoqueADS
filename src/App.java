import java.util.Scanner;
import classes.Produto;
import classes.Produto2;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Produto prod = new Produto();      

        System.out.print("INFORME O NOME DO PRODUTO! ");        
        prod.nome = sc.nextLine();              
        System.out.print("INFORME O PREÇO DO PRODUTO! ");
        prod.preco = sc.nextDouble();        
        System.out.print("INFORME A QUANTIDADE DE PRODUTOS! ");
        prod.quantidade = sc.nextInt();            
        System.out.println("DADOS DO PRODUTO: ");        
        System.out.println(prod);

        System.out.print("DESEJA AUMENTAR O ESTOQUE EM QUANTAS UNIDADE? ");
        prod.AddProduto(sc.nextInt());
        System.out.println("------------------------------------");
        System.out.println("DADOS ATUALIZADOS DO PRODUTO: ");       
        System.out.println(prod);
        System.out.println("------------------------------------");

        System.out.print("DESEJA REMOVER QUANTAS UNIDADE DO ESTOQUE? ");
        prod.RemProduto(sc.nextInt());
        System.out.println("------------------------------------");
        System.out.println("DADOS ATUALIZADOS DO PRODUTO: ");       
        System.out.println(prod);
        System.out.println("------------------------------------");
        sc.close();
    }
}
