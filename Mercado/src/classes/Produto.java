package classes;

public class Produto {
    
    private int codigo;
    private String nome;
    private double preco;
    private Fornecedor fornecedor;

    
    public Produto() {
        this.fornecedor = new Fornecedor();
        
    }
    
    public Produto(int cod) {
        this.codigo = cod;
    }
    public Produto(int cod, String nome) {
        this(cod);
        //this.codigo = cod;
        this.nome = nome;
    }
    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

          
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
    
    
}
