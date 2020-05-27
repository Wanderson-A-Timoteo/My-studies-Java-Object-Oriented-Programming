package principal;

import java.util.Scanner;
import classes.Produto;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class Mercado {

    public static void main(String[] args) {
    
        int nProdutos;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Quantos produtos deseja cadastrar?");
        nProdutos = scan.nextInt();
        
        Produto[] listaProdutos;
        listaProdutos = new Produto[nProdutos]; //Não esta sendo instanciado ainda
        
               
        //listaProduto[0] = new Produto();
        Produto prod;
        for (int i=0; i<nProdutos; i++) {
          prod = new Produto();
          
          System.out.println("Digite o codigo do produto");
          prod.setCodigo(scan.nextInt());
            
          System.out.println("Digite o nome do produto");
          prod.setNome(scan.next());
            
          System.out.println("Digite o preço do produto");
          prod.setPreco(scan.nextDouble());
          listaProdutos[i] = prod;
            
            
            
            /*listaProdutos[i] = new Produto();
            System.out.println("Digite o codigo do produto");
            listaProdutos[i].setCodigo(scan.nextInt());
            
            System.out.println("Digite o nome do produto");
            listaProdutos[i].setNome(scan.next());
            
            System.out.println("Digite o preço do produto");
            listaProdutos[i].setPreco(scan.nextDouble();*/
            
        }
        System.out.println("== Lista de Produtos ==");
        NumberFormat nf = new DecimalFormat("#.##");
        
        for (int i=0; i<nProdutos; i++) {
            System.out.println(listaProdutos[i].getCodigo()+": "+listaProdutos[i].getNome()
                    +": "+listaProdutos[i].getPreco());
        }
    }
    
}
