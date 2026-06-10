package Algoritmo_conteudo9;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
        double n2 = 3, n3 = 7, sequencia = 0, total = 0, antseq = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos termos tera o progama?");
        int termos = scanner.nextInt();
        for (int i = 1; i <= termos; i++){
            sequencia = (((i - 1) * 2) + (n2 * i))/(n3 + (i - 1) * 6); // i vai ser 0 = 7, na prox rodada vai ser 7 + 6 ea sssim porm diante
            total += sequencia;
        }
        System.out.println(5 * total);
    }
}
