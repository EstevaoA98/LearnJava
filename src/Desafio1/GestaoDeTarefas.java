package Desafio1;

import com.sun.security.jgss.GSSUtil;

public class GestaoDeTarefas {
    public static void main(String[] args) {

        String prato1 = "Macarrão a bolonhesa";
        int tempoPreparo1 = 15;
        String status1 = "rápido";

        String prato2 = "Penne a carbonara";
        int tempoPreparo2 = 25;
        String status2 = "médio";

        String prato3 = "Lasanha";
        int tempoPreparo3 = 40;
        String status3 = "demorado";

        String statusPrato1 = (tempoPreparo1 <= 15)? "pronto" : "em preparo";
        String statusPrato2 = (tempoPreparo2 <= 25)? "pronto" : "em preparo";
        String statusPrato3 = (tempoPreparo3 <= 30)? "pronto" : "em preparo";

        System.out.println("Prato:" + prato1 + ", Tempo de preparo: " + tempoPreparo1 + " minutos" + ", Status: " + statusPrato1);
        System.out.println("Prato:" + prato2 + ", Tempo de preparo: " + tempoPreparo2 + " minutos" + ", Status: " + statusPrato2);
        System.out.println("Prato:" + prato3 + ", Tempo de preparo: " + tempoPreparo3 + " minutos" + ", Status: " + statusPrato3);
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