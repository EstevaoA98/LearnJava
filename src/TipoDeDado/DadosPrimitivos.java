package TipoDeDado;

public class DadosPrimitivos {
    public static void main(String[] args) {
        //psvm=public static void main
        /* Dados primitivos:
        BOOLEAN->Boolean
        CHARACTER->Char
        INTEGER->byte, short, int, long
        FLOAT->float, double

        Objetivo da aula: Criar um um
        */

        int idade = 26;//valor maximo no int: 2 147 483 647
        double altura = 1.85;
        char inicial = 'E';
        boolean solteiro = true;
        Long saldoBancario = 1000L;//Valor maximo do long: 9 223 372 036 854 775 807;

        System.out.println("Idade: " + idade);//Comando para mostra no console System.out.println
        System.out.println("Altura: " + altura);
        System.out.println("Inicial: " + inicial);
        System.out.println("Solteiro: " + solteiro);
        System.out.println("Saldo bancario é: " + saldoBancario);

        /*
        * sout = System.out.println().
        * soutv = System.out.println(variavel); -> ultima variavel declarada.
        * soutf = System.out.println(variavel);-> primeira variavel declarada.
        * control + R = compilar.
         */
    }
}
