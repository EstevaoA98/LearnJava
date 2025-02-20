package SegundoNivelJava;

public class Main {
    public static void main(String[] args) {

        //Classe Paciente = Uma classe é como um molde ou um modelo para criar objetos. Ela define atributos (variáveis) e comportamentos (métodos) que os objetos terão.

        //Objeto = Uma instância de uma classe, que representa um objeto real na memória para armazenar dados e executar comportamentos.



        Paciente Maria = new Paciente();
        Maria.nome = "Maria da silva";
        Maria.idade = 62;
        Maria.endereco = "Rua dos Amendoins";
        Maria.sintomas = "Gripe e dor no corpo";
        Maria.peso = 60;

        Paciente Jose = new Paciente();
        Jose.nome = "Jose de Oliveira";
        Jose.idade = 59;
        Jose.endereco = "Rua 22";
        Jose.sintomas = "Dor no estômago e diarreia";
        Jose.peso = 75;

        System.out.println("Paciente: " + Maria.nome + "\n idade: " + Maria.idade + "\n Endereço: " + Maria.endereco + "\n Sintomas: " + Maria.sintomas + "\n Peso do paciente:");
        System.out.println("-----------------------------");
        System.out.println("Paciente: " + Jose.nome + "\n idade: " + Jose.idade + "\n Endereço: " + Jose.endereco + "\n Sintomas: " + Jose.sintomas + "\n Peso do paciente:");
    }
}
