package PrimeiroNivelJava.Condições;

import java.util.Scanner;

public class Ternarios {
    public static void main(String[] args) {

        /*
        * Ternarios são maneiras de reduzir os códigos
        * váriavel = (condição) ? valorSeVerdadeiro : valorSeFalso;

        O operador ternário (? :) é uma forma compacta de escrever um if-else, ideal para atribuições simples. Ele segue a estrutura:
        condição ? valor_se_verdadeiro : valor_se_falso;

        Por outro lado, o if-else é mais legível e flexível, permitindo múltiplas operações dentro de cada bloco. O ternário é útil para expressões curtas, enquanto o if-else é melhor para condições mais complexas.*/

        Scanner numero = new Scanner(System.in);

        System.out.println("Digite um para descobrir se ele é par ou ímpar: ");
        int num = numero.nextInt();

        String ParOuImpar = (num% 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número " + num + " é " + ParOuImpar);



    }
}
