package Algoritmo_conteudo12;
import java.util.Scanner;
public class A25 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale sua frase:");
        String nome = scanner.nextLine();
        String frase[] = nome.split(" ");
        for(int i = 0; i < frase.length; i++){
            System.out.println(frase[i]);
        }
        scanner.close();
    }
}
