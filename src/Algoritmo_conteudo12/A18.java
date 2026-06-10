package Algoritmo_conteudo12;
import java.util.Scanner;
public class A18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Fale 10 numeros inteiros qualquer " + (i + 1) + " :");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Fale agora um numero real para multiplicar");
        double numreal = scanner.nextDouble();
        for (int i = 0; i < numeros.length; i++){
            System.out.print((numeros[i] * numreal) + " ");
        }
        scanner.close();
    }
}
