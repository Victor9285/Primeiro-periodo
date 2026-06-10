package Algoritmo_conteudo12;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class A2 {
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<>();
        String valores = "";
        Scanner scanner  = new Scanner(System.in);
        int[] var = new int[10];
        for(int i = 0; i < var.length; i++) {
            System.out.println("Fale um numero e testara se ele e maior que 5 e menor que 10: ");
            var[i] = scanner.nextInt();
                if (var[i] > 5 && var[i] < 10)
                numeros.add(var[i]);
        }

        System.out.println("Numeros impressos: " + numeros);
    }
}
