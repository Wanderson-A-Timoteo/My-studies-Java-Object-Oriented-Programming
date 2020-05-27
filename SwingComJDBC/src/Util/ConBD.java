package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConBD {
    
    private static Connection con;
    
    public static Connection
            getConnection() {
                
String urlCon = "jdbc:mysql://localhost/alg3";
 
try {
 
    Class.forName("com.mysql.jdbc.Driver");
 
    con = DriverManager
        .getConnection(urlCon,"root","root");

} catch (SQLException ex) {
    System.out.println("Erro conectando ao SGBD :"
                +ex.getMessage());
} catch (ClassNotFoundException ex) {
    System.out.println("Erro carregando uma classe :"
                +ex.getMessage());            
}                    
                
       return con;         
    }
    
    
}