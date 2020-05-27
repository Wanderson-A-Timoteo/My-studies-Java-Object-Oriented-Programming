package classes;

public class Pessoa {
    
    private String nome;
    private String cpf;
    private String rg;


    public Pessoa() {
        System.out.println("Pessoa instanciada");
    }  

    public Pessoa (int numero) {
    
}
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
    
}
