package exerciciocolecoes;

import java.util.HashSet;
import java.util.Set;

public class SetProdutos {
   
    public static void main(String[] args) {
        
        Produtos p1 = new Produtos(100,"Arroz", 11.90);
        Produtos p2 = new Produtos(200,"Feijão", 5.90);
        Produtos p3 = new Produtos(300,"Macarrão", 4.30);
        Produtos p4 = new Produtos(400,"Café", 5.99);
        Produtos p5 = new Produtos(500,"Açucar", 7.50);
        Produtos p6 = new Produtos(600, "Extrato de Tomate", 2.70);
        Produtos p7 = new Produtos(100,"Vinho", 19.90);
        
        Set<Produtos> produtosSet = new HashSet<>();
              
        produtosSet.add(p1);
        produtosSet.add(p2);
        produtosSet.add(p3);
        produtosSet.add(p4);
        produtosSet.add(p5);
        produtosSet.add(p6);
        produtosSet.add(p7);
        
        produtosSet.forEach((p) -> {
            System.out.println(p);
        });
       
    }
    
    
}
