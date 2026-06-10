package AtividadePY;

import java.util.Scanner;
public class Atividade6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // or = ||
        int number = 73;
        System.out.println("Iremos comecar um jogo, ha um numero aleatorio e voce tem que acertar qual e: ");
        for(int i = 1; i <= 5; i++) {
            System.out.println("Tentativa " + i);
            int resp = scanner.nextInt();
            if (i == 5){
                System.out.println("Game over! O numero era 73.");
                System.out.println("Derrota! Voce teve 5 tentativas.");
                break;}
            if (resp < number) {
                System.out.println("Seu palpite foi menor que o numero secreto");
            } else if (resp > number) {
                System.out.println("Seu palpite foi maior que o numero secreto");
            } else {
                System.out.println("Parabens! Voce acertou em " + i + " tentativa(s)!");
                break;
            }
            //number - 73 - 5 = 68; 73 + 5 = 78
            if (resp >= 68 && resp <= 78) {
                System.out.println("Quente, muito perto");
            } else if (resp >= (number - 6) || resp >= (number - 20)) {
                System.out.println("Morno..");
            } else if (resp >= (number + 6) || resp >= (number + 20)) {
                System.out.println("Morno..");
            } else {
                System.out.println("Frio! Muito longe.");
            }



        }
    }
}
