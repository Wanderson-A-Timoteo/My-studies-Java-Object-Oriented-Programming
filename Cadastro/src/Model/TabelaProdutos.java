/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author wanderson
 */
public class TabelaProdutos extends AbstractTableModel{

    private ArrayList<Produtos>listaDeProdutos;
    private String[] colunas = ("Código", "Nome", "Preço");
    
    public void TabelaProdutos(){
        this.listaDeProdutos = new ArrayList<>();
    }
    public void addProduto(Produtos pProduto);
        this.listaDeProdutos.add(pProduto);
        

    @Override
    public void fireTableDataChanged() {
        super.fireTableDataChanged(); //To change body of generated methods, choose Tools | Templates.
    }
        
    public void removerProduto(int rowIndex){
        this.listaDeProdutos.remove(rowIndex);
        fireTableDataChanged();
    }
    public Produtos getproduto(int rowIndex){
        return this.listaDeProdutos.get(rowIndex);
        
    }
    
    @Override
    public int getRowCount() {
        return this.listaDeProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            
            case: 0
                    return this.listaDeProdutos.get(rowIndex).getCodigo();
            case: 1
                    return this.listaDeProdutos.getClass(rowIndex).getNome();
            case: 2
                    return this.listaDeProdutos.get(rowIndex).getPreco();
            default:
                    return this.listaDeProdutos.get(rowIndex);
                    
        }
    }

    private static class pProduto {

        public pProduto() {
        }
    }
    
    @Override
    public String getColumnName(int columnIndex){
        return this.colunas[columnIndex];
    }
}
