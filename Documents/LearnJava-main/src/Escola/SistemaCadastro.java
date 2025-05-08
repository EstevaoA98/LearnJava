package Escola;

import java.util.Scanner;

public class SistemaCadastro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Curso curso = new Curso("Java Básico");

        for (int i = 1; i <= 2; i++) {
            System.out.println("Digite o nome do aluno " + i + ":");
            String nome = sc.nextLine();
            System.out.println("Digite a matrícula:");
            String matricula = sc.nextLine();

            Aluno aluno = new Aluno(nome, matricula);
            curso.adicionarAluno(aluno);
        }

        curso.listarAlunos();
        sc.close();
    }
}
