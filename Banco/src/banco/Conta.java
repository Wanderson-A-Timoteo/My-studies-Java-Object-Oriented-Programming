package banco;

public class Conta {
    
    String nome;
    String cpf;
    double saldo;
    
    void saldo() {
System.out.println(""
        + "Olá "+nome+" ("+cpf+")"
        + "\n seu saldo é de: "+saldo);
    }
    
    void deposito(double valor) {
        saldo += valor;
        System.out.println("Deposito de "
                + "R$ "+valor+" realizado com sucesso!");
    }
    
    void saque(double valorSaque) {
        if (saldo >= valorSaque) {
            saldo -= valorSaque;
            System.out.println("Saque de"
                    + "R$ "+valorSaque
                    +" realizado com sucesso!");
        }
        else {
System.out.println("Você não tem saldo para realizar esse saque!");
        } 
    }
}
