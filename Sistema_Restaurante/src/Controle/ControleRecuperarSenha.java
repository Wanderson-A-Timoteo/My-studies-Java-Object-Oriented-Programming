/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Dao.ConexaoBD;
import Modelo.ModeloRecuperarSenha;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author wande
 */
public class ControleRecuperarSenha {
    
    ConexaoBD conexao = new ConexaoBD();
    ModeloRecuperarSenha mod = new ModeloRecuperarSenha();
    
    public String RetornaPergunta(String nomeusuario) {
        conexao.conecta();
        String pergunta;
        
        conexao.executeSql("SELECT * FROM login WHERE nick_login = '"+nomeusuario+"'");
        
        try {
            pergunta = conexao.rs.getString("pergunta");
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erro ao buscar o usuario! \nErro: " +ex);
        }        
        return null;
    }
}
