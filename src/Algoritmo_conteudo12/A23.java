package Algoritmo_conteudo12;
import java.util.Scanner;
public class A23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int[] divPor3 = new int[10];
        int j = 0;
            for (int i = 0; i <numeros.length; i++){
                System.out.println("Fale o numero na posicao " + (i + 1) + "º: ");
                numeros[i] = scanner.nextInt();
            }
            for(int i = 0; i < numeros.length; i++){
                if(numeros[i] % 3 == 0){
                    divPor3[j] = numeros[i];
                     System.out.print(divPor3[j] + " ");
                    j++;
                }
            }
        scanner.close();
    }
}
