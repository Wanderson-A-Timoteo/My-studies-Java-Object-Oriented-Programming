
package classeabstrata;

public abstract class Funcionario {
    
    
    private String nome;
    private String cpf;
    private Float salario;
    
      
    public abstract float calcularSalario();

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

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }
        
    

    }
