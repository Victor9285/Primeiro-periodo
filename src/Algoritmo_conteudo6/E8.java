package Algoritmo_conteudo6;
import java.util.Scanner;
public class E8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale sua altura em metros:");
        double altura = scanner.nextDouble();
        System.out.println("Fale o seu peso: ");
        double peso = scanner.nextDouble();
        double IMC = (peso / (altura * altura));
        System.out.println("Seu IMC e: " + IMC);
        if (IMC <= 20){
            System.out.print("Entao voce esta abaixo do peso");
        } else if (IMC <= 25 && IMC > 20){
            System.out.print("Entao voce esta no peso ideial");
        } else {
            System.out.print("Entao vouce esta acima do peso");
        }

    }
}
