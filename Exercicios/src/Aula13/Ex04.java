package Aula13;

/**
 * Faça um programa que peça as 4 notas bimestrais e mostre a média.
 */

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Entre com a segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.print("Entre com a terceira nota: ");
        double nota3 = scan.nextDouble();

        System.out.print("Entre com a quarta nota: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.print("A média é: " + media);
    }
}
