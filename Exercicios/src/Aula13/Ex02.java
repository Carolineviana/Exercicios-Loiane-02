package Aula13;

/**
 * Faça um programa que peça um número e então mostre a mensagem
 * "O número informado foi: ".
 */

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um número inteiro: ");
        int numero = scan.nextInt();
        System.out.println("O número informado foi: " + numero);
    }
}
