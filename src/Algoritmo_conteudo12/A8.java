package Algoritmo_conteudo12;
import java.util.Scanner;
public class A8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[20];

        for(int i = 0; i < num.length; i++){
            System.out.println("Fale o nuemro " + (i + 1));
            num[i] = scanner.nextInt();
        }
        for(int i = 0; i < 10; i++){
            System.out.print((num[i] + num[i + 10]) + " ");
        }
    }
}
