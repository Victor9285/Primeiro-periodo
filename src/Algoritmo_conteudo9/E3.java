package Algoritmo_conteudo9;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        int number = 4, number2 = 3;
        double conta = 0, total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale quantas series de numeros voce quer:");
        int series = scanner.nextInt();
        for (int i = 1; i <= series; i++) {
            conta = ((1 + Math.sqrt((number * i))) / (number2 * i));
            total += conta;
        }
        System.out.println(total);
        scanner.close();
    }
}
