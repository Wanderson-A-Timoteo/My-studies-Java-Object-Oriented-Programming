package modificadoresnaoacesso2;


//Com atributo FINAl a classe não pode mais ser estendida
public class Pessoa {
    
    public static final int MULTIPLICADOR_ATUAL=10;
    
    public static final String nome="João";
    
    public final String dizerNome() {
        return nome;
    }
    
    
    
    
    
}
