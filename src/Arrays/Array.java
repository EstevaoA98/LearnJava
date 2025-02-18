package Arrays;

public class Array {
    public static void main(String[] args) {

        /*
        * Em Java, um array é uma estrutura de dados que permite armazenar múltiplos valores do mesmo tipo em uma única variável. Os arrays são estáticos, ou seja, seu tamanho é definido no momento da criação e não pode ser alterado posteriormente.

         * Os arrays são uma das estruturas de dados mais fundamentais em Java. Apesar de serem estáticos, são úteis para armazenar e manipular conjuntos de valores de forma eficiente. Para mais flexibilidade, podemos usar listas (ArrayList), que oferecem tamanhos dinâmicos e métodos adicionais.*/

        String frutas[] = new String[3];
        frutas[0] = "Pera";
        frutas[1] = "Manga";
        frutas[2] = "Banana";

        System.out.println(frutas[1]);

    }
}
