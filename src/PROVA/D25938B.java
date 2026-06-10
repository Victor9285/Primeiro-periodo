package PROVA;

import Algoritmo_conteudo9.E10_lista1.D;

import java.text.DecimalFormat;
import java.util.Scanner;

public class D25938B {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double quantidade = 0;
        double total = 0;

        for(int i = 1; i <= 20; i++){
            System.out.println("Fale o seu sexo. (H ou M)");
            String sexo = scanner.nextLine().toUpperCase(); //le a resposta e tranformar ela em uppercase
            while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M")){ //nao deixa colocar nada que nao seja H ou M
                System.out.println("Fale o seu sexo. Permitido apenar H ou M");
                sexo = scanner.nextLine().toUpperCase();
            }
            System.out.println("Cor dos olhos: (Azul ou Castanhos)");
            String olhos = scanner.nextLine().toLowerCase(); //le a resposta e tranforma ela em lowercase
            while (!olhos.equalsIgnoreCase("azul") && !olhos.equalsIgnoreCase("castanhos")){ // nao deixa nada que nao seja azul ou castanhos
                    System.out.println("Fale a cor do olho Azul ou castanhos.");
                    olhos = scanner.nextLine().toLowerCase();
            }
                if(sexo.equalsIgnoreCase("M")){
                    if (olhos.equalsIgnoreCase("azul")) { // olha se a mulher atende aos dois critérios
                        quantidade++;
                    }
                }
                total = (quantidade / 20) * 100;
        }
        System.out.println("Porcentagem de mulheres com olhos azuis: %" + total);
        scanner.close();
    }
}
