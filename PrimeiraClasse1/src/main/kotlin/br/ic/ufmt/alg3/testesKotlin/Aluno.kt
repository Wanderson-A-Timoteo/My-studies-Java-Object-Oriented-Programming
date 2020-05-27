package br.ic.ufmt.alg3.testesKotlin

class Aluno {

    var nome : String = "";
    var rga  : Int    = 0;
    var cpf  : String? = ""; //o '?' permite que 'null' seja atribuído à propriedade
                             //a linguagem Kotlin por padrão é 'Null Safety' mais informações: https://kotlinlang.org/docs/reference/null-safety.html
      
    //o init {} em kotlin não exatamente um método construtor, 
    //mas sim "blocos de inicialização" ... 
    init { 
        println("Aluno instanciado!");
    }
    
    //"blocos", no plural, pois é possível ter mais de um
    init {
        println("Outro bloco de inicializaçao");
    }
    
    //construtor sem parâmetros
    constructor() {
        
    }
    
    constructor(nome : String) {
        this.nome = nome;
    }
    
    constructor(nome : String, cpf : String) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    fun solicitarMatricula(disciplinaId : Int) {
        println("Matricula do aluno ${nome} solicitada na disciplina de código ${disciplinaId}");
    }
    
    fun faltarAula(motivo : String) {
        println("${nome} não pode comparecer a aula pois: ${motivo}");
    }
    
    fun faltarAula(CID : Int) {
        println("O aluno ${nome} está com atestado médico CID ${CID}");
    }

}