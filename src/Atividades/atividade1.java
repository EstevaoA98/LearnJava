package Atividades;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC, area, perimetro;

        System.out.println("Digite o valor de x: ");
        xA = leitor.nextDouble();
        xB = leitor.nextDouble();
        xC = leitor.nextDouble();
        System.out.println("Digite o valor de y: ");
        yA = leitor.nextDouble();
        yB = leitor.nextDouble();
        yC = leitor.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX= Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        perimetro = (yA + yB + yC)/2.0;
        double areaY = Math.sqrt(perimetro * (perimetro - xA) * (perimetro - xB) * (perimetro - xC));

        System.out.printf("Área X: %.4f%n", areaX);
        System.out.printf("Perímetro X: %.4f%n", perimetro);
        System.out.printf("Área Y: %.4f%n", areaY);
        System.out.printf("Perímetro Y: %.4f%n", perimetro);


        if (areaX > areaY) {
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }


    }
}
