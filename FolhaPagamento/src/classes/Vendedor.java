package classes;

public class Vendedor extends Funcionario {
    
    private double totalVendas;
    private double comissao;
    
    @Override
    public double calcularSalario() {
        //double salario = super.calcularSalario();
        double salario = this.getSalarioBase();
        salario += totalVendas * comissao;
        
        return salario;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    
    
    
}
