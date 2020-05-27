/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.sistema_farmacia.model;

/**
 *
 * @author wande
 */
public class Venda {
    
    private int id_venda;
    private String data;
    private double preco_custo;
    private double preco_venda;
    private int id_cliente;
    private double valor_total;
    private String nomeMedicamento;
    private String Fornecedor_lab;

    
    public Venda(int id_venda, String data, double preco_custo, double preco_venda, int id_cliente, double valor_total) {
        this.id_venda = id_venda;
        this.data = data;
        this.preco_custo = preco_custo;
        this.preco_venda = preco_venda;
        this.id_cliente = id_cliente;
        this.valor_total = valor_total;
    }

    public Venda(String nomeMedicamento, String Fornecedor_lab) {
        this.nomeMedicamento = nomeMedicamento;
        this.Fornecedor_lab = Fornecedor_lab;
    }

    
    /**
     * @return the id_venda
     */
    public int getId_venda() {
        return id_venda;
    }

    /**
     * @param id_venda the id_venda to set
     */
    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
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

    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the valor_total
     */
    public double getValor_total() {
        return valor_total;
    }

    /**
     * @param valor_total the valor_total to set
     */
    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    /**
     * @return the nomeMedicamento
     */
    public String getNomeMedicamento() {
        return nomeMedicamento;
    }

    /**
     * @param nomeMedicamento the nomeMedicamento to set
     */
    public void setNomeMedicamento(String nomeMedicamento) {
        this.nomeMedicamento = nomeMedicamento;
    }

    /**
     * @return the Fornecedor_lab
     */
    public String getFornecedor_lab() {
        return Fornecedor_lab;
    }

    /**
     * @param Fornecedor_lab the Fornecedor_lab to set
     */
    public void setFornecedor_lab(String Fornecedor_lab) {
        this.Fornecedor_lab = Fornecedor_lab;
    }
    
    
    
}
