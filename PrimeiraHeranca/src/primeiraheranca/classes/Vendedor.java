package primeiraheranca.classes;

public class Vendedor extends Funcionario {
    
    
    public Vendedor() {
        System.out.println("Vendedor instanciado!");
    }
    
    public Vendedor(float comissao) {
        this.comissao = comissao;
    }
    
    public float comissao;
    
}
