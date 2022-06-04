package Aula13;

/**
 * Faça um programa que converta metros para centímetros.
 */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a quantidade de metros: ");
        double metros = scan.nextDouble();

        //1m = 100cm
        double cm = metros * 100;

        System.out.print(metros + " m é igual a " + cm + " cm");
    }
}
