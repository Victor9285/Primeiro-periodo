package Algoritmo_conteudo12;
import java.util.Scanner;
public class A21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
            for(int i = 0; i < 20; i++){
                System.out.println("Fale o numero " + (i + 1) + "º numero: ");
                numeros[i] = scanner.nextInt();
            }
            System.out.print("Numeros informados: ");
            for (int i = 0; i < 20; i++){
                System.out.print(numeros[i] + " ");
            }
            System.out.println();
            System.out.print("Numeros impressos: ");
             for (int i = 0; i < 20; i++){
                if (numeros[i] % 2 != 0){
                    System.out.print(numeros[i] + " ");
                }
             }
             for (int i = 0; i < 20; i++){
                if (numeros[i] % 2 == 0){
                    System.out.print(numeros[i] + " ");
                 } 
            }
        scanner.close();
    }
}
