package veiculo;

/**
 *
 * @Wanderson Timoteo e Roberto Passos
 */
import classes.Carro;
import classes.Motor;

public class Veiculo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Teste Motor
        Motor TestMoto = new Motor (3);
        Motor TestMoto2 = new Motor (2);
        //Teste criar carro
        Carro TestCarro = new Carro (1.6, "Etios", "Toyota");
        
        //teste para ligar o carro:
        TestCarro.setLigarDesligar(true);
        TestCarro.setLigarDesligar(true);
        
        //teste pada desligar o carro:
        TestCarro.setLigarDesligar(false);
        TestCarro.setLigarDesligar(false);
        
        //teste para ligar o carro:
        TestCarro.setLigarDesligar(true);
        
        //teste aumentar velocidade        
        TestCarro.aumentarVelocidadeAtual();
        TestCarro.aumentarVelocidadeAtual();
        TestCarro.aumentarVelocidadeAtual();
        TestCarro.aumentarVelocidadeAtual();
        
        //teste status        
        TestCarro.status();
        
        //teste aumentar velocidade  
        TestCarro.aumentarVelocidadeAtual();
        TestCarro.aumentarVelocidadeAtual();
        TestCarro.aumentarVelocidadeAtual();
        TestCarro.aumentarVelocidadeAtual();
        TestCarro.aumentarVelocidadeAtual();
        TestCarro.aumentarVelocidadeAtual();
        
        //teste diminuir velocidade        
        TestCarro.diminuirVelocidadeAtual();
        TestCarro.diminuirVelocidadeAtual();
        TestCarro.diminuirVelocidadeAtual();
        TestCarro.diminuirVelocidadeAtual();
        TestCarro.diminuirVelocidadeAtual();
        
        //teste pada desligar o carro:
        TestCarro.setLigarDesligar(false);
        
        //teste diminuir velocidade 
        TestCarro.diminuirVelocidadeAtual();
        TestCarro.diminuirVelocidadeAtual();
        TestCarro.diminuirVelocidadeAtual();
        TestCarro.diminuirVelocidadeAtual();
        TestCarro.diminuirVelocidadeAtual();
        TestCarro.diminuirVelocidadeAtual();
        
        //teste status        
        TestCarro.status();
        
    }
    
    
}
