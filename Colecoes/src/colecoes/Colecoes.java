package colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;


/**
 *
 * @author wanderson

public class Colecoes {

    public static void main(String[] args) {
        
        List lista = new ArrayList();
        
        //adicionar_elemento(lista, elem);
        lista.add("Wanderson");
        lista.add("Wanderson");
        lista.add(101);
        lista.add(101);
        lista.add('C');
        lista.add('C');
        lista.add(3.14);
        lista.add(3.14);
        
        //imprime a quantidade de elementos cadastrados na Arraylist, nesta caso são 8.
        System.out.println("Tamanho da Lista: " +lista.size());
        
        
        //imprime o conteudo dentro da ArrayLista
        for (int i=0; i<lista.size(); i++) {
            System.out.println(i+" > "+lista.get(i));
        }
        
        
        Set conjunto = new HashSet();
        conjunto.add("Wanderson");
        conjunto.add("Wanderson");
        conjunto.add(101);
        conjunto.add(101);
        conjunto.add('C');
        conjunto.add('C');
        conjunto.add(3.14);
        conjunto.add(3.14);
        conjunto.add(new Aluno());
        conjunto.add(new Aluno());
        conjunto.add(new Aluno());
        Aluno joao = new Aluno();
        conjunto.add(joao);
        
        //SET não aceita elementos duplicados, por isso ele lê apenas 4 elementos.
        //System.out.println("Tamanho do conjunto: "+conjunto.size());
        
        //Os elementos não possuem indece, o SET não tem o metodo GET(i), ele não percorre o conjunto
        //for (int i=0; i<conjunto.size(); i++) {
        //    System.out.println(i+" > "+conjunto.get(i));
        //}
        
        
        
        //Dessa forma o SET percorre o conjunto (lista), e retorna um object
        //Iterator it = conjunto.iterator();
        //while (it.hasNext()) {
        //    System.out.println(it.next());
        //}
        
        Map mapa = new HashMap();
        mapa.put("Aluno", "Wanderson");
        mapa.put("Aluno", "Wanderson");
        mapa.put("AP", 101);
        mapa.put("AP", 101);
        mapa.put("Conceito", 'C');
        mapa.put("Conceito", 'C');
        mapa.put("CR", 3.14);
        mapa.put("CR", 3.14);
        mapa.put("Lista ", new ArrayList());
        
        
        //System.out.println("AP: "+mapa.get("AP"));
        Itera
        
    }
    
} */
public class Colecoes {
    
    public static void main(String[] args) {
        
        List lista = new ArrayList();
        lista.add("Jivago");
        lista.add(101);
        lista.add('C');
        lista.add(3.14);
        System.out.println(lista.size());
        
        for (int i=0;i<lista.size();i++) {
            System.out.println(i+" > "+lista.get(i));
        }
        
        Set conjunto = new HashSet();
        
        conjunto.add(new String("Jivago"));
        conjunto.add(new Integer(101));
        conjunto.add('X');
        conjunto.add(3.14);
        conjunto.add(new String("Jivago"));
        conjunto.add(new Integer(101));
        conjunto.add('X');
        conjunto.add(3.14);
        conjunto.add(new Aluno("1234","João Silva"));
        conjunto.add(new Aluno("1234","João Silva"));
        conjunto.add(new Aluno("1234","João Silva"));
        Aluno joao = new Aluno("1234","João Silva");
        conjunto.add(joao);
        
        System.out.println(conjunto.size());
        
        /*for (int i=0;i<conjunto.size();i++) {
            System.out.println(i+" > "+conjunto.get(i));
        }*/
        Object o;
        Iterator it = conjunto.iterator();
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        Map mapa = new HashMap();
        mapa.put("Aluno","Jivago");
        mapa.put("AP",101);
        mapa.put("Conceito",'C');
        mapa.put("CR",3.14);
        mapa.put("Lista", new ArrayList());
        
        //ySstem.out.println(" AP: "+mapa.get("AP"));
        
        Iterator itm = mapa.entrySet().iterator();
        
        while (itm.hasNext()) {
            //System.out.println(itm.next());
            Map.Entry pair = (Map.Entry) itm.next();
            System.out.println("k: "+pair.getKey()+" v: "+pair.getValue());
        }
        
        List<Aluno> listaAlunos = new ArrayList();
        
        GuardaValor<String> gv = new GuardaValor();
        gv.setValor("Uma String");
        
      

    }
    
}
