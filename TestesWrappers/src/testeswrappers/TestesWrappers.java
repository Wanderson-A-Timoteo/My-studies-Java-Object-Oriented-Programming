/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeswrappers;

/**
 *
 * @author Jivago
 */
public class TestesWrappers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a;        //int é um tipo primitivo, um tipo inteiro de 32bits
        Integer b;    //Integer por sua vez, é uma classe (Wrapper) "usada como um tipo"
                      //É exatamente a mesma coisa que fazemos ao declara um objeto do tipo aluno: "Aluno pedro"
        
        float c;
        Float d;
        
        char e;
        Character f;
        
        String nome;
        
        //nome.equals(nome);
        
        String g;
        
        String nomeAluno = "João Silva"; //Esse processo de "atribuição direta" é chamado de "encaxotamento"
        //Aluno joao = "João Silva";     //No caso de uma classe 'nossa', não é possível uma atribuição direta (ou encaixotamento)
        
        Integer rga = 511;
        
        long soma = rga + 10; //repare que o rga é um objeto do tipo Integer (e não um tipo primitivo) então para somar, a JVM faz o "desencaixotamento"
        
        //System.out.println(soma);
        
        //ampliar((int)soma);
        
        byte x = 5;
        short y = 5;
        long w  = 5;
        float z = 5.0f;
        
        ampliar(x); //x é do tipo byte (8bits) mas não temos sobrecarga do método ampliar() 
                    //recebendo um atributo byte. 
                    //Nesse caso, a JVM faz uma "ampliação", 
                    //ampliando o tipo para o mais próximo (que no caso é o int)
                    //repare que não foi para o Short, pois o Short é uma classe (Wrapper) e não um tipo primitivo
                    //no tipo primitivo inteiro (int) é garantido que serão 32bits, mas uma classe, com seus métodos e atributos, pode ter um custo muito maior
        
        //esse trecho é para mostrar que a ampliação é um processo "natural"...
        long contaAnderson = 9223372036854775807l;
        mostrarSaldo((int)contaAnderson);
        //todavia, o contrário de ampliação (que seria o casting) é um processo "forçado"
        //pois o casting pode causar perda de valores (e a ampliação não) então para fazer casting, 
        //o desenvolvedor tem que tornar explicito para o compilador/interpretador que ele quer "correr esse risco"
        
        //utilizando a notação "..." podemos passar 1 ou n argumentos
        variaveisVariaveis(10);
        variaveisVariaveis(10,15);
        variaveisVariaveis(10,15,1);
        
    }
    
    
    public static void mostrarSaldo(int saldo) { //mostrarSaldo por padrão recebe um inteiro, então tivemos que fazer um casting para passar um long
        System.out.println("Saldo: "+saldo);
    }
    
    public static void ampliar(Short n) {
        System.out.println("Short(Wrapper) "+n);
    }    
    
    public static void ampliar(int n) {
        System.out.println("Int "+n);
    }
    
    public static void ampliar(long n) {
        System.out.println("Long "+n);
    }
    
    public static void ampliar(double n) {
        System.out.println("Double "+n);
    }
    
    public static void 
        variaveisVariaveis(int...a) {
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }   
    }
    
    
}
