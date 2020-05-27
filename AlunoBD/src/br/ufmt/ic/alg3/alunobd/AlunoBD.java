package br.ufmt.ic.alg3.alunobd;

import br.ufmt.ic.alg3.alunobd.model.Aluno;
import br.ufmt.ic.alg3.alunobd.model.dao.AlunoDao;
import br.ufmt.ic.alg3.alunobd.telas.CadastroAluno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlunoBD {

    public static void main(String[] args) {
        
        
        CadastroAluno tela = new CadastroAluno();
        tela.setVisible(true);
        
        
        // este é para criar um menu de opção
        
        /*Scanner scan = new Scanner(System.in);
        System.out.println("____MENU DE OPÇÕES____");
        System.out.println("Digite [1] para cadastrar aluno ");
        System.out.println("Digite [2] para excluir cadastro");
        
        System.out.println("Digite o nome do aluno: ");
        String nome;
        nome = scan.next();
        aluno.setNome = nome;
        
        System.out.println("Digite o RGA do aluno: ");
        String rga;
        rga = scan.next();
        aluno.setRga = rga;
        
        
        */
        
        Aluno aluno = new Aluno();
        aluno.setCod(null);
        aluno.setRga(null);
        aluno.setNome(null);
        aluno.setCurso(null);
        
        AlunoDao alunoDao = new AlunoDao();
        
            if (alunoDao.cadastrar(aluno)) {
                System.out.println("Aluno cadastrado com sucesso!");
            }
            else {
                System.out.println("ERRO no cadastramento do aluno");
            }
    }

    public static ArrayList<AlunoBD> buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void buscar(int parseInt) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void excluir() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getEndereco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getCpf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object getIdade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
