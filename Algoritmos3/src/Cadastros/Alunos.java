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
public class Alunos {
    
    private String nome;
    private String rga;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRga() {
        return rga;
    }

    public void setRga(String rga) {
        this.rga = rga;
    }
    
    public String salvar() {
        
        try {
            
            FileWriter fw;
            fw = new FileWriter("Alunos.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Nome: "+this.nome);
            pw.println("RGA: "+this.rga);
            pw.flush();
            pw.close();
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Alunos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Cadastrado com Sucesso";
        
    }
    
}
