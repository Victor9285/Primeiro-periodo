package Algoritmo_conteudo5;
import java.util.Scanner;
public class E7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fale o valor de X");
        double x = scanner.nextDouble();
        System.out.println("O valor de X na funcao f(x) = " + f(x));

    }
    public static double f(double x) {
        return x - 3 / (x * x) - 4; // x - 3/x2 - 4 funcao f de x
    }
}
