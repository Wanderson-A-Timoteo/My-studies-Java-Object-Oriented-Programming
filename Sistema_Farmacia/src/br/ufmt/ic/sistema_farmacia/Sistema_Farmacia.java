/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.sistema_farmacia;



import br.ufmt.ic.sistema_farmacia.telas.FrmLogin;
import br.ufmt.ic.sistema_farmacia.util.ConexaoBD;

/**
 *
 * @author wanderson Timoteo, Roberto Passos e Rodrigo Moura
 */
public class Sistema_Farmacia {

    
    public static ConexaoBD conn = new ConexaoBD();
    
    public static void main(String[] args) {
        // TODO code application logic here
        FrmLogin tela = new FrmLogin();
        tela.setVisible(true);
    }    
        
    
}
