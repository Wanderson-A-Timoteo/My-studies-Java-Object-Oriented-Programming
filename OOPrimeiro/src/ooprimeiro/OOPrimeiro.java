package ooprimeiro;

public class OOPrimeiro {

    public static void main(String[] args) {
        System.out.println("Olá Mundo!");
        
        Aluno joao;
        joao = new Aluno();
        
        joao.nome = "João Silva";       
        joao.solicitarMatricula(11033);
        joao.solicitarMatricula(11034);
        joao.solicitarMatricula();
        joao.curso.nome = "Sistemas de Informações";
        joao.curso.cod = 316;
        
        Aluno ana = new Aluno("Ana Maria");
        System.out.println(ana.nome);
        
        
        

//System.out.println(joao.rga+" "+joao.nome);
        
        
        
        
        
        //int numero;
        
        
    }
    
}