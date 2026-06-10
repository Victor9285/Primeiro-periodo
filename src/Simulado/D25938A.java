package Simulado;

import java.util.Scanner;

public class    D25938A {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double total =1, num = 0, fatorial = 0;
        int sinal = -1;

        System.out.println("Fale o grau X em radianos:");
        double x = scanner.nextDouble();
        System.out.println("Fale a quantidade de termos que tera:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
          num = Math.pow(x, 3 + (i - 1) * 2);
        }
        for (int i = 1; i <= n ; i++){
            int exp = (3 + (i - 1) * 2);
            for (int j = 1; j <= exp; j++) {
                fatorial *= j;
            }

            total += sinal*(num/fatorial);
            sinal *= -1;
        }
        System.out.println( x + total);
    }
}
