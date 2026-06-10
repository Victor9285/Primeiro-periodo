package Algoritmo_conteudo12;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class A20 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.#");
        double media = 0, quant = 0;
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Fale o numero " + (i + 1));
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Numeros impressos: " + Arrays.toString(numeros) + " ");
        System.out.print("Numeros impressos (ultimo numero informado " + numeros[9] + "): ");
        for (int i = 0; i <numeros.length; i++){
            if (numeros[i] > numeros[9]){
                System.out.print(numeros[i] + " ");
                media += numeros[i];
                quant++;
            }
        }
        System.out.println();
        if (quant > 0){
            System.out.println("Media dos numeros: " + df.format(media/quant));
        }
        scanner.close();
    }
}
