package Algoritmo_conteudo9;

import java.util.Scanner;

public class E4_1vezes2divididopor3e4 {
    public static void main(String[] args) {
        double n1 = 1, n2 = 2, n3 = 3, n4 = 4, somatorio = 0, total = 0, antsomatorio = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale quantas series de numeros voce quer:");
        int series = scanner.nextInt();
        antsomatorio = (n1 * n2) / (n3 * n4);
        for (int i = 2; i <= series; i++) {
            somatorio = ((n1 + i * 4.0) * (n2 + i * 4.0) / ((n3 + i * 4.0) * (n4 + i * 4.0)));
            total += somatorio;
        }
        System.out.println(antsomatorio + total);
        scanner.close();
    }

}
