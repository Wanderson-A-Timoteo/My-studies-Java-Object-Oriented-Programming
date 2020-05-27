package biblioteca;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Wanderson
 */
public class Livro implements Idao {
    private int id;
    private String autor;
    private int dataLancamento;
    private int edicao;
    private String editora;
    private String titulo;

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(int dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void inserir() {        
                    
         String sql = "insert into livro (autor, datalancamento, edicao, editora, titulo) values ('"+this.autor+"','"    
            +this.dataLancamento+"','"+this.edicao+"','"+this.editora+ "','"+this.titulo+"')";
         
         Biblioteca.con.executeSql(sql);
            
    }

    @Override
    public void excluir() {
        Biblioteca.con.executeSql("Delete from livro where id_livro = "  + this.id);
    }

    @Override
    public void buscar(int id) {
        
        try{
            ResultSet rs = Biblioteca.con.openQuery("select * from livro where id_livro = " + id);
            
            if (rs.next()){
                
               
                this.id = Integer.parseInt(rs.getString("id_livro"));
                this.autor = rs.getString("autor");
                this.editora = rs.getString("editora");
                this.titulo = rs.getString("titulo");
                this.edicao = Integer.parseInt(rs.getString("edicao"));
                this.dataLancamento = Integer.parseInt(rs.getString("datalancamento"));
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void atualizar() {
        
        String sql = "update livro set titulo = '"+this.titulo+"', datalancamento = '"    
            +this.dataLancamento+"', editora = '"+this.editora+"', autor = '" +this.autor+
                "', edicao = " + this.edicao + " where id_livro = " + this.id;
        
        System.out.println(sql);
        
        Biblioteca.con.executeSql(sql); 
    }
    
    public static ArrayList<Livro> buscarTodos(){
        ArrayList<Livro> lista = new ArrayList();
        
        try{
            ResultSet rs = Biblioteca.con.openQuery("select * from livro ");
            
            while (rs.next()){
                
                Livro livro = new Livro();
                               
                livro.id = Integer.parseInt(rs.getString("id_livro"));
                livro.autor = rs.getString("autor");
                livro.editora = rs.getString("editora");
                livro.titulo = rs.getString("titulo");
                livro.edicao = Integer.parseInt(rs.getString("edicao"));
                livro.dataLancamento = Integer.parseInt(rs.getString("datalancamento"));
                
                lista.add(livro);
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }        
        
        return lista;        
    }
    
    
}
