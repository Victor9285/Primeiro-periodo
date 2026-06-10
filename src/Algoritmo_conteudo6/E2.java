package Algoritmo_conteudo6;
import java.util.Scanner;
public class E2 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Fale o numero de poluentes da empresa: ");
    double n1 = scanner.nextDouble();
    if (n1 < 1500){
        System.out.println("Isento de imposto.");
    } else if(n1 > 1500 && n1 <= 3500){
        System.out.println("A multa sera no valor de RS3.000,00.");
    } else if(n1 > 3500){
        double valor = (5000 * (n1));
        System.out.println("A multa sera de RS " + valor);
    }
        scanner.close();
    }
}
