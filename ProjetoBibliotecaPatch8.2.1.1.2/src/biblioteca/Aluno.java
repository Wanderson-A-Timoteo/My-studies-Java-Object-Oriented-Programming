package biblioteca;

/**
 *
 * @author Wanderson
 */


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Aluno extends Pessoa implements Idao {

    @Override
    public void inserir() {
            
                
        String sql = "insert into aluno (nome, cpf, idade, endereco) values ('"+this.getNome()+"','"    
            +this.getCpf()+"',"+this.getIdade()+",'" +this.getEndereco()+"')";       
        
        System.out.println(sql);
        
        Biblioteca.con.executeSql(sql);
    }
    
    @Override
    public void excluir() {
        Biblioteca.con.executeSql("delete from aluno where id_aluno = " + this.getId());
    }

    @Override
    public void buscar(int id) {
        try{
            ResultSet rs = Biblioteca.con.openQuery("select * from aluno where id_aluno = " + id);
            
            if (rs.next()){
                this.setNome(rs.getString("nome"));                
                this.setIdade(Integer.parseInt(rs.getString("idade")));
                this.setCpf(rs.getString("cpf"));
                this.setEndereco(rs.getString("endereco"));
                this.setId(id);
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void atualizar() {        
        
        String sql = "update aluno set nome = '"+this.getNome()+"', idade = '"    
            +this.getIdade()+"', cpf = '"+this.getCpf()+"', endereco = '" +this.getEndereco()+"' where "
                    + "id_aluno = " + this.getId();
        Biblioteca.con.executeSql(sql);
    }
    
    public static ArrayList<Aluno> buscarTodos(){
        ArrayList<Aluno> lista = new ArrayList();
        
        try{
            ResultSet rs = Biblioteca.con.openQuery("select * from aluno");
            
            while (rs.next()){
                
                Aluno aluno = new Aluno(); 
                aluno.setNome(rs.getString("nome"));
                aluno.setIdade(Integer.parseInt(rs.getString("idade")));
                aluno.setCpf(rs.getString("cpf"));
                aluno.setEndereco(rs.getString("endereco"));
                aluno.setId(Integer.parseInt(rs.getString("id_aluno")));
                lista.add(aluno);
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
    }
    
    
}
