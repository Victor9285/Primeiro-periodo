package Algoritmo_conteudo6;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual o valor das vendas vendidas pelo vendedor?");
    double money = scanner.nextDouble();
    if (money < 1000){
        System.out.println("O seu salario sera RS240.00");
    } else if (money >= 1000 && money <= 10000){
        System.out.println("O seu salario sera RS" + (240 + (money * 0.10)));
    } else if (money > 10000){
        System.out.println("O seu salario sera RS1240.00");
    }
    scanner.close();


    }
}
