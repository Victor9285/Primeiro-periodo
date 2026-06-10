package Algoritmo_conteudo12;
import java.util.Scanner;
public class A9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numeros = 0;
        int[] num = new int[10];
        for(int i = 0; i < num.length; i++){
            System.out.println("Numero " + (i + 1));
            num[i] = scanner.nextInt();
        }
        for(int i = 0; i < num.length; i++){
            numeros += num[i];
        }
        for(int i = 0; i < num.length; i++){
            if(numeros % num[i] == 0)
                System.out.print(num[i] + " ");
        }
        scanner.close();
    }
}
