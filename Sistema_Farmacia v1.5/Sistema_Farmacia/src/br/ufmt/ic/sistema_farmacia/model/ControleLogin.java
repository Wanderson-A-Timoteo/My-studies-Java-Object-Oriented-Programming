/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.sistema_farmacia.model;


import br.ufmt.ic.sistema_farmacia.util.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;




/**
 *
 * @author wanderson Timoteo, Roberto Passos e Rodrigo Moura
 */
public class ControleLogin {
    
    ConexaoBD conn = new ConexaoBD();
    
    public boolean validaLogin(ModeloLogin modLog){
        
        conn.conecta();
        
        
        
        if ((modLog.getLogin() != null) && (modLog.getSenha()!= null) && (!modLog.getSenha().equals(""))) {
            
            String sqlLogin = "SELECT * FROM login WHERE nick_login = '"+ modLog.getLogin()+"'";
            
            conn.executeSql(sqlLogin);
            
            try{
                conn.rs.first();
                
                if (conn.rs.getString("nick_login")== modLog.getLogin()&& 
                        conn.rs.getString("senha")== modLog.getSenha()) {
                    
                    return true;
                }
            }catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null," Erro ao buscar o usuario!\n"+ex);
                return false;
            }                                   
            return true;
        } else {
              return false;  
        }
        //return true;
    }
}