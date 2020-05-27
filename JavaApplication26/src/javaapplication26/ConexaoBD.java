/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

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
 * @author wanderson
 */
public class ConexaoBD {
    
    private static String dbHost="jdbc:mysql:localhost:3306/alg3";
    private static String dbUser="root";
    private static String dbPass="";
    //private static String dbName="sql10261438";
   
    //jdbc:mysql://sql10.freemysqlhosting.net:314549/ql10261438
    
    public static Connection con;
    private String strCon = "jdbc:mysql://"
                +dbHost;//+":314549/"+dbName;
    
    public void conecta() {                
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(strCon,dbUser,dbPass);
       
        } catch(SQLException ex) {
           JOptionPane.showMessageDialog(null,"Falha ao conectar-se com o Banco de Dados:\n"+ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
     public void desconecta(){
        try {
            con.close();
            JOptionPane.showMessageDialog(null,"Desconectado do Banco de dados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel desconectar do Bnco de dados:\n"+ex.getMessage());
        }
    }
     
     public int executeSql(String sql){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(strCon,dbUser,dbPass); 
            Statement stm = con.createStatement();            
            return stm.executeUpdate(sql);
            
        }  catch (ClassNotFoundException | SQLException ex) {
               System.out.println("mensagem: " + ex.getMessage());
        }
        return 0;
    }
        
    public ResultSet openQuery(String sqlSelect){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(strCon,dbUser,dbPass);
            Statement stm = con.createStatement();
            return stm.executeQuery(sqlSelect);
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void executeUpdate(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PreparedStatement executeQuery(String select_top_1_id_FROM_clientes_ORDER_BY_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class ConexaoMySql {

        public ConexaoMySql() {
        }
    }

}
