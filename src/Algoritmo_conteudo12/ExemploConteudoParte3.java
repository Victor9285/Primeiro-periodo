package Algoritmo_conteudo12;
import java.util.Scanner;
public class ExemploConteudoParte3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Fale o tamanho da matriz (N x N):");
        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println("Informe um número inteiro (" + i + "x" + j + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("A MATRIZ:");
         for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); //Ja montamos a matriz, agora e fazer a digonal.
        }
        System.out.println("A DIAGONAL:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    System.out.print(matriz[i][j] + " ");
                    // pediu para adicionar um vetor, no caso seria so criar ele que ja funcionaria.
                }
            }
        }
        System.out.println();
        int[] vetSoma = new int[n];
        for (int i = 0; i < n; i++) {
            vetSoma[i] = 0; //garante que vai ser 0 o valor toda vez que rodar um novo, ou seja, comeca no 0, quando ir pro 1, sera 0.
            for (int j = 0; j < n; j++) //pega o primeiro numero matriz[0][0] e soma em vetSoma[aux1]
                vetSoma[i] += matriz[i][j];
        }
        System.out.println("SOMA DAS COLUNAS:");
        for (int i = 0; i < n; i++) {
           System.out.print("COLUNA " + i + ": " + vetSoma[i] + "\n");
        }

    scanner.close();
    }
}
