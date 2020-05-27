
package modificadoresnaoacesso;

public class ModificadoresNaoAcesso {

    
    public static void main(String[] args) {
        
        Produto.multiplicador = 572;
        
        Produto arroz = new Produto();
        
        arroz.nome = "Arroz Branco";
        arroz.multiplicador = 623;
        
        System.out.println(Produto.multiplicador);
        System.out.println(arroz.multiplicador);
        
        
        Produto.notificarGerente();
        arroz.notificarGerente();
        
    }
    
}
