package primeiraheranca;

import java.util.Scanner;
import primeiraheranca.classes.Analista;
import primeiraheranca.classes.Funcionario;
import primeiraheranca.classes.Vendedor;

public class PrimeiraHeranca {

    public static void main(String[] args) {
        
        Vendedor ana = new Vendedor();
        ana.nome = "Ana Joana Silva";
        ana.setSalario(2000);
        
        Funcionario joao = new Analista(); //?
        
        float pi = 3.1415f;
        int pii = (int) pi;
        
        Analista maria = (Analista) joao; 

        
        //joao.projeto = "Sistema Acadêmico";        
        //Analista maria = new Vendedor();
        
        
    }
    
}
