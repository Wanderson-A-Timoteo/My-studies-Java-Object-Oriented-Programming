package ooprimeiro;

class Aluno {
    
    String nome;
    String rga;
    boolean regular;
    Curso curso;
    
    //Aluno é um método construtor.
    //Métodos construtores são inicializados quando um objeto é instanciado
    //Forem feitas sobrecargas do método Construtor
    //Sobrecarga: mesmo nome porém assinatura diferente
    public Aluno() {
        System.out.println("Um aluno foi instanciado...");
        this.curso = new Curso();
    }
    
    public Aluno(String nome) {
        this.nome = nome;
        this.curso = new Curso();
    }
    
    public Aluno(String nome, String rga) {
        this.rga = rga;
        this.nome = nome;
        this.curso = new Curso();
    }
    
    void solicitarMatricula() {
        System.out.println("Solicitação de matrícula padrão");
    }
    
    void solicitarMatricula(int codDisciplina) {
        //int crMin = 5;
        System.out.println(this.nome+" solicita matrícula"
                +" na disciplina: "+codDisciplina);
    }
    
    
    
}