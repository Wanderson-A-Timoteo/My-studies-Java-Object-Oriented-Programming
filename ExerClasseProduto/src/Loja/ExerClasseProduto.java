package Loja;


import java.util.Scanner;

public class ExerClasseProduto {


    public static void main(String[] args) {
        
        
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();
        Produto produto5 = new Produto();
        
        Produto[] listaProdutos;
        listaProdutos = new Produto[5];
        
        int quantidade = 0;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite quantos produtos: ");
        quantidade = scan.nextInt();
        
        listaProdutos = new Produto[quantidade];
        
        int codigo;
        String nome;
        float preco;
        
        for (int i=0; i<quantidade; i=i+1) {
            listaProdutos[i] = new Produto();
            System.out.println("Digite o código do produto "+(i+1));
            codigo = scan.nextInt();
            listaProdutos[i].setCodigo(codigo);
            
            
        }    
    }
    
}
