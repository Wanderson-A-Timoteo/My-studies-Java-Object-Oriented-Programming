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
public class Cliente extends Pessoa implements FarmaciaDao {

    public Cliente(int id, String nome, int idade, String cpf, String endereco) {
        super(id, nome, idade, cpf, endereco);
    }

    public Cliente() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void inserir() {
            
                
        /*String sql = "insert into cliente (nome, cpf, idade, endereco) values ('"+this.getNome()+"','"    
            +this.getCpf()+"',"+this.getIdade()+",'" +this.getEndereco()+"')";       
        
        System.out.println(sql);
        
        Sistema_Farmacia.conn.executeSql(sql);*/
        try{
               // String sql = "insert into cliente (nome, cpf, idade, endereco) values ('"+this.getNome()+"','"    
               //     +this.getCpf()+"',"+this.getIdade()+",'" +this.getEndereco()+"')";       
                Sistema_Farmacia.conn.executeUpdate(this.getNome(),this.getCpf(),this.getIdade(),this.getEndereco());
            
            }catch(Exception e){
                e.getMessage();
            }
    
    }
    
    @Override
    public void excluir() {
        Sistema_Farmacia.conn.executeSql("delete from cliente where id_cliente = " + this.getId());
    }
    @Override
    public void buscar(int id) {
        try{
            ResultSet rs = Sistema_Farmacia.conn.openQuery("select * from cliente where id_cliente = " + id);
            
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
        
        String sql = "update cliente set nome = '"+this.getNome()+"', idade = '"    
            +this.getIdade()+"', cpf = '"+this.getCpf()+"', endereco = '" +this.getEndereco()+"' where "
                    + "id_cliente = " + this.getId();
        Sistema_Farmacia.conn.executeSql(sql);
    }
    
    public static ArrayList<Cliente> buscarTodos(){
        ArrayList<Cliente> lista = new ArrayList();
        
        try{
            ResultSet rs = Sistema_Farmacia.conn.openQuery("select * from cliente");
            
            while (rs.next()){
                
                Cliente cliente = new Cliente(); 
                cliente.setNome(rs.getString("nome"));
                cliente.setIdade(Integer.parseInt(rs.getString("idade")));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setId(Integer.parseInt(rs.getString("id_cliente")));
                lista.add(cliente);
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return lista;
    }
    
    
}
