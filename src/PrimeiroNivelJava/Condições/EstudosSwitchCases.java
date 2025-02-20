package PrimeiroNivelJava.Condições;

import java.util.Scanner;

public class EstudosSwitchCases {


    public static void main(String[] args) {

        /*
         * SwitchCases = serve para tratar uma sequência de condições de maneira mais eficiente.
         * Objetivo: Pedir para o usuário escolher o tamanho da pizza.
         * */

        Scanner scanner = new Scanner(System.in);

        //Tamanho da pizza
        System.out.println("Escolha o tamanho da pizza: ");
        System.out.println("P - Pequena");
        System.out.println("M - Média");
        System.out.println("G - Grande");
        System.out.println("GG - Gigante");

        //Usuario esolhe o tamanho da pizza

        System.out.println("Digite o tamanho da pizza: ");

        String tamanhoPizza = scanner.nextLine().toUpperCase();

        switch (tamanhoPizza){
            case "P":
                System.out.println("Pizza do tamanho pequena");
                break;
            case "M":
                System.out.println("Pizza do tamanho média");
                break;
            case "G":
                System.out.println("Pizza do tamanho grande");
                break;
            case "GG":
                System.out.println("Pizza do tamanho gigante");
                break;
                //caso o usaurio digite uma informação que nao de requisisção aparece a mensagem.
            default:
                System.out.println("informação inválida.  Exemplo: P ou P para pizza pequena!");
        }

        scanner.close();

    }
}
