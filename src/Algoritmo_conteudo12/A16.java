package Algoritmo_conteudo12;
import java.util.Scanner;
import java.util.Arrays;
public class A16 {
    public static void main(String[] args){
        int quantidade = 3;

        Scanner scanner = new Scanner(System.in);
        String[] nome = new String[quantidade];
        int[] populacao = new int[quantidade];
        String[] estado = new String[quantidade];

        for (int i = 0; i < quantidade; i++){
            System.out.println("Qual o nome da sua cidade:");
            nome[i] = scanner.nextLine();
            System.out.println("Qual a populacao da sua cidade:");
            populacao[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual e o estado da sua cidade:");
            estado[i] = scanner.nextLine();
        }
        Arrays.sort(populacao);
        for(int i = quantidade - 1; i > quantidade - 10; i--){
            System.out.println(populacao[i]);

        }

    }
}
