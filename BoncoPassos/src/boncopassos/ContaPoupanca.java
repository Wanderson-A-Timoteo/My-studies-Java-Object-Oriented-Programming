/*
 Conta Poupança:
Dia de rendimento;
Taxa de rendimento;
Operação de saldo (calculado de forma atualizada).*/
package boncopassos;

/**
 *
 * @Wanderson Timoteo e Roberto Passos
 */

public class ContaPoupanca extends Conta {
    private  double saldoPoupanca;
    private final double taxaRendimento = 0.05;
    String dataRendimento = "01/01/2019";

    public ContaPoupanca(double saldo) {
        this.saldoPoupanca = saldo;

    }
    

    
    @Override
        String saldo () {
        //Atualizar saldo com rendimento
        this.saldoPoupanca += this.saldoPoupanca * taxaRendimento;
        System.out.println("A data de rendimento da sua poupança é "+ dataRendimento);
        System.out.println("O Seu saldo atualizado coms os rendimentos da poupança é de R$"
                + saldoPoupanca);
        return null;            
        }
      
        
        
    }