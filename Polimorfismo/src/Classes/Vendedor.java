package Classes;

public class Vendedor extends Funcionario {
    
    private float comissao;
    private float totalVendas;

    
    @Override
    public float calcularSalario() {
        return getSalario + (comissao*totalVendas);
    }
    
    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
    
    
    
}
