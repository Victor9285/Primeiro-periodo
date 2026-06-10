package Algoritmo_conteudo12;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
         int[] valores = new int[10];
        for (int i = 0; i < valores.length; i++){
            System.out.println("Fale um numero:");
            valores[i] = scanner.nextInt();
        }
        for (int i = 0; i < valores.length; i++){
            System.out.print(valores[i] * valores[i] + " ");
        }
    }
}
