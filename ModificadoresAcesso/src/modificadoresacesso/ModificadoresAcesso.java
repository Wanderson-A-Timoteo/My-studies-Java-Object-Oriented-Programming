package modificadoresacesso;

import java.util.Scanner;

public class ModificadoresAcesso {

    public static void main(String[] args) {
    
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        
        System.out.println("Digite o codigo do produto: ");
        int codigo;
        codigo = scan1.nextInt();
        
        System.out.println("Digite o nome do produto: ");
        String nome;
        nome = scan2.next();
        
        System.out.println("Digite o preco do produto: ");
        double preco;
        preco = scan3.nextInt();
        
        System.out.println("Codigo do produto: "+codigo);
        System.out.println("Nome do produto: "+nome);
        System.out.println("Preço do produto: "+preco);
    }
    
}
