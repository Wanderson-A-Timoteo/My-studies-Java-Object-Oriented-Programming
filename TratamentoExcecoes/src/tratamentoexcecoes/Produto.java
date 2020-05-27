package tratamentoexcecoes;

public class Produto {
    
    int estoque=-1;
    
    public boolean classificarProduto() {
        return false;
        
    }
    
        public boolean zerarEstoqueProduto() throws ProdutoExcecao {
            if (estoque < 0) {
                throws new ProdutoExcecao("Produto negativado");
             
            
            }
            return false;
    }
}
