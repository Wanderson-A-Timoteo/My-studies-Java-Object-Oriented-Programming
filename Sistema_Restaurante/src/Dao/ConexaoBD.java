/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author wanderson Timoteo, Roberto Passos e Rodrigo
 */
public class ConexaoBD {
    
    private static final String _BDhost = "localhost"; 
    private static final String _BDname = "restaurante";
    private static final String _BDuser = "root";
    private static final String _BDpass = "";
    public ResultSet rs;//armazena o resultado de uma pesquisa no BD
    public Statement stm; //realiza pesquisa no BD
    public Connection conn;
        
        private final String strCon = "jdbc:mysql://"
                +_BDhost+":3306/"+_BDname;
    
    public void conecta() {                
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(strCon,_BDuser,_BDpass);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } catch(SQLException ex) {
           JOptionPane.showMessageDialog(null,"Falha ao conectar-se com o Banco de Dados:\n"+ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
     public void desconecta(){
        try {
            conn.close();
            JOptionPane.showMessageDialog(null,"Desconectado do Banco de dados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel desconectar do Banco de dados:\n"+ex.getMessage());
        }
    }
     
     public int executeSql(String sql){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(strCon,_BDuser,_BDpass); 
            stm = conn.createStatement();            
            return stm.executeUpdate(sql);
            
        }  catch (ClassNotFoundException | SQLException ex) {
               System.out.println("mensagem: " + ex.getMessage());
        }
        return 0;
    }
        
    public ResultSet openQuery(String sqlSelect){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(strCon,_BDuser,_BDpass);
            stm = conn.createStatement();
            return stm.executeQuery(sqlSelect);
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void executeUpdate(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PreparedStatement executeQuery(String select_top_1_id_FROM_clientes_ORDER_BY_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
