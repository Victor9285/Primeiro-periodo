package Algoritmo_conteudo12;
import java.util.Arrays;
import java.util.Scanner;
public class A19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int[] vet1 = new int[10];
            int[] vet2 = new int[10];

            for(int i = 0; i < 10; i++){
                System.out.println("Fale 10 numeros");
                vet1[i] = scanner.nextInt();
            }
            for(int i = 0; i < 10; i++){
            vet2[9 - i] = vet1[i];
            }
                System.out.println("Vetor 1 = " + Arrays.toString(vet1) + " ");
                System.out.println("Vetor 2 = " + Arrays.toString(vet2) + " ");
            
        scanner.close();
    }
}
