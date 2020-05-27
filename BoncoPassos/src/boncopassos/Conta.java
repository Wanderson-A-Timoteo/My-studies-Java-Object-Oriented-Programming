/*
AULA 03
A classe Conta terá os seguintes atributos: 
    cliente (dotipo Cliente), número da agência, número da conta, saldo. 
    Todos os atributos devem estar encapsulados.

Ter métodos para: 
    retornar saldo, fazer saque e fazer depósito. 

Respeitando as seguintes restrições:
    Caso o valor solicitado para saque seja maior que o saldo, deve retornar 
uma mensagem de erro informando a situação.
    Caso contrário deve-se subtrair o valor do saldo.

    O método para depósito deve somar valor ao saldo e não deve aceitar valores
negativos.

    Caso o valor do saldo seja maior que R$ 1.000.000,00 (um milhão) o saldo não 
deve ser retornado e sim uma mensagem “o saldo dessa conta só pode ser verificado 
por um gerente”.

*/

package boncopassos;

/**
 *
 * @Wanderson Timoteo e Roberto Passos
 */
public class Conta {
    String nome, cpf;
    Cliente cliente;
    /*Com o modificado private esta variavel só pode ser acessada dentro da
    classe conta*/
    protected double saldo;
    private long nConta, nAgencia;
    
    //atribui um valor a partir do qual o saldado da conte deve ser ocultado
    final double valorSaldoOculto=1000000;
    
    public Conta (){
        cliente = new Cliente();
    }
    
    public void deposito (double valorDeposito){
        if (valorDeposito >0){
            System.out.println("Operação DEPOSITO: \n"+"Seu saldo é de: R$"+saldo+
            "\n"+"Você fez um deposito de: R$"+valorDeposito+"\n");
            saldo+=valorDeposito;
            System.out.println("Seu saldo atualizado é de R$: "+saldo);
        }
        else {
            System.out.println("Você informou o deposide de R$:"+valorDeposito+"\n"+
                    "Este valor é invalido! Informe um valor maior que zero.");
        }
    }
    
    public void saque (double valorSaque){
        if (saldo >= valorSaque){
            System.out.println("Opração SAQUE:"+"\n"+"Seu saldo é de R$: "+ saldo
                    +"\n"+"Você fez um saque de R$: "+ valorSaque);
            saldo-=valorSaque;
            System.out.println("Seu saldo atualizado é de R$:"+saldo+"\n");            
        }
        else{
            System.out.println("Operação SAQUE:\n"+"Você não tem saldo suficiente "
                    + "para realizar o saque de R$:"+valorSaque+"\n"+"Seu saldo atual"
                            + "é de R$:"+saldo+"\n");
        }
    }
        
    String saldo () {
        if (saldo >= valorSaldoOculto){
            System.out.println("O saldo dessa conta só pode ser verificado por "
                    + "um gerente");
        }
        else{
            return "Ola "+nome+" CPF: "+cpf+"\n"+"Seu Sçado é de R$:"+saldo;
        }
        return null;
    }
    
    
    
}
