package alunoabstrato;

public class Graduacao extends Aluno implements Universidade {
    
    double cr;
    
    @Override
    public boolean solicitarMatricula() {
        if (cr >= 7) {
            return true;
            
        }
        return false;
        
    }
    
    @Override
    public boolean acessarBiblioteca() {
        return true;
    }
    
}
