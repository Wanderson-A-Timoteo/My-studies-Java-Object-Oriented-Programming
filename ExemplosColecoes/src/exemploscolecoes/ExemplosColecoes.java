/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploscolecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Jivago
 */
public class ExemplosColecoes {


    public static void main(String[] args) {
        
        List lista = new ArrayList();
        
        lista.add("João");
        lista.add("Mateus");
        lista.add(100);
        lista.add(150);
        lista.add(150);
        lista.add(100);
        lista.add("João");
        lista.add(new Aluno("201111316","Matheus"));
        
        System.out.println(lista.get(4));
        
        System.out.println("Tamanho da lista: "+lista.size());
        
        for (int i=0;i<lista.size();i=i+1) {
            System.out.println(lista.get(i));
        }
        
        Set conjunto = new HashSet();
        
        conjunto.add("Ana");
        conjunto.add("Maria");
        conjunto.add(100);
        conjunto.add(100);
        conjunto.add(1500);
        conjunto.add(1500);
        conjunto.add("Maria");
        conjunto.add(true);
        conjunto.add(true);
        conjunto.add(false);
        conjunto.add(new Aluno("Matheus","201111316"));
        conjunto.add(new Aluno("Matheus","201111316"));
        conjunto.add(new Aluno("Matheus","201111316"));
        conjunto.add(new Aluno("Matheus","201111316"));        
        
        //conjunto.get();
        
        System.out.println("Tamanho do conjunto: "+conjunto.size());
        
        Iterator it = conjunto.iterator();
        
        while(it.hasNext() == true) {
            Object o = it.next();
            System.out.println(o);
        }
        
        Map hm = new HashMap();
        
        hm.put(1, "Jivago");
        hm.put("Aluno","João");
        hm.put(new Aluno("Matheus","201111316"), "Um aluno bom");
        hm.put("Disciplina", "Algoritmos III");
        hm.put("Legal",true);
        hm.put("Aluno","Maria");
        hm.put(new Aluno("Matheus","201111316"), "Um bom aluno");
        
        hm.get("Aluno");
        
        it = hm.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            System.out.println("chave: "+pair.getKey()
                               +" valor: "+pair.getValue());
        }
        
        
    }
    
}
