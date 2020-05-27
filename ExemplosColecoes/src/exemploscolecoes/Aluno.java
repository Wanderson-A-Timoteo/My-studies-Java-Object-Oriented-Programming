package exemploscolecoes;

public class Aluno implements Comparable {
    
    private String nome;
    private String rga;

    public Aluno() {
    }

    public Aluno(String nome, String rga) {
        this.nome = nome;
        this.rga = rga;
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
    
    @Override
    public String toString() {
       return "Aluno: "+this.nome+" rga: "+this.rga;
    }

    @Override
    public int compareTo(Object outroAluno) {
        outroAluno = (Aluno) outroAluno;
        if (this.rga.equals(((Aluno) outroAluno).getRga())) {
            return 0;
        }
        return 1;
    }
    
    @Override
    public boolean equals(Object outroAluno) {
         outroAluno = (Aluno) outroAluno;
        if (this.rga.equals(((Aluno) outroAluno).getRga())) {
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Integer.parseInt(rga);
    }
    
}
