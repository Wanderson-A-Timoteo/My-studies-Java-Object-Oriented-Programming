package modificadoresnaoacesso2;

public class ModificadoresNaoAcesso2 {

    public static void main(String[] args) {
    
        Pessoa pessoa = new Pessoa();
        
        // pessoa.nome= "João Silva"; este modelo não esta correto devido ao modificador de accesso FINAL
        // declarado na classe pessoa, FINAL não pode ser sobrescrito. Mas aceita sobrecarga
        
        System.out.println(pessoa.nome);
        
        Aluno aluno = new Aluno();
        
        
        //mostrarNome(aluno);
        
        
        
    }
    public static void mostrarNome(Pessoa pessoa) {
        
    }
}
