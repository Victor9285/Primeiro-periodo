package Algoritmo_conteudo11;

import java.util.Scanner;

public class A11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale um numero inteiro de 1 a 9");
        int n = scanner.nextInt();
        if (n > 9 || n < 1){
            System.out.println("Numero invalido.");
            return;
        }
        for (int i = 1; i <= n; i++){
            System.out.println();
                for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
        }
    }
}
