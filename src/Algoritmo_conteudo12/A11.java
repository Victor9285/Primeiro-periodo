package Algoritmo_conteudo12;
import java.util.Scanner;
public class A11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int quantidade = 8;
        double maior = 0;
        String maiornome = "";

        double[] nota = new double[quantidade];
        String[] nome = new String[quantidade];
        for(int i = 0; i < quantidade; i++){
            System.out.println("Fale o nome do aluno " + (i + 1) +":");
            nome[i] = scanner.nextLine();
            System.out.println("Fale a nota da(o) " + nome[i] + ":");
            nota[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        for(int i = 0; i < quantidade; i++) {
            if (nota[i] > maior) {
                maior = nota[i];
                maiornome = nome[i];
            }
        }
        System.out.println("Maior nota e da(o): " + maiornome.toUpperCase());


    }
}
