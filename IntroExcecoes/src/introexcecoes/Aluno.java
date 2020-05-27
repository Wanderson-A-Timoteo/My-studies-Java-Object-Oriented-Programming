
package introexcecoes;

public class Aluno {
    
    public String nome;
    float cr;
    
    public boolean realizarMatricula(int disciplina){
        
        if (cr >= 7){
            return true;
        }
        else{
            throw new Exception("Uma excecao disparada");
            
        }
        return false;
    }
}
