package Cambio;

import java.util.Scanner;

import static Cambio.contacao.CotacaoDolar.cotacaoHoje;

public class CompradorDeMoedas {
    public static void main(String[] args) {
        System.out.println("---Comprador de moedas---");

        System.out.println("O valor do Dólar hoje é de " + cotacaoHoje + " reais");

        System.out.println("Digite o valor em reais que deseja comprar em dólares: ");
        double real = new Scanner(System.in).nextDouble();

        System.out.println("Compra efetuada com sucesso!");

         double valorReceber = real / cotacaoHoje ;

        System.out.printf("O valor em dólares para retirar é: %.2f%n", valorReceber);

    }
}
