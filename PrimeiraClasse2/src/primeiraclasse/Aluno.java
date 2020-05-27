package primeiraclasse;

//Aluno é uma classe ou seja, é a abstração das características (propriedades ou atributos)
//e ações (métodos) de um conjunto de indivíduos.
//A seguir temos a implementação da classe aluno em JAVA
class Aluno {
    
    //nome, rga, curso e cpf são as características do grupo de indivídios que estamos representando
    //atributos sao semelhantes ao que aprendemos por variáveis. Os atributos ficam em um escopo 'global' dentro da classe
    String nome;
    int rga;
    String curso;
    String cpf;
    
    //na sequência temos a descrição das ações ou métodos
    
    //esse método que "não tem retorno" (nem void)
    //é um tipo de método "especial", chamado Método Construtor
    //que é executado na instanciação da classe...
    Aluno() {
        System.out.println("Aluno instanciado!");
    }
    
    //O método construtor tambem pode sofrer sobrecarga
    //é uma forma de 'escolhermos como queremos que o objeto seja instanciado' 
    Aluno(String nomeCompleto) {
        System.out.println(nomeCompleto);
    }
    
    Aluno(String nomeCompleto, String cpf) {
        
    }
    
    //descrevemos dois métodos, solicitarMatricula() e faltarAula()...
    String solicitarMatricula() {
        return "Matrícula solicitada";
    }
    
    //..sendo que foi feita uma "sobrecarga de métodos" no método faltarAula
    //a sobrecarga acontece quando temos métodos com o mesmo nome mas com assinatura diferente
    //por assinatura entendemos o tipo de retorno + tipo de parâmetros dos métodos
    void faltarAula(String motivo) {
        System.out.println(nome+" não pode comparecer a aula pois: "+motivo);
    }

    //a sobrecarga permite que tenhamos métodos de mesmo nome sem que eles entrem em conflito um com o outro
    void faltarAula(int CID) {
        System.out.println("O aluno "+nome+" está com atestado médico CID "+CID);
    }    

}