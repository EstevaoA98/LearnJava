package NotasEscolares;

import java.util.Scanner;
import NotasEscolares.Boletin.MediaDeAprovacao;

public class BoletinAlunos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.println("Insira a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Insira a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Insira a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("Insira a quarta nota: ");
        double nota4 = sc.nextDouble();

        double notaTotal = MediaDeAprovacao.mediaDenotas(nota1, nota2, nota3, nota4);

        System.out.println("O aluno " + nome + " tem uma média de " + notaTotal);

        String resultado = MediaDeAprovacao.aprovacao(notaTotal);
        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
