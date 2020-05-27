package folhapagamento;
/*
Tendo como ponto de partida o exemplo de polimorfismo (Projeto Empresa/Funcionários) 
que fizemos em sala de aula, você deve criar uma classe com o nome 'FolhaDePagamento'. 
A classe deve ter os atributos mês, ano e demais que você julgar necessário.

Além disso, a classe também terá um método calcularFolha() que receberá como parâmetro 
um vetor de funcionários (Funcionario[]) e a partir desse vetor gerará um relatório, 
no próprio console com o relatório individual de pagamento de cada funcionário, 
o total geral da folha de pagamento daquele mês e o total por cada categoria de funcionário.

No método main da classe principal, crie e instancie um vetor com pelo menos 6 funcionário 
(pelo menos um de cada categoria) para testar a classe 'FolhaDePagamento'.
*/
import classes.Analista;
import classes.Funcionario;
import classes.Vendedor;

public class FolhaPagamento {

    public static void main(String[] args) {
        
        Funcionario maria = new Funcionario();
        maria.setNome("Maria Santos");
        maria.setSalarioBase(3000);
        mostrarSalario(maria);
        
        Vendedor joao = new Vendedor();
        joao.setNome("João Silva");
        joao.setSalarioBase(3000);
        joao.setComissao(0.10);
        joao.setTotalVendas(10000);
        mostrarSalario(joao);
        
        //Vendedor ana = new Funcionario();
        /*Funcionario ana = new Vendedor();
        ana.setNome("Ana Silva");
        ana.setSalarioBase(3000);
        ((Vendedor) ana).setTotalVendas(10000);
        ((Vendedor) ana).setComissao(0.2);
        System.out.println(ana.calcularSalario());
        //Vendedor ana1 = (Vendedor) ana;*/
        
        Analista julia = new Analista("Julia Santos");
        //julia.setNome("Julia Santos");
        julia.setSalarioBase(1000);
        julia.setNivelSuperior(true);
        julia.setCertificacao(true);
        mostrarSalario(julia);
        
    }
    
    public static void mostrarSalario(Funcionario param1) {
        System.out.println("Funcionário: "+param1.getNome()+
                " Salário: "+param1.calcularSalario());        
    }
    
}
