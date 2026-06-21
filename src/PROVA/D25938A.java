package PROVA;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class D25938A {
        public static void main(String[] args) {
            int p = 0;
            Scanner scanner = new Scanner(System.in);
            int[] numeros = new int[50];
            List<Integer> numerosPares = new ArrayList<Integer>();
                for (int i = 0; i < numeros.length; i++){
                    System.out.println("Fale o " + (i + 1) + "º numero:"); //Faz a leitura dos numeros
                    numeros[i] = scanner.nextInt();
                }
                scanner.close();
                for (int i = 0; i < numeros.length; i++){
                    if(numeros[i] % 2 == 0){
                        numerosPares.add(numeros[i]); //chega se o numero é par
                        p++;
                    }
                }
                numerosPares.sort(null); //coloca em ordem crescente
                if (p == 0){
                    System.out.println("Nao tem numeros pares"); 
                    return;
                }
                System.out.println("PARES");
                for (int i = 0; i < numerosPares.size(); i++){ //Coloca no terminal os numeros pares
                    System.out.println(numerosPares.get(i));
                }
        
        }
}
