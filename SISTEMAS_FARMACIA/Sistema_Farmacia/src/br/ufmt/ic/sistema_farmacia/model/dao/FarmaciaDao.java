/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.sistema_farmacia.model.dao;

/**
 *
 * @author wanderson Timoteo, Roberto Passos e Rodrigo Moura
 */
public interface FarmaciaDao {
    
    public void inserir();
    
    public void excluir();
    
    public void buscar(int id);
    
    public void atualizar();
}
