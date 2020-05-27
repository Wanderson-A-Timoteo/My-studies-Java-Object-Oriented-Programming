/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.sistema_farmacia.arquivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author wande
 */
public class Arquivo {
    
    String Caminho = "C:\\Users\\wande\\Documents\\NetBeansProjects\\Sistema_Farmacia v1.5\\Sistema_Farmacia";
    
    public static String Read(String Caminho ){
        String conteudo = "";
        
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            
            try {
                linha = lerArq.readLine();
                while (linha != null) {
                    conteudo += linha+"\n";
                    linha = lerArq.readLine();
                    
                }
                 arq.close();
                 return conteudo;
                 
            } catch (IOException ex) {
                System.out.println("ERRO: Não foi possível ler o arquivo!");
                return "";
            }    
        } catch (FileNotFoundException ex) {
            System.out.println("ERRO: O arquivo não foi encontrado!");
            return "";
        }    
        
    }
    public static boolean write(String Caminho, String Texto){
        try{
            FileWriter arq = new FileWriter(Caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
