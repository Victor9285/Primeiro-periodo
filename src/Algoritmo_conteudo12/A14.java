package Algoritmo_conteudo12;
import java.util.Scanner;
public class A14 {
    public static void main(String[] args){
        int quantidade = 100;

        Scanner scanner = new Scanner(System.in);
        int[] bilhete = new int[quantidade];
        for(int i = 0; i < quantidade; i++){
            System.out.println("Quais bilhetes a pessoa comprou?");
            bilhete[i] = scanner.nextInt();
        }
        System.out.println("O bilhete premiado e:");
        int bilhetepremiado = scanner.nextInt();
        for(int i = 0; i < quantidade; i++){
            if(bilhete[i]== bilhetepremiado){
                System.out.println("Voce foi premiado");
            } else System.out.println("Voce nao foi premiado");
        }

    }
}
