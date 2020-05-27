package videoteca;
public class VideoTeca {

    public static void main(String[] args) {
    
        Video v[] = new Video[5];
        v[0] = new Video (" Aula 1 de POO ");
        v[1] = new Video (" Aula 12 de PHP ");
        v[2] = new Video (" Aula 10 de HTML5 ");
        v[3] = new Video (" Aula 3 de Python ");
        v[4] = new Video (" Aula 7 de Algoritmos ");
        
        
        Aluno al[] = new Aluno[5];
        al[0] = new Aluno ("Wanderson", 30, "M", "wande");
        al[1] = new Aluno ("Roberto", 21, "M", "robertinho");
        al[2] = new Aluno ("Jeane", 35, "F", "nani");
        al[3] = new Aluno ("Matheus", 25, "M", "matheusinho");
        al[4] = new Aluno ("Ana Paula", 20, "F", "paulinha");
        

        Visualizacao vis[] = new Visualizacao[5]; 
        vis[0] = new Visualizacao(al[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        
        vis[1] = new Visualizacao(al[0], v[3]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString());
       
       /*System.out.println("VIDEOS\n---------------------------");
       System.out.println(v[0].toString());
       System.out.println(v[1].toString());
       System.out.println(v[2].toString());
       System.out.println(v[3].toString());
       System.out.println(v[4].toString());
       
       System.out.println("ALUNOS\n---------------------------");
       System.out.println(al[0].toString());
       System.out.println(al[1].toString());
       System.out.println(al[3].toString());*/
          
                
                
    }
    
}
