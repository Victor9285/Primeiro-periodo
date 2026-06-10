package Algoritmo_conteudo12;
import java.util.Scanner;
public class A4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] chegada = new int[20];
        for(int i = 0; i < chegada.length; i++) {
            System.out.println("Corredor " + (i + 1));
            chegada[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++){
            System.out.println((i + 1) +"º - " + chegada[i] + " / " + chegada[i + 10] );
        }
    }
}
