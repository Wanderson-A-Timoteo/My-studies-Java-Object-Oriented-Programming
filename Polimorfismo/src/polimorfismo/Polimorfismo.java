package polimorfismo;

import classes.Vendedor;

public class Polimorfismo {
    public static void main(String[] args) {
        Vendedor ana = new Vendedor();
        ana.setNone ("Ana");
        ana.setSalario (1500);
        ana.Comissao (0.05f);
        ana.setTotalVendas (30000);
        
        
        System.out.println(ana.calcularSalario());
        
        Analista joao = new Analista();
        joao.setNome ("João Silva");
        joao.setSalario (1600);
        joao.setCertificacao(true);
        joao.set.CursoSuperior (false);
        
        
        
        Funcionario maria = new Analista();
        
        //((Analista).maria).setCertificado (true);
        
                
        mostarSalario(ana);
        mostarSalario(joao);
        
       // System.out.println(joao.calcularSalario());
    }
    
}
