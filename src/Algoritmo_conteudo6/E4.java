package Algoritmo_conteudo6;
import java.util.Scanner;
public class E4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual sua altura?");
        double altura = scanner.nextDouble();
        System.out.println("Qual seu peso?");
        double peso = scanner.nextDouble();

        double IMC = (peso / (altura * altura));
        if (IMC < 18){
            System.out.println("Voce esta desnutrida");
        } else if (IMC < 20){
            System.out.println("Voce esta abaixo do peso");
        } else if (IMC >= 20 && IMC <= 25){
            System.out.println("Voce esta no peso ideal");
        } else if (IMC > 25){
            System.out.println("Voce esta acima do peso");
        } else if (IMC > 27){
            System.out.println("Voce esta obeso");
        }

    }
}
