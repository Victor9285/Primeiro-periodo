package Algoritmo_conteudo6;
import java.util.Scanner;
public class E6 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        System.out.println("Valor do A");
        double a = scanner.nextDouble();
        System.out.println("Valor do B");
        double b = scanner.nextDouble();
        System.out.println("Valor do C");
        double c = scanner.nextDouble();

        double x = ((-b + Math.sqrt((b*b) - 4 * a * c))/(2 * a));
        // System.out.println(x);
        double x1 = ((-b - Math.sqrt((b*b) - 4 * a * c))/(2 * a));
        //System.out.println(x1);
        if (x == x1){
            System.out.println(x);
        } else {
            System.out.println(x);
            System.out.println(x1);
        }
    }
}
