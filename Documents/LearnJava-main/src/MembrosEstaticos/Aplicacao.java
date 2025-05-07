package MembrosEstaticos;

import MembrosEstaticos.utilitario.Calculador;

import java.util.Scanner;

public class Aplicacao {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculador calc = new Calculador();

        System.out.println("Digite o valor do raio:");
        double raio = scanner.nextDouble();

        double c = Calculador.circunferencia(raio);
        double v = Calculador.volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", PI);

        scanner.close();
    }
}
