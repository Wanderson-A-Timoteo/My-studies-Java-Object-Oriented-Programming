/*
valor do limite especial
operação de saldo completa (exibindo também o limite)
operação de saque (permitindo sacar também o limite)
*/
package boncopassos;

/**
 *
 * @Wanderson Timoteo e Roberto Passos
 */
public class ContaEspecial extends Conta {
    private double limiteEspecial = 1000;
    
        
    /*public ContaEspecial (){
        Conta conta = new Conta();
    }*/
    
    
    
    @Override
     String saldo (){
        return super.saldo()+limiteEspecial;       
    }
    
    @Override
    public void saque(double valorSaque){
        if ((super.saldo+limiteEspecial)>= valorSaque){
            System.out.println("Opição SAQUE ESPECIAL: \n"
                    + "Seu saldo é de R$: "+ super.saldo()+"\n"+"Você fez um saque de R$:"
            +valorSaque);
            super.saldo-=valorSaque;
            System.out.println("Seu saldo atualizado é de R$: "+ saldo());           
        }
        
    }
    
    
}
