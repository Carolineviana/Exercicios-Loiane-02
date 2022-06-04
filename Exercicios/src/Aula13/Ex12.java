package Aula13;

/**
 * Tendo como dados de entrada a altura de uma pessoa,
 * Construa um algoritmo que calcule seu peso ideal,
 * usando a seguinte fórmula: (72,7 * altura) - 58.
 */

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a altura: ");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O peso ideal é: " + pesoIdeal);

    }
}
