package classes;

public class Produto {
    
    private int codigo;
    public String nome;
    protected float preco;
    
    public int getCodigo() {
        return codigo;
    }
    
    public boolean setCodigo(int codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
            return true;
        }
        return false;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}
