package PrimeiroNivelJava.Condições;

import java.util.Scanner;

public class ScannerDeUsuario {
    public static void main(String[] args) {
        /*
         * Scanner é uma classe que ajuda a capturar dados do usuário.
         * Objetivo da aula: Capturar dados do usuário para realizar um curriculum profissional
         */

        /*pratica obtida por erro onde a pergunta de idade pulava para pretense salarial, após corrigir fechando o scanner
        O erro foi corrigido, adicionando o .nextLine() na pergunta de idade e na linha de pretensão salarial.*/

        Scanner curriculum = new Scanner(System.in);
        
        System.out.println("Qual seu nome? ");
        String nome = curriculum.nextLine();

        System.out.println("Qual sua idade? ");
        int idade = curriculum.nextInt();
        curriculum.nextLine();

        System.out.println("Cargo pretendido? ");
        String cargo = curriculum.nextLine();
        
        System.out.println("Qual pretensão salarial? ");
        double salario = curriculum.nextDouble();
        curriculum.nextLine();
        
        System.out.println("Descreva sua experência profissional? ");
        String experiencia = curriculum.nextLine();
        
        System.out.println("Tem disponibilidade para inicio imediato (Sim/Não) ");
        String disponibilidade = curriculum.nextLine();
        
        curriculum.close();

        System.out.println("\nAbaixo segue o seu do candidato");
        System.out.println("Candidato: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário pretendido: " + salario);
        System.out.println("Trabalhos realizados: " + experiencia);
        System.out.println("Candidato tem disponibilidade para inicio imediato? " + disponibilidade);



    }


}

