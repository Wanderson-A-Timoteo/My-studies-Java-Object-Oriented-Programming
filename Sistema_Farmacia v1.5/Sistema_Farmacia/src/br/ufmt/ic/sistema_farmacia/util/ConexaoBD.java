/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.sistema_farmacia.util;

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
 * @author wanderson Timoteo, Roberto Passos e Rodrigo Moura
 */
public class ConexaoBD {//Metodo para conexão com o Banco de Dados
    
    private static final String _BDhost = "localhost"; 
    private static final String _BDname = "farmaciabd";
    private static final String _BDuser = "root";
    private static final String _BDpass = "";
    

    //public static String sql2="insert into "+tabela+" "+dados+"values"+""+values+"";
    
 
    public Connection con;//Realiza a conexão com o Banco de Dados
    public Statement stm;//Realiza pesquisa no Banco de Dados
    public ResultSet rs;//Armazena o resultado de uma pesquisa feita pelo statement
        
        private final String strCon = "jdbc:mysql://"
                +_BDhost+":3306/"+_BDname;
    
    public void conecta() {                
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(strCon,_BDuser,_BDpass);
       
        } catch(SQLException ex) {
           JOptionPane.showMessageDialog(null,"Falha ao conectar-se com o Banco de Dados:\n"+ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
     public void desconecta(){
        try {
            con.close();
            JOptionPane.showMessageDialog(null,"Desconectado do Banco de dados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não foi possivel desconectar do Banco de dados:\n"+ex.getMessage());
        }
    }
     
     public int executeSql(String sql){
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(strCon,_BDuser,_BDpass); 
            stm = con.createStatement(); 
            rs = stm.executeQuery(sql);
            //rs = stm.executeUpdate(sql);
            rs.last();
            int rows = rs.getRow();
            rs.beforeFirst();
            return rows;
        }  catch (ClassNotFoundException | SQLException ex) {
               System.out.println("mensagem: " + ex.getMessage());
        }
        return 0;
    }
        
    public ResultSet openQuery(String sqlSelect){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(strCon,_BDuser,_BDpass);
            stm = con.createStatement();
            return stm.executeQuery(sqlSelect);
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    

    public void executeInsert(String tabela, String dados, String valores) {
            try
            {
                con = DriverManager.getConnection(strCon,_BDuser,_BDpass);
               // String sql = "insert into cliente (nome,cpf,idade,endereco) values(?,?,?,?)";
                String sql="insert into "+tabela+" "+dados+"values"+""+valores+"";
                System.out.println(sql);

                @SuppressWarnings("LocalVariableHidesMemberVariable")
                Statement stm = con.createStatement();
                stm.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null,tabela+" inserido com sucesso");

            }
            catch(SQLException e)
            {
                e.getMessage();
            }
    }
    public PreparedStatement executeQuery(String select_top_1_id_FROM_clientes_ORDER_BY_id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public boolean executeDelete(String tabela, int id)
    {
        Integer id_string=id;
        String sql_delete = "delete from "+tabela+" where id_"+tabela+" = "+id_string.toString();
        System.out.println(sql_delete);
        try
        {
        con = DriverManager.getConnection(strCon,_BDuser,_BDpass);
        Statement stmt = con.createStatement();
        stmt.executeUpdate(sql_delete);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"fuen");
        }
        
        
        return true;
    }
    
    
}

 
