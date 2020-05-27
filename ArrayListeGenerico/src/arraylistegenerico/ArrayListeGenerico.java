package arraylistegenerico;


public class ArrayListeGenerico {


    public static void main(String[] args) {
        
        List listaAlunos = new ArrayList();
        
        listaAlunos.add(new Aluno("123", "João"));
        listaAlunos.add(new Aluno("456", "Maria"));
        listaAlunos.add(new Aluno("789", "Ana"));
        
        for (int i=0;i<listaAlunos.size();i++) {
            
            System.out.println(
                ((Aluno)listaAlunos.get.(i).getNome);
            
            
            Aluno aluno = (Aluno) listaAlunos.get(i)
            System.out.println(aluno.getNome());
        }
        
        List<Aluno> outraListaAlunos = new ArrayList();
        
        for (Aluno a : outraListaAlunos) {
            System.out.println();
        }
    }
    
}
