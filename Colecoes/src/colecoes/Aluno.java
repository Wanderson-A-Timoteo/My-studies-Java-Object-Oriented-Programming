package colecoes;

/**
 *
 * @author wanderson
 */
public class Aluno {
    
    private String rga;
    private String nome;

    public Aluno(String rga, String nome) {
        this.rga = rga;
        this.nome = nome;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRga() {
        return rga;
    }

    public void setRga(String rga) {
        this.rga = rga;
    }
 
    
}
