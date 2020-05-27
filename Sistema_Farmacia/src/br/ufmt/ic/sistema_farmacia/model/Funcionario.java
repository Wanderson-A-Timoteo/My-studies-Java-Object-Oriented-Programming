/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.sistema_farmacia.model;

import br.ufmt.ic.sistema_farmacia.Sistema_Farmacia;
import br.ufmt.ic.sistema_farmacia.model.dao.FarmaciaDao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author wanderson Timoteo, Roberto Passos e Rodrigo Moura
 */
public class Funcionario extends Pessoa implements FarmaciaDao{

    private double salario;

    public Funcionario(double salario, int id, String nome, int idade, String cpf, String endereco) {
        super(id, nome, idade, cpf, endereco);
        this.salario = salario;
    }

    public Funcionario(double salario) {
        this.salario = salario;
    }
      
    
    public static ArrayList<Funcionario> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   

    public Funcionario(int id_funcionario, String nome, int idade, String cpf, String endereco) {
        super(id_funcionario, nome, idade, cpf, endereco);
    }

    public Funcionario() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
        @Override
    public void inserir() {
                String sql = "insert into funcionario (nome, cpf, idade, salario, endereco) values ('"+this.getNome()+"','"    
            +this.getCpf()+"',"+this.getIdade()+","+this.getSalario()+", '" +this.getEndereco()+"')";       
        
        System.out.println(sql);
        
            Sistema_Farmacia.conn.executeSql(sql);

    }

    @Override
    public void excluir() {
            Sistema_Farmacia.conn.executeSql("delete from funcionario where id_funcionario = " + this.getId());
    }

    @Override
    public void buscar(int id) {
        try{
            ResultSet rs = Sistema_Farmacia.conn.openQuery("select * from funcionario where id_funcionario = " + id);
            
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
            +this.getIdade()+"', salario = "+this.getSalario()+", cpf = '"+this.getCpf()+"', endereco = '" 
                +this.getEndereco()+"' where "
                    + "id_funcionario = " + this.getId();
        Sistema_Farmacia.conn.executeSql(sql);
    }

    
}
