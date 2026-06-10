package Algoritmo_conteudo12;
import java.util.Scanner;
public class A17 {
    public static void main(String[] args) {
        double media = 0, total = 0;
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Fale o numero");
            numeros[i] = scanner.nextInt();
        }
        System.out.print("Valores informados: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
        System.out.print("Numeros pares: ");
        for(int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0) {
                total += numeros[i];
                media++;
                System.out.print(numeros[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Media dos numeros pares: " + (total / media));
        scanner.close();
    }
}

