/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.sistema_farmacia;



import br.ufmt.ic.sistema_farmacia.arquivo.Arquivo;
import br.ufmt.ic.sistema_farmacia.telas.FrmLogin;
import br.ufmt.ic.sistema_farmacia.util.ConexaoBD;

/**
 *
 * @author wanderson Timoteo, Roberto Passos e Rodrigo Moura
 */
public class Sistema_Farmacia {

    
    public static ConexaoBD conn = new ConexaoBD();
    
    public static void main(String[] args) {
        // TODO code application logic here
        FrmLogin tela = new FrmLogin();
        tela.setVisible(true);
        
        
        //PARA CRIAR UM ARQUIVO 
        String arq = "Arquivo.txt";
        String texto = "No ano de 1822, foi publicado um artigo científico que prometia revolucionar tudo o\r\n "
                +"que existia até então no ramo do cálculo eletrônico. O seu autor, Charles Babbage, afirmou\r\n "
                +"que sua máquina era capaz de calcular funções de diversas naturezas (trigonometria, logaritmos)\r\n"
                +"de forma muito simples. Esse projeto possuía o nome de Máquina de Diferenças.";
        
        if (Arquivo.write(arq, texto))
            System.out.println("Arquivo salvo com sucesso!");
        else
             System.out.println("Erro ao salvar o arquivo!");
        
        
        /*PARA LEITURA DO ARQUIVO CRIADO
        String texto = Arquivo.Read(arq);
        if (texto.isEmpty())
            System.out.println("Erro ao ler do arquivo");
        else 
            System.out.println(texto);*/
            
        
        
        //Criando o arquivo conf.sistema
        String ArqConf = "conf.sistema";
        String nome = "wanderson Timoteo, " 
                +"Roberto Passos e " 
                +"Rodrigo Moura";
        String login = "Admin";
        String senha = "Admin";
        String versao = "v1.5";
        String esp = ("Especificações do computador utilizado para desenvolver o sistema:\n ");
        String cpu = "Notebook Intel Core i5 2,4GHz";
        String ram = "Memory 8GB DDR4";
        String hd = "Hard Disk 240GB SSD Kingston";
        
        String print = "Alunos que desenvolveram o Sistema_Farmacia: \n"+"Nomes: "+nome+";\n"+"Logim: "
                +login+";\n"+"Senha: "+senha+";\n"+"Versão do Sistema_Farmacia: "+versao+";\n\n"+esp+"\n"
                +"Computador: "+cpu+";\n"+"Memoria RAM: "+ram+";\n"+"Memoria ROM: "+hd;
        Arquivo.write(ArqConf, print);
        
        /*
        //Leitura do arquivo conf.sistema
        String conteudo = Arquivo.Read(ArqConf);
        String c1 = conteudo.split(";")[0];
        String c2 = conteudo.split(";")[1];
        String c3 = conteudo.split(";")[2];
        String c4 = conteudo.split(";")[3];
        String c5 = conteudo.split(";")[4];
        String c6 = conteudo.split(";")[5];
        String c7 = conteudo.split(";")[6];
                
        System.out.println("Alunos que desenvolveram o Sistema_Farmacia\n"+c1);
        System.out.println("Login: "+c2);
        System.out.println("Senha: "+c3);
        System.out.println("Versão do Sistema: "+c4);
        System.out.println(esp);
        System.out.println("Computador: "+c5);
        System.out.println("Memoria RAM: "+c6);
        System.out.println("Memoria RoM: "+c7);
        */
    }
   
}    
        
    

