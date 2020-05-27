/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cadastros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wanderson
 */
public class Produtos {
    
    private String nome;
    private int codigo;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    public String salvar() {
        
        try {
            
            FileWriter fw;
            fw = new FileWriter("Produtos.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome: "+this.nome);
            pw.println("Codigo: "+this.codigo);
            pw.println("Preço: "+this.preco);
            pw.flush();
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Cadastrado com Sucesso";
        
    }
    
    
}
