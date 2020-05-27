package br.ufmt.ic.alg3.alunobd.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexaoBD {
    
    private static final String _BDhost = "localhost"; 
    private static final String _BDname = "alg3";
    private static final String _BDuser = "root";
    private static final String _BDpass = "";
    
    public static Connection getConnection() {
        
        Connection conexao = null;
        
        String urlCon = "jdbc:mysql://"+_BDhost+":3306/"+_BDname;
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
            conexao = 
                DriverManager.getConnection(urlCon, _BDuser, _BDpass);
            
            //Statement stm;
            //stm = conexao.createStatement();
            
        } catch (SQLException e) {
            System.out.println("Erro: Não conectado ao Banco de Dados "
                                +e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Erro: Classe não encontrada");
        }
        
        return conexao;
        
    }
}
