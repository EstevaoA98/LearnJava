package SegundoNivelJava.Desafio;

public class Funcionario {

    String nome;
    int idade;
    String cargo;
    String setor;
    String statusAtividade;


    public void mostrarInformacoes() {

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Setor: " + setor);
        System.out.println("Status de Atividade: " + statusAtividade);
        System.out.println("------------------------------------------------");

    }

    public void ValeAlimentacao(){
        System.out.println("Funcionário tem direito a vale alimentação de 800,00 R$");
    }
}

