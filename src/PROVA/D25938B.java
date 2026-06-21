package PROVA;
import java.util.Scanner;
public class D25938B {
    public static void main(String[] args) {
        String[] nome = new String[4];
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][3];
        
        for (int i = 0; i < 4; i++){
            System.out.println("Fale o nome do aluno " + (i + 1) + ": "); //pega o nome dos alunos
            nome[i] = scanner.nextLine().toUpperCase();
        }

         for (int i = 0; i < 4; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("Nota de cada aluno: (Aluno: " + nome[i] + " " + (j + 1) + "º nota): ");
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > 10){
                    System.out.println("NOTA INVALIDA!");
                    return;
                }
            }
        }
        scanner.close();
         int[] media = new int[4];
        for (int i = 0; i < 4; i++) {
            media[i] = 0;
            for (int j = 0; j < 3; j++) 
                media[i] += matriz[i][j];
                media[i] /= 3;
        }
        System.out.println();
        for (int i = 0; i < 4; i++){
            System.out.print("Aluno " + nome[i] + ": ");
            for (int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int temp;
        String tempNome;
        for (int aux=0; aux<media.length-1; aux++){
            for (int x=0; x<media.length-1; x++){
                if (media[x] < media[x+1]) {
                temp = media[x];
                media[x] = media[x+1];
                media[x+1] = temp;
            
                tempNome = nome[x];
                nome[x] = nome[x + 1];
                nome[x + 1] = tempNome;
            }
            }
        }

        System.out.println();
        System.out.println("RANKING:");
        for (int i = 0; i < 4; i++) {
           System.out.print((i + 1) + "º lugar " + nome[i] + ": " + media[i] + "\n");
        }
    }
}
