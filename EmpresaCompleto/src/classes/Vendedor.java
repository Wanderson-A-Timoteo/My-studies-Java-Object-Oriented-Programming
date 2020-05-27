/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Jivago
 */
public class Vendedor extends Funcionario {

    private float comissao;
    private float totalVendasMes;

    public Vendedor() {
        
    }
    
    public Vendedor(String nome, String cpf) {
        super(nome, cpf);
    }    
    
    @Override
    public float calcularSalario() {
        float totalComissao = totalVendasMes * comissao;
        float totalSalario = this.getSalario() + totalComissao;
        return totalSalario;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getTotalVendasMes() {
        return totalVendasMes;
    }

    public void setTotalVendasMes(float totalVendasMes) {
        this.totalVendasMes = totalVendasMes;
    }
    
    
    

    
    
    
    
}
