package Aula13;

/**
 * Faça um programa que peça a temperatura em graus Farenheit,
 * transforme e mostre a temperatura em graus Celsius.
 * C = (5 * (F-32)/9).
 */

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a temperatura em Farenheit: ");
        double f = scan.nextDouble();

        double c = (5 * (f-32)/9);

        System.out.print("A temperatura " + f + " F é igual a " + c + " C");
    }
}
