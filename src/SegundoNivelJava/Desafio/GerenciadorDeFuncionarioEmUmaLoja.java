package SegundoNivelJava.Desafio;


import java.util.Scanner;

public class GerenciadorDeFuncionarioEmUmaLoja {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        Funcionario Estevao = new Funcionario();

        System.out.println("Digite o nome do funcionário: ");
        Estevao.nome = scanner.nextLine();

        System.out.println("Idade: ");
        Estevao.idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Cargo: ");
        Estevao.cargo = scanner.nextLine();

        System.out.println("Setor: ");
        Estevao.setor = scanner.nextLine();

        System.out.println("Funcionário está ativo? (1 - sim / 2 - não)");
        int status = scanner.nextInt();
        Estevao.statusAtividade = (status==1) ? "Ativo" : "Não ativo";
        scanner.nextLine();


        Gerente EstevaoGerencia = new Gerente();

        System.out.println("Qual departamento de gerência: ");
        String departamentoGerenciado = scanner.nextLine();

        EstevaoGerencia.departamentoGerenciado = departamentoGerenciado;


        EstevaoGerencia.departamentoGerenciado();
        Estevao.mostrarInformacoes();
        scanner.close();
    }
}