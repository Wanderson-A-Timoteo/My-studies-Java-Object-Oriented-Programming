package exerciciocolecoes;

import java.util.HashMap;
import java.util.Map;

public class ConsumidorHashMap {

    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor(" Wanderson Timóteo ", "123.456.789.10");
        Consumidor consumidor2 = new Consumidor(" Prof. Jivago ", "109.876.543.21");
        
        Produtos p1 = new Produtos(100," Arroz ", 11.90);
        Produtos p2 = new Produtos(200," Feijão ", 5.90);
        Produtos p3 = new Produtos(300," Macarrão ", 4.30);
        Produtos p4 = new Produtos(400," Café ", 5.99);
        Produtos p5 = new Produtos(500," Açucar ", 7.50);
        Produtos p6 = new Produtos(600," Extrato de Tomate ", 2.70);
        
        
        Map<Consumidor, Produtos> map = HashMap<>();
        map.put(consumidor, p2);
        map.put(consumidor2, p4);
        
        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey().getNome() +" - "+entry.getValue().getNome());
        });        
        
    }
    
    
}
