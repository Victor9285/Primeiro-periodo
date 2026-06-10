package Simulado;

import java.util.Scanner;

public class D25938B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale um numero que irei testar se ele e primo:");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.printf("Fale um numero maior que 0");
            return;
        }
        if (n == 2 || n == 1){
            System.out.println("E numero primo");
            return;
        }
        int vezesdivididas = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                vezesdivididas++;
            }
        }
        if (vezesdivididas == 2) {
            System.out.println("E numero primo");
        } else {
            System.out.println("Nao e numero primo");
        }

    }
}
