package Aula13;

/**
 * Faça um programa que mostre o raio de um círculo.
 * Calcule e mostre o raio de sua área.
 */

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o raio do círculo: ");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é: " + area);
    }
}
