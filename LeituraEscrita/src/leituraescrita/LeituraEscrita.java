/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leituraescrita;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author wande
 */
public class LeituraEscrita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Path arq = Paths.gets("./", "arquivo");
        
        try{
            List<String> linhas = Files.readAllLines(arq);
            
        }
    }
    
}
