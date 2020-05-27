package cadastrarprodutosbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CadastrarProdutosBD {

    public static void main(String[] args) {
    
        Connection con;
        
        String urlCon = "jdbc:mysql://localhost/alg3";
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        con = DriverManager
                .getConnection(urlCon, "root","");
        
        }
    }
    
}
