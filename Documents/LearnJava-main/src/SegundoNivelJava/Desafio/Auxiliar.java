package SegundoNivelJava.Desafio;

import java.util.Scanner;

public class Auxiliar extends Funcionario{

    String departamentoAuxiliar;

    public void departamentoAuxiliar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o setor do auxiliar: ");
        departamentoAuxiliar = scanner.nextLine();

        System.out.println("---------- Informações do Funcionário ----------");
        System.out.println("Auxiliar do setor de " + departamentoAuxiliar);

    }
    public void mostrarInformacoes() {
        departamentoAuxiliar();
    }
}
