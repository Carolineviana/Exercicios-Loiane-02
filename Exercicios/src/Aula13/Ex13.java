package Aula13;

/**
 * Faça um programa que pergunte quanto você ganha por hora e o
 * número de horas trabalhadas no mês.
 * Calcule e mostre o total do seu salário no referido mês,
 * Sabendo-se que são descontatos:
 * 11% para o Imposto de Renda
 * 8% para o INSS
 * 5% para o sindicato
 * Faça um programa que nos dê:
 * a) Quanto pagou ao INSS
 * b) Quanto pagou ao sindicato
 * c) O sálario líquido.
 * d) Calcule os descontos e o salário líquido, conforme a tabela abaixo:
 * + Salário Bruto: R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato (5%) : R$ = Sálario Líquido : R$.
 */

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o valor hora: ");
        double valorHora = scan.nextDouble();

        System.out.print("Entre com a quantidade de horas trabalhadas no mês: ");
        double horas = scan.nextDouble();

        double salarioBruto = valorHora * horas;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Sálario Bruto: " + salarioBruto);
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("IR: " + ir);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Sálario Líquido: " + salarioLiquido);
    }

    }
