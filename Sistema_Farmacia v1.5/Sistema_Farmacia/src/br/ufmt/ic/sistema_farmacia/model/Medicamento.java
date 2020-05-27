/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.sistema_farmacia.model;

import br.ufmt.ic.sistema_farmacia.Sistema_Farmacia;
import br.ufmt.ic.sistema_farmacia.model.dao.FarmaciaDao;
import br.ufmt.ic.sistema_farmacia.util.ConexaoBD;
import java.sql.DriverManager;
import java.util.ArrayList;

/**
 *
 * @author wanderson Timoteo, Roberto Passos e Rodrigo Moura
 */
public class Medicamento implements FarmaciaDao {

   public static ArrayList<Medicamento> buscarTodos() 
   {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   }

    private int id_medicamento;
    private String nome_medicamento;
    private String fornecedor_lab;
    private double preco_custo;
    private double preco_venda;
    
    /**
     * @return the id_medicamento
     */
    public int getId_medicamento() {
        return id_medicamento;
    }

    /**
     * @param id_medicamento the id_medicamento to set
     */
    public void setId_medicamento(int id_medicamento) {
        this.id_medicamento = id_medicamento;
    }

    /**
     * @return the nome_medicamento
     */
    public String getNome_medicamento() {
        return nome_medicamento;
    }

    /**
     * @param nome_medicamento the nome_medicamento to set
     */
    public void setNome_medicamento(String nome_medicamento) {
        this.nome_medicamento = nome_medicamento;
    }
    
    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor_lab;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor_lab = fornecedor;
    }

    /**
     * @return the preco_custo
     */
    public double getPreco_custo() {
        return preco_custo;
    }

    /**
     * @param preco_custo the preco_custo to set
     */
    public void setPreco_custo(double preco_custo) {
        this.preco_custo = preco_custo;
    }

    /**
     * @return the preco_venda
     */
    public double getPreco_venda() {
        return preco_venda;
    }

    /**
     * @param preco_venda the preco_venda to set
     */
    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }
    
       
    @Override
    public void inserir() 
    {
        try
        {
            String SQL_tabela="medicamento";
            String SQL_colunas="(nome_medicamento ,preco_custo ,preco_venda ,fornecedor_lab)";
            String SQL_valores="("+"'"+this.getNome_medicamento()+"'"+","+"'"+String.valueOf(this.getPreco_custo())+"'"+","
                              +"'"+String.valueOf(this.getPreco_venda())+"'"+","+"'"+this.getFornecedor()+")";
            
            Sistema_Farmacia.conn.executeInsert(SQL_tabela,SQL_colunas,SQL_valores);
        }
        catch(Exception e) 
        {
                    
        }        
        

    
    }

    @Override
    public void excluir(String tabela, int id)
    {
         Sistema_Farmacia.conn.executeDelete(tabela,id);
    }

    @Override
    public void buscar(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
