package Aplicacao;

import java.util.Scanner;
import Entidade.Triangulo;

public class Programa {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Triangulo x, y;
        x= new Triangulo();
        y= new Triangulo();

        System.out.println("Digite o valor de x: ");
        x.a = leitor.nextDouble();
        x.b = leitor.nextDouble();
        x.c = leitor.nextDouble();
        System.out.println("Digite o valor de y: ");
        y.a = leitor.nextDouble();
        y.b = leitor.nextDouble();
        y.c = leitor.nextDouble();

        double px = (x.a + x.b + x.c) / 2.0;
        double areaX= Math.sqrt(px * (px - x.a) * (px - x.b) * (px - x.c));

        double py = (y.a + y.b + y.c)/2.0;
        double areaY = Math.sqrt(py * (py - x.a) * (py - x.b) * (py - x.c));

        System.out.printf("Área X: %.4f%n", areaX);
        System.out.printf("Perímetro X: %.4f%n", px);
        System.out.printf("Área Y: %.4f%n", areaY);
        System.out.printf("Perímetro Y: %.4f%n", py);

        if (areaX > areaY) {
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }


    }
}
