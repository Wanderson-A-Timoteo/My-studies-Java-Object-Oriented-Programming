package boncopassos;
import java.util.Scanner;

public class BoncoPassos {

/**
 *
 * @Wanderson Timoteo e Roberto Passos
 */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ola mundo #BancoPassos");
        
        //Para Ler do teclado
        Scanner scan = new Scanner (System.in);
        String nome, endereco;
        long cpf;
        System.out.println("Digite o nome do correntista:");
        nome = scan.nextLine();
        System.out.println("Digite o CPF do correntista:");
        cpf = scan.nextLong();
        System.out.println("Digite o endereço do correntista:");
        endereco = scan.nextLine(); 
        
        //Ciando novo cliente
        Cliente client01 = new Cliente();
        client01.nome = nome;
        client01.cpf = cpf;
        client01.endereco = endereco;
        
        System.out.println("Um cliente foi instanciado.");
        System.out.println("O nome informado foi: "+client01.nome+"\n"+"CPF: "+
                client01.cpf+"\n"+"O endereço informado foi:"+client01.endereco);
        
        
        
        //Instanciando a nova conta
        Conta cont01 = new Conta ();
        /*Atributos da classe conta!!! Deletar no Futuro        
        cont01.nome=nome;
        cont01.cpf=cpf;
        System.out.println("Uma Conta foi criada em nome de "+cont01.nome+"\n"+
                "informe o valor do primeiro deposito:"+"\n");*/
        
        //Instanciando a conta Especial       
        
        cont01.deposito(10000);
        
        cont01.saque(7478.99);
        
        cont01.saque(25000);
        
        cont01.deposito(2.37);
        
        cont01.saldo();
        
        cont01.deposito(-7894);
        
        cont01.deposito(1000000);
        
        cont01.saldo();
        
        //Dadoda da conta 02
        System.out.println("CONTA ESPECIAL \n");
        
         ContaEspecial cont02 = new ContaEspecial();
        
        cont02.deposito(cont01.saldo);
        
        cont02.saque(7478.99);
        
        cont02.saque(25000);
        
        cont02.deposito(2.37);
        
        cont02.saldo();
        
        cont02.deposito(-7894);
        
        cont02.deposito(1000000);
        
        cont02.saldo();
        
        //criando a conta poupanca
        System.out.println("CONTA POUPANÇA");
        
        ContaPoupanca cont3 = new ContaPoupanca (cont02.saldo);
        
        cont3.saldo();
        
       
        System.out.println("#BancoPassos Fechado");
        
    }
    
}
