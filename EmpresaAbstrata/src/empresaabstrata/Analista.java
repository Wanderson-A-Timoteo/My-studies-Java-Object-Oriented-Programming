package empresaabstrata;


public class Analista extends Funcionario {
    
    @Override
    public float calcularSalario() {
        return this.getSalario();
    }
    
}
