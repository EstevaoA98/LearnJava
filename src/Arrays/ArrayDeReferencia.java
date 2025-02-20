package Arrays;

public class ArrayDeReferencia {
    public static void main(String[] args) {

        /*
        * Array de Referencia = serve para armazenar um array num array(declarado em outra linha).
        * Pode serve para armazenar uma matriz de matrizes.
        * */

        String [][] fruta = new String[3][3];

        fruta[0][0] = "Melancia";
        fruta[0][1] = "Goiaba";
        fruta[0][2] = "Banana";

        fruta[1][0] = "Melão";
        fruta[1][1] = "Pera";
        fruta[1][2] = "Manga";

        fruta[2][0] = "Uva";
        fruta[2][1] = "Mexirica";
        fruta[2][2] = "Laranja";

        //Imprimindo todos valores da primeira coluna
        for (int i = 0; i < fruta.length ; i++) {
            System.out.println("Fruta: " + fruta [i][0] + ".");
        }

        //Imprimindo todos os valores
        for (int i = 0; i < fruta.length ; i++) {
            System.out.println("Fruta: " + fruta [i][0] + ", " + fruta [i][1] + ", " + fruta [i][2] + ".");
        }




    }
}
