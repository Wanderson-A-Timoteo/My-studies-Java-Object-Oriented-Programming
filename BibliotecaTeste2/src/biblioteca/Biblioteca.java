package biblioteca;

//Criando a conexão
import conexaomysql.ConexaoMySql;
import formularios.FrmCrud;

public class Biblioteca {

    public static ConexaoMySql con = new ConexaoMySql();

    public static void main(String[] args) {
        FrmCrud tela = new FrmCrud();
        tela.setVisible(true);
        
    }
    
}
