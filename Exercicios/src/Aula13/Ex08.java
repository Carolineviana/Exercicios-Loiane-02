package Aula13;

/**
 * Faça um programa que pergunte quanto você ganha por hora
 * e o número de horas trabalhadas no mês.
 * Calcule e mostre o total do seu salário no referido mês.
 */

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor hora: ");
        double valorHora = scan.nextDouble();

        System.out.print("Entre com a quantidade de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();

        double salario = valorHora * horas;
        System.out.print("O sálario é de: " + salario);
    }
}
