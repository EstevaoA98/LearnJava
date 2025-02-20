package PrimeiroNivelJava.Arrays;

public class MemoriaArray {
    public static void main(String[] args) {


        /*
         *Em Java, um array é uma estrutura de dados que armazena elementos do mesmo tipo em posições contíguas da memória heap
         * Quando um array é criado, o Java aloca um bloco contínuo de memória na Heap e retorna uma referência para esse bloco. Essa referência é armazenada na Stack.
         * Quando o array armazena objetos, ele guarda referências para os objetos na Heap, mas os próprios objetos ficam em locais separados na Heap.
         * Se um array não tiver mais referências apontando para ele, o Garbage Collector remove a memória alocada.
         *
         * PimeiroNivel.PimeiroNivel.TipoDeDado.TipoDeDado.Arrays são armazenados na Heap, mas a referência fica na Stack.
         * A alocação é contínua e os elementos são acessados por índices.
         * PimeiroNivel.PimeiroNivel.TipoDeDado.TipoDeDado.Arrays de objetos armazenam referências, e os objetos ficam em locais separados na Heap.
         * O Garbage Collector gerencia a memória automaticamente.
         */

        // Array com String
        String[] aluno = new String[5];

        aluno[0] = "Estevao";
        aluno[1] = "Joao";
        aluno[2] = "Maria";
        aluno[3] = "Fernando";

        System.out.println("Aluno: " + aluno[4]);

        // Quando acessa uma mémoria que nao armazena uma variável STRING, ele retorna null.



        // Array com int
        int[] numero = new int[2];
        numero[0] = 10;

        System.out.println("Numero: " + numero[1]);
        //Quando acessa uma memória que nao armazena uma variável INT, ele retorna 0.



        //Array com double
        double[] salario = new double[2];
        salario[0] = 1000;

        System.out.println("Salario: " + salario[1]);
        //Quando acessa uma memória que nao armazena uma variável DOUBLE, ele retorna 0.



        //Array com boolean
        boolean[] verdadeiroOuFalso = new boolean[2];
        verdadeiroOuFalso[0] = true;

        System.out.println("Verdadeiro ou Falso: " + verdadeiroOuFalso[1]);
        //Quando acessa uma memória que nao armazena uma variável BOOLEAN, ele retorna false.
    }
}
