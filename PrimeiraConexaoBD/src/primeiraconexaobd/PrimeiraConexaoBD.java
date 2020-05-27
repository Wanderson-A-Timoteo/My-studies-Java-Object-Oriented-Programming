package primeiraconexaobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PrimeiraConexaoBD {

    public static void main(String[] args) {
        
        Connection con;
        
        String urlCon = "jdbc:mysql://localhost/alg3";
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        con = DriverManager
                .getConnection(urlCon, "root","");
        
                String strSql = "SELECT * FROM aluno ORDER BY nome ASC";
                
                String strInsert = " INSERT INTO aluno(rga,nome) VALUES ('10203','José Souza')";   
                
                Statement stm;
                stm = con.createStatement();
                
                stm.executeUpdate(strInsert);
                
                ResultSet rs = stm.executeQuery(strSql);
                
                while (rs.next() == true) {
                    System.out.println(rs.getString("nome"));
                }
                
        
        } catch (SQLException ex) {
        System.out.println("Erro conectando ao SGBD :"
                +ex.getMessage());
    } catch (ClassNotFoundException ex) {
        System.out.println("Erro carreganmdo uma classe : "
                +ex.getMessage());
    }
    }
    
}
