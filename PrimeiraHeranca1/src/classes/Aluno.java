package classes;

public class Aluno extends Pessoa {
    
    public String rga;
    public String curso;
    private String nome;
    
    
   public Aluno() {
       super(123);
   }
        
    public void setNomeA(String nome) {
        this.nome = nome;
        super.setNome(nome);
    }
}
