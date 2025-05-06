package MembrosEstaticos;

import java.util.Scanner;

public class Aplicacao {

    public static final double PI = 3.14159;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio:");
        double raio = scanner.nextDouble();

        double c = circunferencia(raio);
        double v = volume(raio);

        System.out.printf("Circunferência: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", PI);

        scanner.close();
    }

    public static double circunferencia(double raio) {
        return 2 * PI * raio;
    }

    public static double volume(double raio) {
        return (4 / 3) * PI * Math.pow(raio, 3);
    }
}
