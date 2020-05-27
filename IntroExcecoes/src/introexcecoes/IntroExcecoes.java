
package introexcecoes;

public class IntroExcecoes {

    public static void main(String[] args) {
    
        int a, b, c;
        a = 5;
        b = 10;
        
        System.out.println("Variaveis declaradas");
        
        Aluno matheus = null;
        
        try{
            matheus.nome = "Matheus";
        } catch (Exception ex){
            System.out.println("Uma excecao foi disparada, porem foi tratada");
            
        } finally {
            
        }
        
       c = a + b;
       
       System.out.println(c);
              
       
    }
    
}
