package SegundoNivelJava.Desafio;

public class Gerente extends Funcionario {
    String departamentoGerenciado;

    public Gerente(String departamentoGerenciado) {
        this.departamentoGerenciado = departamentoGerenciado;
    }

    public void mostrarDepartamento() {
        System.out.println("Departamento gerenciado: " + departamentoGerenciado);
    }

    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarDepartamento();
    }
}
