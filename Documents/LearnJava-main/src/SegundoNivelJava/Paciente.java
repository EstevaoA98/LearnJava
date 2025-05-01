package SegundoNivelJava;

public class Paciente {

    String nome;
    int idade;
    String endereco;
    String sintomas;
    int peso;
    int desconto;

    //Metodo VOID não retorna valor.

    public void convenio(){
        System.out.println("Pagamento: Convenio");
    }

    public void particular(){
        System.out.println("Pagamento: Particular");             //Metodo VOID nao precisa de retorno
    }
    //Metodo STRING retorna valor uma string.
    String consultado(){
        return "Consultado";
    }
    //Metodo INT retorna valor um inteiro.
    int horarioAtendimento(){
        return 10;
    }
    public int PrecoConsulta(int valorApagar) {
        return valorApagar - desconto;                     // Calcula o valor final da consulta
    }
}