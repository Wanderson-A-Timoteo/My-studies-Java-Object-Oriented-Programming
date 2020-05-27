package exerciciocolecoes;

import java.util.ArrayList;


public class ExercicioColecoes {

    public static void main(String[] args) {
        
        ArrayList<Produtos> produto = new ArrayList<>();
        
        Produtos p1 = new Produtos(100," Arroz ", 11.90);
        Produtos p2 = new Produtos(200," Feijão ", 5.90);
        Produtos p3 = new Produtos(300," Macarrão ", 4.30);
        Produtos p4 = new Produtos(400," Café ", 5.99);
        Produtos p5 = new Produtos(500," Açucar ", 7.50);
        Produtos p6 = new Produtos(600," Extrato de Tomate ", 2.70);

        produto.add(p1);
        produto.add(p2);
        produto.add(p3);
        produto.add(p4);
        produto.add(p5);
        produto.add(p6);

        produto.forEach((produtos) -> {
            System.out.println(produtos);
        });

    }
}
