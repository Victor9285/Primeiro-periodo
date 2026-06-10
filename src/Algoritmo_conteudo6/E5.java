package Algoritmo_conteudo6;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fale um numero inteiro:");
        int n1 = scanner.nextInt();

        if (n1 % 5 == 0 && n1 % 7 == 0){
            System.out.println("Ele e divisivel por 5 e por 7 ao mesmo tempo");
        } else {
            System.out.println("Ele nao e divisivel por 5 por 7 ao mesmo tempo");
        }
    }
}
