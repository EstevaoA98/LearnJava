package CalculoTriangulo.Triangulo;

import CalculoTriangulo.Entidade.Triangulo;

import java.util.Scanner;

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

        double areaX= x.area();

        double areaY = y.area();

        System.out.printf("Área X: %.4f%n", areaX);

        System.out.printf("Área Y: %.4f%n", areaY);


        if (areaX > areaY) {
            System.out.println("Maior area: X");
        } else {
            System.out.println("Maior area: Y");
        }


    }
}
