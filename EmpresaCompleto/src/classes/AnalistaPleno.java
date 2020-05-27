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
public class AnalistaPleno extends Analista {
    
    private int produtividade;

    @Override
    public float calcularSalario() {
        
        float salarioBase = super.calcularSalario(); //salário base de um analista
        float salarioTotal=0;              
        
        float percProdutividade = (produtividade*0.10f);
        
        salarioTotal += salarioBase + percProdutividade; 
        
        return salarioTotal;
    }

    public int getProdutividade() {
        return produtividade;
    }

    public void setProdutividade(int produtividade) {
        this.produtividade = produtividade;
    }
    
    
    
}
