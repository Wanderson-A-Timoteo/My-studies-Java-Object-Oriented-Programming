package sistemaacademico;

public class SistemaAcademico {

    public static void main(String[] args) {
    
        Aluno joao = new Aluno();
        acessarBiblioteca(joao);
               
    }
    
    public static void acessarBiblioteca(IAcessoBiblioteca b) {
        b.apresentarCredencialBiblioteca();
        
    }
}
