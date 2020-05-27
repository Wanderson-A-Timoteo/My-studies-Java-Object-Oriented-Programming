package br.ic.ufmt.alg3.testesKotlin

import java.util.Scanner

fun main(args: Array<String>) {
    
    println("Hello, World")
    
    var joao = Aluno();
    
    joao.nome = "João Silva";
    
    //um exemplo equivalente ao que fizemos em JAVA para ler variáveis no terminal
    //todavia, Kotlin propõem uma série de quebra de paradigmas, em especial maior uso de programação funcional / funções lambdas, etc
    var scan = Scanner(System.`in`);
    println("Digite o nome do aluno: ");
    joao.nome = scan.next();
    
    
    //uma solução mais compatível com a proposta da linguagem Kotlin seria:
    println("Digite mais uma vez o nome do aluno: ");
    joao.nome = readLine()!!;
    
    joao.solicitarMatricula(310);
    
    var maria = Aluno("Maria Maria","111.222.111-22");
    maria.faltarAula(1111);
}

