package bancoprivate;

import java.util.Scanner;

public class BancoPrivate {

    public static void main(String[] args) {
    
            
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome;
        nome = scan.next();
        System.out.println("Nome: "+nome);
        // este é para criar um menu de opção
        
        
        
        
        ContaBancaria conta1 = new ContaBancaria();
        conta1.nome = "João Silva";
        conta1.cpf = "111.111.111-11";
        //conta1.saldo = 10000;
        //devido estar declarado como private ele da erro, 
        //para ser visivel ele precisa ser public
        
        
        conta1.deposito(100);
        conta1.saldo();
        conta1.saque(70);
        conta1.saque(40);
        
        
    }
    
}
