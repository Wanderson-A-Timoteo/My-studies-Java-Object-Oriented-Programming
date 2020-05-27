package primeiraclasse;

import java.util.Scanner;

public class PrimeiraClasse {
    
    //por hora, não se preocupem com as palavras 'public' e 'static'
    //isso ficará claro mais para frente
    //o método main() (ou função) é o método que será executado primeiro na nossa aplicação JAVA
    //semelhante ao int main() { } que fazíamos em C
    public static void main(String[] args) {
        
        System.out.println("Hello World! JAVA o/ ");
        
        //aqui declaramos 'uma variável' (as classes "servem como tipo") do tipo Aluno, que acamos de criar
        Aluno marcos;
        marcos = new Aluno(); //porém, antes de utilizarmos uma variável, precisamos instanciá-la
        
        //após instanciar, podemos utilizar todos os métodos e atributos da classe
        marcos.nome = "Marcos Silva";
        marcos.rga  = 201411316;
        marcos.faltarAula(310);
        
        //aqui temos outra instância da mesma classe...
        Aluno joao;
        joao = new Aluno("João Silva"); //...porém, utilizando um construtor diferente
        
        //esse trecho é para solicitar entrada de dados pelo usuário, semelhante ao scanf() em C 
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        marcos.nome = scn.next();
        
        System.out.println(marcos.nome+" - "+marcos.rga);
        
    }
    
}
