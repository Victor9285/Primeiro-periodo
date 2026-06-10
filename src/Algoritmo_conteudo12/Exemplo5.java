package Algoritmo_conteudo12;
import java.util.Scanner;
public class Exemplo5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[1000];
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Numero "+ (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
       
            System.out.println("Qual numero voce qer saber se foi enformado pelo usario?");
            int proucurar = scanner.nextInt();
        
            for (int i = 0; i < numeros.length; i++){
                if (proucurar == numeros[i]){
                    System.out.println("A posicao que o numero esta é igual a " + numeros[(i)]);
                }else {
                    System.out.println("Numero nao encontrado");
                }
            }
            scanner.close();
        }  
}
