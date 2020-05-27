package classes;

/**
 *
 * @author Jivago
 */
public class Analista extends Funcionario {
    
    private boolean cursoSuperior;
    private boolean certificacao;
    
    public Analista() {
        
    }
    
    public Analista(String nome, String cpf) {
        super(nome,cpf);
    }

    public float calcularSalarioOriginal() {
        return super.calcularSalario();
    }
    
    @Override
    public float calcularSalario() {
        float salarioBase = this.getSalario();
        float salarioTotal = this.getSalario();
        
        salarioTotal += this.cursoSuperior ? salarioBase*0.25f : 0;
        salarioTotal += this.certificacao ? salarioBase*0.25f : 0;
        
        return salarioTotal;
    }
    
    public boolean isCursoSuperior() {
        return cursoSuperior;
    }

    public void setCursoSuperior(boolean cursoSuperior) {
        this.cursoSuperior = cursoSuperior;
    }

    public boolean isCertificacao() {
        return certificacao;
    }

    public void setCertificacao(boolean certificacao) {
        this.certificacao = certificacao;
    }
    
}
