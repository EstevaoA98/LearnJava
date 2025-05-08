package Escola;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void listarAlunos() {
        System.out.println("Alunos do curso " + nome + ":");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
