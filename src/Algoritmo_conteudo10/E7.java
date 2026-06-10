package Algoritmo_conteudo10;

import java.util.Scanner;

public class E7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale quantas pessoas vivem nessa reagiao: ");
        int people = scanner.nextInt();
        int day = 0;
        double population = 1, growrate = 0.003; // 0.03% people in one day
        do{
            population += population * growrate;
            day++;

        }while(population <= people);

        int year = 0, month = 0, days = 0;
        if(day > year){
            year = (int)day/365;
            day = day % 365;
            month = (int)day/30;
            day = day % 30;
            days = day;
        }
        System.out.println("YEAR: " + year);
        System.out.println("MONTHS: " + month);
        System.out.println("DAYS: " + days);
    }
}
