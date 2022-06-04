package Aula13;

/**
 * Faça um programa que peça a temperatura em graus Celsius,
 * transforme e mostre a temperatura em graus Farenheit.
 * f = (c * 1.8) + 32.
 */
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a temperatura em Celcius: ");
        double c = scan.nextDouble();

        double f = (c * 1.8) + 32;

        System.out.print("A temperatura " + c + " C é igual a " + f + " F");
    }
}
