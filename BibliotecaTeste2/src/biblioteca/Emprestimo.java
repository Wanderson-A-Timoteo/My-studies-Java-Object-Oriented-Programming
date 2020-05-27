package biblioteca;

import formularios.Funcionario;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Emprestimo implements Idao{
    private int id;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private Aluno aluno;
    private Livro livro;
    private Double multa;
    private Funcionario funcionario;

    public int getId() {
        return id;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getMulta() {
        return 3.99;//Criar regra de negocio        
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public void inserir() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        
        String dataDevolucaoStr = null;
        if (this.dataDevolucao != null){
            dataDevolucaoStr = sdf.format(this.dataDevolucao);
            dataDevolucaoStr = "\""+dataDevolucaoStr+"\"";                    
        }
        
        String dataEmprestimoStr = null;
        if (this.dataEmprestimo != null){
            dataEmprestimoStr = sdf.format(this.dataEmprestimo);
            dataEmprestimoStr = "\""+dataEmprestimoStr+"\"";                    
        }

        
        String sql = "insert into emprestimo (id_funcionario, id_aluno, id_livro, multa, dataemprestimo, dataDevolucao) values ("
                + this.funcionario.getId() + ", " + this.aluno.getId() + ", " + this.livro.getId() + ", " + this.getMulta() + ", " + dataEmprestimoStr + "," + dataDevolucaoStr + ")";
        Biblioteca.con.executeSql(sql);
    }
      

    @Override
    public void excluir() {
        Biblioteca.con.executeSql("delete from emprestimo where id_emprestimo = " + this.id);
    }

    @Override
    public void buscar(int id) {
        try{
            ResultSet rs = Biblioteca.con.openQuery("select * from emprestimo where id_emprestimo = " + id);
            if (rs.next()){
                this.id = Integer.parseInt(rs.getString("id_emprestimo"));
                this.aluno = new Aluno();
                this.aluno.buscar(Integer.parseInt(rs.getString("id_aluno")));
                this.livro = new Livro();
                this.livro.buscar(Integer.parseInt(rs.getString("id_livro")));

                String dataDevolucaoStr = rs.getString("datadevolucao");
                if (dataDevolucaoStr != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    this.dataDevolucao = sdf.parse(dataDevolucaoStr);
                }
                
                String dataEmprestimoStr = rs.getString("dataemprestimo");
                if (dataEmprestimoStr != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    this.dataEmprestimo = sdf.parse(dataEmprestimoStr);
                }
                this.multa = Double.valueOf(rs.getString("multa"));
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void atualizar() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        
        String dataDevolucaoStr = null;
        if (this.dataDevolucao != null){
            dataDevolucaoStr = sdf.format(this.dataDevolucao);
            dataDevolucaoStr = "\""+dataDevolucaoStr+"\"";                    
        }
        
        String dataEmprestimoStr = null;
        if (this.dataEmprestimo != null){
            dataEmprestimoStr = sdf.format(this.dataEmprestimo);
            dataEmprestimoStr = "\""+dataEmprestimoStr+"\"";                    
        }
        
        
        String sql = "update emprestimo set id_aluno = " + this.aluno.getId() + " , id_livro = " + this.livro.getId()
            + " , dataemprestimo = " + dataEmprestimoStr + ", datadevolucao = " + dataDevolucaoStr + ", multa = " + this.getMulta()
            + " where id_emprestimo = " + this.id;
        Biblioteca.con.executeSql(sql); 
    }
    
    public static ArrayList<Emprestimo> buscarTodos(){
        ArrayList<Emprestimo> lista = new ArrayList();
        
        try{
            ResultSet rs = Biblioteca.con.openQuery("select * from emprestimo");
            while (rs.next()){
                
                Emprestimo emprestimo = new Emprestimo();
                
                emprestimo.id = Integer.parseInt(rs.getString("id_emprestimo"));
                emprestimo.aluno = new Aluno();
                emprestimo.aluno.buscar(Integer.parseInt(rs.getString("id_aluno")));
                emprestimo.livro = new Livro();
                emprestimo.livro.buscar(Integer.parseInt(rs.getString("id_livro")));
                
                String dataDevolucaoStr = rs.getString("datadevolucao");
                if (dataDevolucaoStr != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    emprestimo.dataDevolucao = sdf.parse(dataDevolucaoStr);
                }
                
                String dataEmprestimoStr = rs.getString("dataemprestimo");
                if (dataEmprestimoStr != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    emprestimo.dataEmprestimo = sdf.parse(dataEmprestimoStr);
                }
                emprestimo.multa = Double.valueOf(rs.getString("multa"));
                
                lista.add(emprestimo);
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
