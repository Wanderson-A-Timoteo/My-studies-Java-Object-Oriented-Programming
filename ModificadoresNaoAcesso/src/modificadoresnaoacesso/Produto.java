
package modificadoresnaoacesso;

public class Produto {
    static int multiplicador = 123;
    
    Integer cod;
    String nome;
    Float preco;
    String descricao;
    
    public static void notificarGerente(){
        
        System.out.println("O gerente foi notificado...");
    }
    
    public void exibirDescricao(){
        System.out.println(cod+" "+nome);
    }
}
