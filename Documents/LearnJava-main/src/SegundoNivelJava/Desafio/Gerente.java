package SegundoNivelJava.Desafio;

import java.util.Scanner;

public class Gerente extends Funcionario {

    String departamentoGerenciado;

    public void departamentoGerenciado() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o departamento gerenciado: ");
        departamentoGerenciado = scanner.nextLine();

        System.out.println("---------- Informações do Funcionário ----------");
        System.out.println("Gerente do departamento de " + departamentoGerenciado);

    }

    public void mostrarInformacoes() {
        departamentoGerenciado();

    }

    @Override
    public void ValeAlimentacao() {
        System.out.println("Funcionário tem direito a vale alimentação de 1200,00 R$");
    }
}

