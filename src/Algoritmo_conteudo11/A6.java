package Algoritmo_conteudo11;

import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0,canal4 = 0, canal7 = 0, canal12 = 0;
        while (i < 100) {
            i++;
            System.out.println("CANAL QUE ESTAVA ASSINSTINDO: ");
            int canal = scanner.nextInt();
            if (canal == 4 || canal == 7 || canal == 12) {
                System.out.println("Quntas pessoas estavam assistindo?");
                int quantidade = scanner.nextInt();
                if (canal == 4){
                    canal4++;
                } else if (canal == 7){
                    canal7++;
                } else{
                    canal12++;
                }

            }
        }
    }
}