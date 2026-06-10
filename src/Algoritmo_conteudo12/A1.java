package Algoritmo_conteudo12;
import java.util.Scanner;
public class A1 {
    public static void main(String[] args){
        int qnt  = 0;
        Scanner scanner = new Scanner(System.in);
        int[] var = new int[10];
        for(int i = 0; i < var.length; i++){
            System.out.println("Fale um numero inteiro e testara se ele e divisivel por 5 e 7 ao mesmo tempo.");
            var[i] = scanner.nextInt();
            if (var[i] % 5 == 0 && var[i] % 7 == 0){
                qnt++;
            }
        }
        System.out.println("Quantidade de divisores de 5 e 7 ao mesmo tempo: " + qnt);
    }
}
