package Aula13;

/**
 * Faça um programa que peça o tamanho de um arquivo para download (em MB)
 * e a velocidade de um link de internet (Mbps),
 * calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
 */

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com o tamanho do arquivo: ");
        double tamArquivo = scan.nextDouble();

        System.out.print("Entre com a velocidade da internet: ");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.print("O tempo aproximado de download é: " + tempo);
    }
}
