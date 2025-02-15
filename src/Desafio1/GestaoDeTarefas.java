package Desafio1;

import com.sun.security.jgss.GSSUtil;

public class GestaoDeTarefas {
    public static void main(String[] args) {

        String prato1 = "Macarrão a bolonhesa";
        int tempoPreparo1 = 15;
        String status1 = "indefinido";
        char tamanhoDaPorção1 = 'M';


        if (tempoPreparo1 <= 15) {
            status1 = "pronto";
        } else if (tempoPreparo1 < 30) {
            status1 = "em preparo";
        } else{
            status1 = "demorado";
        }

        System.out.println("Prato:" + prato1);
        System.out.println("Tempo de preparo: " + tempoPreparo1 + " minutos" );
        System.out.println("Status: " + status1);

        System.out.println("------------------------------------------------------------------------------------");

        String prato2 = "Penne a carbonara";
        int tempoPreparo2 = 25;
        String status2 = "indefinido";
        char tamanhoDaPorção2 = 'P';

        if (tempoPreparo2 <= 15) {
            status2 = "pronto";
        } else if (tempoPreparo2 < 30) {
            status2 = "em preparo";
        } else {
            status2 = "demorado";
        }

        System.out.println("Prato:" + prato2);
        System.out.println("Tempo de preparo: " + tempoPreparo2 + "minutos" );
        System.out.println("Status: " + status2);

        System.out.println("------------------------------------------------------------------------------------");

        String prato3 = "Lasanha";
        int tempoPreparo3 = 40;
        String status3 = "indefinido";
        char tamanhoDaPorção3 = 'G';

        if (tempoPreparo3 <= 15) {
            status3 = "pronto";
        } else if (tempoPreparo3 < 30) {
            status3 = "em preparo";
        } else {
            status3 = "demorado";

        }

        System.out.println("Prato:" + prato3);
        System.out.println("Tempo de preparo: " + tempoPreparo3 + "minutos" );
        System.out.println("Status: " + status3);

    }
}
    /*Desafio: Gerenciamento de Pedidos
    Crie um programa que represente três pedidos de um restaurante e suas respectivas informações.

    Cada pedido deve ter:

    Nome do prato
    Tempo de preparo (minutos)
    Status do pedido
    Extras - Quer mais desafio?

     Use condicionais para definir o status do pedido com base no tempo de preparo:

    Se o tempo for até 15 minutos, o pedido pode ser marcado como "rápido".
    Se o tempo for entre 16 e 30 minutos, o pedido pode ser marcado como "médio".
    Se o tempo for maior que 30 minutos, o pedido pode ser marcado como "demorado".

    Atualize o status do pedido para "pronto" ou "em preparo" com base no tempo.*/