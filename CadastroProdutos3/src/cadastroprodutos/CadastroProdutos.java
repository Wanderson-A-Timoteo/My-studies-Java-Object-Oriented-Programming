package cadastroprodutos;

import classes.Produto;
import java.util.Scanner;

public class CadastroProdutos {

    public static void main(String[] args) {
        //Produto produto1,produto2,produto3;
        
        int quantidade; //podemos utilizar uma variável ao instanciar um vetor de objetos
        
        Scanner scan = new Scanner(System.in,"iso-8859-1");
        
        System.out.println("Quantos produtos você quer cadastrar?");
        quantidade = scan.nextInt();
        
        Produto prod = new Produto();
        
        Produto[] listaProdutos 
                = new Produto[quantidade]; //ao invés de colocarmos uma valor fixo, inteiro, 
                                           //ex: 5, 6, 8, etc... estamos usando uma variável entrada pelo usuário
        
        int codigoProduto;
        String nomeProduto;
        float precoProduto;
        
        Produto prod1 = new Produto();
        prod1.setCodigo(1010);
        prod1.nome = "Óleo de Soja";
        prod1.setPreco(4.99f);
        
        Produto prod2 = prod1; //Uma coisa que é muito importante saber em Java, 
        prod2.setCodigo(1011); //é que sempre que 'atribuímos' um objeto a outro, o que acontece é que o objeto recebe o 'apontador' (endereço de memória)
        prod2.nome = "Sabão";  //do outro, como se fosse ponteiro em C
        
        System.out.println("Prod1> "+prod1.nome); //Nesse caso, tanto prod1 como prod2 passam a apontar para o mesmo endereçamento de memória, onde há uma instância de Produto
        System.out.println("Prod2> "+prod2.nome); //Por isso ao alterarmos o prod2 (código e nome) também estamos alterando o prod1
        
        Produto produto = new Produto(); //Caso instanciássemos um produto fora do loop (for), fizemos as atribuições e em seguide colocasse na posição do vetor
                                         //Iria sempre apontar para a mesma instância. A instância criada fora do for...   
        
        //faremos um "for" normal para preencher o número de produtos solicitado pelo usuário
        //poderia também ser um while
        for (int i=0;i<listaProdutos.length;i++) {
            
            //produto = new Produto(); //poderíamos resolver isso criando uma nova instância a cada iteração
            
            
            listaProdutos[i] = new Produto(); //é por isso que em cada posição instanciamos um novo produto
            
            System.out.println("Digite o código do produto: ");
            codigoProduto = scan.nextInt();
            
            System.out.println("Digite o nome do produto: ");
            nomeProduto = scan.next();
            
            System.out.println("Digite o valor do produto: ");
            precoProduto = scan.nextFloat();
            
            listaProdutos[i].setCodigo(codigoProduto);
            listaProdutos[i].nome = nomeProduto;
            listaProdutos[i].setPreco(precoProduto);
            
            //produto.setCodigo(codigoProduto);
            //produto.setPreco(precoProduto);
            //produto.nome = nomeProduto;
            
            //listaProdutos[i] = produto; //nesse caso, se o produto fosse instanciado somente uma vez, fora do for, teríamos problema, se "reinstanciássemos" a cada iteração, não teríamos problema
            
        }
        
        
    }
    
}