package SegundoNivelJava;

public class Paciente {

    String nome;
    int idade;
    String endereco;
    String sintomas;
    int peso;

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
    //Metotodo INT retorna valor um inteiro.
    int horarioAtendimento(){
        return 10;
    }
    /*int valor = consultado(int valorApagar){
        return valorApagar - 300;  //300 é o valor da consulta

    }*/
}