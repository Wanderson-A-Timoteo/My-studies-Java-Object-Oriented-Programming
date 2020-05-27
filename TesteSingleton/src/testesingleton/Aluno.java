package testesingleton;

public class Aluno {
   
    private static Aluno instancia;
    
    private Aluno() {
               
    }
    
    public static Aluno getInstance() {
         if (instancia == null) {
             instancia = new Aluno();
         }
        return instancia;
    }
}
