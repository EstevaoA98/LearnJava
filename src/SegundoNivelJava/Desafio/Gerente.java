package SegundoNivelJava.Desafio;

public class Gerente extends Funcionario {

    String departamentoGerenciado;

    public void departamentoGerenciado() {

        System.out.println("Departamento gerenciado: " + departamentoGerenciado);

    }

    public void mostrarInformacoes() {
        departamentoGerenciado();
    }
}
