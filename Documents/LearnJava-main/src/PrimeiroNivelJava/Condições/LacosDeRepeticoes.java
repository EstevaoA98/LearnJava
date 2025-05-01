package PrimeiroNivelJava.Condições;

public class LacosDeRepeticoes {
    public static void main(String[] args) {
        /*
        * Laços de repetições = serve para repetir uma sequência de instruções de maneira eficiente.
        * WHILE = condições
        * FOR = soma de valores toda a vez que o laço for executado.
        * */

        int pedido = 0;
        int pratosFeitos = 15;

        while (pedido <= pratosFeitos) {
            System.out.println("Prato pronto! numero " + pedido);
            pedido++;
        }

        /* FOR = soma de valores toda a vez que o laço for executado.

         */

        for (int i = 0; i <= pratosFeitos; i++) {           // pedido = i
            System.out.println("Prato pronto! numero " + i );

        }

    }
}
       /*
        for → Usado quando o número de repetições é conhecido. A estrutura já contém inicialização, condição e incremento no próprio cabeçalho.

        while → Usado quando o número de repetições não é conhecido previamente e depende de uma condição ser verdadeira.

        Use for quando souber quantas vezes o loop será executado.
        Use while quando a repetição depender de uma condição dinâmica.

        */