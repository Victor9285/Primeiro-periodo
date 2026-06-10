package Algoritmo_conteudo11;

import java.util.Scanner;

public class A13_ValorAoQuadrado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos termos tera a serie?");
        double termos = scanner.nextDouble();
        int i = 1;
        double total = 0;
            do {
                double num = i * Math.pow((10 + (i - 1 ) * 9), i * 2);
                double den = Math.pow(7, i - 1);
                double serie = num / den;
                total += serie;
                        i++;
            } while (i <= termos);
        System.out.println( 71 + Math.cbrt(total));
    }
}
