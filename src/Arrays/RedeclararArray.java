package Arrays;

public class RedeclararArray {
    public static void main(String[] args) {
        /*
        * Gerenciamento de Memória → O Garbage Collector libera arrays sem referências.
        * */

        String [] refrigerante = new String[5];
        refrigerante [0]= "Coca Cola";
        refrigerante [1]= "Sprite";
        refrigerante [2]= "Fanta";
        refrigerante [3]= "Pepsi";
        refrigerante [4]= "Guarana Antartica";

        System.out.println("Traga para mim um " + refrigerante[0] + " porfavor!");

        System.out.println("------------------------------------------------------------------------------------");

        // redeclarar a String
        String bebida = "Coca Cola";
        bebida= "Guarana Jesus";

        System.out.println("Traga para mim um " + bebida+ " porfavor!");

        System.out.println("------------------------------------------------------------------------------------");

        // redeclar o Array
        refrigerante = new String[5];
        refrigerante[0] = "Suco de Maracuja";
        refrigerante[1] = "Suco de Manga";
        refrigerante[2] = "Suco de Laranja";
        refrigerante[3] = "Suco de Limão";
        refrigerante[4] = "Suco de Acerola";

        //FOR para mostrar o LOOP no array
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Bebida " + refrigerante[i]); // i = a posição da array
        }

    }
}
