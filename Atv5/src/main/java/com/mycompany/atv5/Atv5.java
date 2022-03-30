/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.atv5;

/**
 *
 * @author Leonardo Ferreira 11211100857@alunos.umc.br
 */
public class Atv5 {

    public static void main(String[] args) {
        Operadores C1 = new Operadores(5, 10);
        C1.adicao();
        System.out.println("O resultado é: " + C1.adicao());
        
        Operadores C2 = new Operadores(5, 10);
        C2.subtracao();
        System.out.println("O resultado é: " + C2.subtracao());
        
        Operadores C3 = new Operadores(5, 10);
        C3.multiplicacao();
        System.out.println("O resultado é: " + C3.multiplicacao());
        
        Operadores C4 = new Operadores(5, 10);
        C4.divisao();
        System.out.println("O resultado é: " + C4.divisao());
        
        Operadores C5 = new Operadores(5, 10);
        C5.retornoDivisao();
        System.out.println("O resultado é: " + C5.retornoDivisao());
        
        Operadores C6 = new Operadores(5, 10);
        C6.somaIgual();
        System.out.println("O resultado é: " + C6.somaIgual());
        
        System.out.println("--------------------------------------");
        System.out.println("operadores de Atribuição");
        
        Operadores C7 = new Operadores(5, 10);
        C7.subtracaoIgual();
        System.out.println("O resultado é: " + C7.subtracaoIgual());
        
        Operadores C8 = new Operadores(5, 10);
        C8.divisaoIgual();
        System.out.println("O resultado é: " + C8.divisaoIgual());
        
        Operadores C9 = new Operadores(5, 10);
        C9.multiplicacaoIgual();
        System.out.println("O resultado é: " + C9.multiplicacaoIgual());
        
        Operadores C10 = new Operadores(5, 10);
        C10.retornodivisaoIgual();
        System.out.println("O resultado é: " + C10.retornodivisaoIgual());
        
        System.out.println("--------------------------------------");
        System.out.println("operadores Lógicos");
        
        Operadores C11 = new Operadores(5, 10);
        C11.e();
        System.out.println("O resultado é: " + C11.e());
        
        Operadores C12 = new Operadores(5, 10);
        C12.eBooleano();
        System.out.println("O resultado é: " + C12.eBooleano());
        
        Operadores C13 = new Operadores(5, 10);
        C13.ou();
        System.out.println("O resultado é: " + C13.ou());
        
        Operadores C14 = new Operadores(5, 10);
        C14.ouBooleano();
        System.out.println("O resultado é: " + C14.ouBooleano());
        
        Operadores C15 = new Operadores(5, 10);
        C15.ouexclusivo();
        System.out.println("O resultado é: " + C15.ouexclusivo());
        
        System.out.println("--------------------------------------");
        System.out.println("operadores Comparação");
        
        Operadores C16 = new Operadores(5, 10);
        C16.igual();
        System.out.println("O resultado é: " + C16.igual());
        
        Operadores C17 = new Operadores(5, 10);
        C17.diferente();
        System.out.println("O resultado é: " + C17.diferente());
        
        Operadores C18 = new Operadores(5, 10);
        C18.menor();
        System.out.println("O resultado é: " + C18.menor());
        
        Operadores C19 = new Operadores(5, 10);
        C19.maior();
        System.out.println("O resultado é: " + C19.maior());
        
        Operadores C20 = new Operadores(5, 10);
        C20.menorIgual();
        System.out.println("O resultado é: " + C20.menorIgual());
        
        Operadores C21 = new Operadores(5, 10);
        C21.maiorIgual();
        System.out.println("O resultado é: " + C21.maiorIgual());
        
    }
}
