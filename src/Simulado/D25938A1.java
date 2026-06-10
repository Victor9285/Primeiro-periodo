package Simulado;
import java.math.BigDecimal;
import java.util.Scanner;
public class D25938A1 {
    public static void main(String[]args){
        double den = 1, total = 0;
        int sinal = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale o valor de x em radianos:");
        double x = scanner.nextDouble();
        System.out.println("Fale a quantidade de termos que tera a serie:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            double expoente = 3 + (i - 1) * 2;
            double num = Math.pow(x, expoente);

            for(int j = 1; j <= expoente; j++){
               den *= j;
            }
            total += sinal * num/den;
            sinal *= -1;
        }
        System.out.println(x - total);
    }
}
