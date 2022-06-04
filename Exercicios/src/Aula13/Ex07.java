package Aula13;

/**
 * Faça um programa que calcule a área de um quadrado
 * e em seguida mostre o dobro dessa área para o usuário.
 */

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o tamanho do lado do quadrado: ");
        double lado = scan.nextDouble();

        //area = lado * lado
        double area = Math.pow(lado, 2);

        System.out.print("A área do quadrado é: " + area);
        System.out.println();
        System.out.print("O dobro da área do quadrado é: " + (area * 2));
    }
}
