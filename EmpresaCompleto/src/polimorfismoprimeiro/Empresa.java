package polimorfismoprimeiro;

import classes.Analista;
import classes.AnalistaPleno;
import classes.Funcionario;
import classes.Vendedor;

/**
 * @author Jivago
 */
public class Empresa {
    
    public static void main(String[] args) {
        
        Funcionario[] listaFuncionarios 
                = new Funcionario[10];
        
        Funcionario joao = 
        new Funcionario("João Silva", "123456");
        
        joao.setSalario(3000);
        
        Vendedor maria =
                new Vendedor("Maria", "7891011");
        
        maria.setSalario(2000);
        maria.setComissao(0.05f);
        maria.setTotalVendasMes(60000);
        
        

        Analista mario = new Analista("Mário", "111111");
        mario.setSalario(5000);
        mario.setCertificacao(false);
        mario.setCursoSuperior(true);
        
        /*System.out.println("O salário do "+mario.getNome()
                +" é: "+mario.calcularSalario());          
        
        System.out.println("O salário do "+joao.getNome()
                +" é: "+joao.calcularSalario());        
        
        System.out.println("O salário da "+maria.getNome()
                +" é: "+maria.calcularSalario());*/
        
        
        //funcionario1 é do tipo Funcionario ou Analista?
        Funcionario funcionario1 = new Analista();
        //Esse é um tópico muito importante nas linguagens que implementam Programação Orientada a Objetos (POO)
        //De uma maneira simples, podemos pensar que no JVM há uma "tabela de objetos" com os seus tipos
        //nessa tabela está lá registrado que há um objeto denominado de funcionario1 DO TIPO Funcionário
        //por outro lado, na instanciação do funcionario1, foi instaciado (reservado local na memória e demais procedimentos necessários)
        //um "Analista"
        
        //Por estar como um Funcionario na "tabela de objetos" apenas conseguimos acessar os métodos e atributos dessa Classe
        //Por exemplo, não conseguimos acessar o método setCertificacao()
        funcionario1.setNome("Roberto");
        funcionario1.setSalario(1500);
        //funcionario1.setCertificacao(true); -> não é possível
        
        
        //para acessar metodos e atributos específicos do Analista,
        //seria necessário fazer o "casting" ('forçar' um objeto a assumir outro tipo)
        //ok, sabendo disso agora leia os comentários o método mostrarSalario aqui mesmo da nossa classe principal
        Analista roberto = (Analista) funcionario1;
        
        /*
        //Uma maneira de garantir que não haverá exceções (erros) ao realizarmos casting é verificar qual o tipo da instância
        //utilizando o operador instanceof
        if (funcionario1 instanceof Analista) {
            ((Analista) func1).setCertificacao(true);
        }
        */
        
        
        
        if (joao instanceof Analista) {
            ((Analista) joao).setCertificacao(true);
        }
        
        AnalistaPleno ana = new AnalistaPleno();
        ana.setNome("Ana Silva");
        ana.setSalario(5000);
        ana.setCertificacao(true);
        ana.setCursoSuperior(true);
        ana.setProdutividade(20000);
        
        mostraSalario(joao);
        mostraSalario(maria);
        
        mostraSalario(mario);
        mostraSalario(roberto);
        mostraSalario(ana);
        
           
    }
    
    /*
    Este é um método estático, basicamente, a única diferença em relação ao que
    aprendemos até agora é que ele pode ser chamado sem a necessidade da classe ser instanciada.
    Criamos o método como estático porque o método main também é estático
    */
    public static void 
        mostraSalario(Funcionario funcionario) {
        //Uma das coisas mais importantes aqui é que conseguimos passar como parâmeto do nosso método
        //objetos (instâncias) de qualquer uma das classes criadas (Funcionario, Vendedor, Analista, AnalistaPleno)
        //isso acontece porque todas essas classes (e consequentemente seus objetos) possuem uma "parte em comum" que é Funcionário
        //porém, basicamente, só é visível (acessível) essa parte comum, atributos: nome, cpf, matrícula, salário e método calcularSalário
        System.out.println("salario do(a) "
                +funcionario.getNome()
                +": "+funcionario.calcularSalario());
        
        //Sabendo disso, se passarmos como parámetro uma instância de Analista
        //o método calcularSalario() que será invocado será o de Funcionario ou o especializado/sobreescrito na classe Analista?
        //Pelo que vimos até agora, podemos ser induzidos a pensar, de forma equivocada, que o método chamado será o da classe Funcionario
        //Porém, a Máquina Virtual do JAVA (JVM) verifica a implementação (sobrescrita) do método
        //relacionada a instância (e não ao tipo do objeto)
        //esse é um exemplo de Ligação Dinâmico
    }
    
}
