package classes;

public class Analista extends Funcionario {
    
    boolean nivelSuperior;
    boolean certificacao;
    
    public Analista() {
        
    }
    
    public Analista(String nome) {
        this.setNome(nome);
    }
    
    @Override
    public double calcularSalario() {
        double salario = this.getSalarioBase();
        
        if (nivelSuperior) { // == true
            salario += this.getSalarioBase()*0.2;
        }
        
        if (certificacao) {
            salario += this.getSalarioBase()*0.2;
        }
        
        return salario;
    }

    public boolean isNivelSuperior() {
        return nivelSuperior;
    }

    public void setNivelSuperior(boolean nivelSuperior) {
        this.nivelSuperior = nivelSuperior;
    }

    public boolean isCertificacao() {
        return certificacao;
    }

    public void setCertificacao(boolean certificacao) {
        this.certificacao = certificacao;
    }
    
    
    
}
