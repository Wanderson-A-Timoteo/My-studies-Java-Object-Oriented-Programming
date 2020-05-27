package loja2;

import classes.Produto;
import java.util.Scanner;

public class Loja2 {
    
    public static void main(String[] args) {
        
        Produto arroz;
        arroz = new Produto(); 
        arroz.setCod(1001);
        arroz.nome = "Arroz Crystal";
        
        Produto feijao;
        feijao = new Produto();
        feijao.setCod(1002);
        feijao.nome = "Feijão Carioca";
        feijao.setPreco(5.00f);
        
        Produto feijaoPreto;
        feijaoPreto = feijao;
        feijaoPreto.nome = "Feijão Preto";
        
        System.out.println(feijao.nome);
        
        Produto prod1 = new Produto();
        Produto prod2 = new Produto();
        Produto prod3 = new Produto();
        Produto prod4 = new Produto();
        
        Produto[] listaProdutos = new Produto[3];
//        listaProdutos[0] = new Produto();
//        listaProdutos[0].setCod(1003);
//        
//        if (listaProdutos[1] == null) {
//            System.out.println("O produto nessa posição do vetor ainda não foi instanciado");
//        }
//        else {
//            listaProdutos[1].setCod(1004);
//        }
        
        Scanner scan = new Scanner(System.in);

        for (int i=0;i<listaProdutos.length;i=i+1) {
            Produto prod = new Produto();
            System.out.println("Digite o código do produto");
            prod.setCod(scan.nextInt());
            System.out.println("Digite o nome do produto");
            prod.nome = scan.next();
            System.out.println("Digite o preço");
            prod.setPreco(scan.nextFloat());
            listaProdutos[i] = prod;
        }
        
        for (int i=0;i<listaProdutos.length;i=i+1) {
            System.out.println(listaProdutos[i].nome);
        }
        
           
        
        
    }
    
}
