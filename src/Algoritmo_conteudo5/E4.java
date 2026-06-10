package Algoritmo_conteudo5;
import java.util.Scanner;

public class E4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do X1?");
        double x1 = scanner.nextDouble();
        System.out.println("Qual o valor do X2?");
        double x2 = scanner.nextDouble();
        System.out.println("Qual o valor do Y1?");
        double y1 = scanner.nextDouble();
        System.out.println("Qual o valor do Y2?");
        double y2 = scanner.nextDouble();
        double d = Math.sqrt((Math.pow((x2 - x1), 2)) + Math.pow((y2 - y1), 2));
       System.out.println("O valor de D sera: " + d);

    }
}
//fazer uma tela sera mt chato...