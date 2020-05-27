package primeiraheranca.classes;

public class Funcionario {
    
    public String nome;
    public String cpf;
    public String matricula;
    private float salario;
    
    
    public Funcionario() {
        System.out.println("Funcionario instanciado");
    }
    
    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
    
}
