package exemploscolecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jivago
 */
public class ExemplosColecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //O arraylist é basicamente uma lista de alocação dinâmica
        //ou seja, não precisamos determinar um Tamanho fixo e limitado referente ao tamanho da lista / do vetor
        //diferentemente de como fizemos anteriormente: Produto[] listaProdutos = new Produto[10]; -> estamos declarando um vetor do tipo Produto de 10 posições
        ArrayList lista = new ArrayList(); // mas no ArrayList a alocação é dinâmmica então não é necessário definir o tamanho na hora da declaração/instanciação
        
        lista.add("Jivago"); //sempre que quisermos inserir um novo elemento, basta utilizar o método add
        lista.add("Jivago");
        lista.add("Jivago");
        lista.add(150);
        lista.add(150);
        lista.add(true);
        lista.add(true); //uma vez que uma lista não se preocupa em um produto ser único, nesse exemplo teremos uma lista com 7 itens
        
        //obs: em uma lista, os indices são sempre numéricos, iniciando em 0 e sendo incrementado automaticamente a medida que novos itens são adicionados        
        System.out.println("Tamanho da lista> "+lista.size());

        //podemos iterar (percorrer) um arraylist da forma tradicional, utilizando um for, uma vez que os índices são inteiros incrementais
        for (int i=0;i<lista.size();i++) {
            System.out.println(lista.get(i));
        }  
        
        //outra forma de iterar é utilizando a interface Interator 
        Iterator it = lista.iterator(); //toda lista que implementa a interface iterator pode ser iterada utilizando-a
                                        //para isso, basta "pegarmos" o iterator do objeto utilizado o metodo .iterator() ...
        while (it.hasNext()) {  //... utilizar o hasNext() que retorna true ou false         
            Object o = it.next(); //e o .next() para pegar cada objeto
            System.out.println(o);
        }
        
        //lista.add(99, false);        
        System.out.println("[2] =>"+lista.get(2));
        
        HashSet hs = new HashSet();
        hs.add("Jivago");
        hs.add("Jivago");
        hs.add("Jivago");
        hs.add(150);
        hs.add(150);
        hs.add(true);
        hs.add(true);
        //o HashSet é um conjunto cujo as chaves são baseados em Hash,
        //uma característica dos conjuntos (Interface Set) é que eles não aceitam itens repetidos
        
        //Então, ao contrário do ArrayList, no HashSet teremos "apenas" 3 itens 'Jivago', 150 e true e não 7
        System.out.println("Tamanho do Set>"+hs.size());
        
        it = hs.iterator(); //não há um indice numérico intremental nos conjuntos (0, 1, 2, 3, etc) então por isso, não é possível iterá-lo utilizando for...
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }        

        //Em mapas nos temos o padrão Chave : Valor (Key : Value) cuja a chave geralmente é uma String
        //No caso dessa implementação (HashMap) do Java a chave pode ser qualquer objeto o qual é aplicado uma função Hash
        //Se usarmos como chave uma classe nossa, ex: Aluno é importante implementar as interfaces Comparable e Serializable
        HashMap hm = new HashMap();
        hm.put("aluno", "João");
        hm.put("rga",   123456);
        
        hm.get("aluno");
        hm.get("rga");
        
        System.out.println("Tamanho do mapa> "+hm.size());
        
        //para iteramos um Map precisamos utilizar o Iterator, porém, o iterator do map fica dentro do 'entrySet'
        it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair 
               = (Map.Entry) it.next();
            System.out.println("Chave: "+pair.getKey()
                    +" Valor: "+pair.getValue());
        }
        
        //Há muitas outras collections importantes e úteis em JAVA, como por exemplo Filas de Prioridade (PriorityQueue)
        //uma lista completa de todas as implementações da interface Collection e JAVA pode ser vista no java doc da interface:
        //https://docs.oracle.com/javase/8/docs/api/java/util/Collection.html
        
        Aluno joao = new Aluno();
        joao.setNome("João");
        
        Aluno pedro = new Aluno();
        pedro.setNome("Pedro");
        
        ArrayList listaAlunos = 
                new ArrayList();
        
        listaAlunos.add(joao);
        listaAlunos.add(pedro);
        
        for (int i=0;i<listaAlunos.size();i++) {
            Aluno a = (Aluno) listaAlunos.get(i);
            System.out.println(a.getNome());
        }
        
        //esse exemplo é interessante, pois, além de utilizarmos uma coleção muito últim em Java
        //também estamos utilizando o tipo genérico nela, que no caso é Aluno e dessa forma dizemos que nossa lista só poderá receber itens do tipo Aluno
        //essa restrição é importante para realizar algumas ações, como por exemplo passagem de parâmetro e iteração
        ArrayList<Aluno> listaAlunosT = 
                new ArrayList();
        
        listaAlunosT.add(joao);
        listaAlunosT.add(pedro);
        
        //Se nossa lista (ArrayList) não estiver tipada, não conseguimos iterar dessa forma
        for (Aluno a : listaAlunosT) {
            System.out.println(a.getNome());
        }
        
        
        //Nesse exemplo, instanciamos a classe que criamos 'ExemploGenerico' informando que o atributo que definimos como 'Genérico' será uma String nessa instância
        ExemploGenerico<String> eg 
                = new ExemploGenerico();
        
        //por isso, na chamada do método setAtributo passamos uma string
        eg.setAtributo("Aluno");

        //agora uma instância da mesma classe, porém definimos que o tipo genérico que passamos para dentro da instância é um Integer (e não String como no exemplo anterior)
        ExemploGenerico<Integer> eg1
                = new ExemploGenerico();

        //nesse caso, chamamos o mesmo método do exemplo anterior (setAtributo()) porém passando um inteiro como parâmetro
        eg1.setAtributo(123456);

    }
    
    public static void iteraLista(List<Aluno> lista) {
        
    }
    
}
