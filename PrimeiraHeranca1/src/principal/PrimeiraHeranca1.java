package principal;

import classes.Aluno;
import classes.Pessoa;

public class PrimeiraHeranca1 {

    public static void main(String[] args) {
        
        Aluno joao = new Aluno();
        joao.setNome("João Silva");
        joao.rga = "20191";
        
        
        Pessoa ana = new Aluno();
        
        //int numero = (int) 3.15f;
        
        ((Aluno) ana).rga = "20192";
        
               
    }
    
}
