package Algoritmo_conteudo11;
import java.util.Scanner;
import static java.lang.Math.*;
import java.text.DecimalFormat;
public class A1 {
    public static void main(String[] args){
        double n = 1;
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#");

        System.out.println("Fale o numero limite");
        int num = scanner.nextInt();
        while (n <= num) {
            if (n % 2 != 0) {
                System.out.println(df.format(pow(n, 2) + ((4 * n - 2) / 5)));
            }
            n++;
        }
    }
}