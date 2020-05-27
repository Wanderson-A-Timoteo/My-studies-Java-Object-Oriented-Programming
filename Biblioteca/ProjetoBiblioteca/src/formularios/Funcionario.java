package formularios;

import biblioteca.Biblioteca;
import biblioteca.Idao;
import biblioteca.Pessoa;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Funcionario extends Pessoa implements Idao{
    
    private int salario;
    
    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    @Override
    public void inserir() {
                String sql = "insert into funcionario (nome, cpf, idade, salario, endereco) values ('"+this.getNome()+"','"    
            +this.getCpf()+"',"+this.getIdade()+","+this.getSalario()+", '" +this.getEndereco()+"')";       
        
        System.out.println(sql);
        
        Biblioteca.con.executeSql(sql);

    }

    @Override
    public void excluir() {
            Biblioteca.con.executeSql("delete from funcionario where id_funcionario = " + this.getId());
    }

    @Override
    public void buscar(int id) {
        try{
            ResultSet rs = Biblioteca.con.openQuery("select * from funcionario where id_funcionario = " + id);
            
            if (rs.next()){
                this.setNome(rs.getString("nome"));                
                this.setIdade(Integer.parseInt(rs.getString("idade")));
                this.setCpf(rs.getString("cpf"));
                this.setEndereco(rs.getString("endereco"));
                this.setSalario(Integer.parseInt(rs.getString("salario")));
                this.setId(id);
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void atualizar() {
        String sql = "update funcionario set nome = '"+this.getNome()+"', idade = '"    
            +this.getIdade()+"', salario = "+this.getSalario()+", cpf = '"+this.getCpf()+"', endereco = '" +this.getEndereco()+"' where "
                    + "id_aluno = " + this.getId();
        Biblioteca.con.executeSql(sql);
    }

    
}
