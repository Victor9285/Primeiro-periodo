
package PROVA;
import java.util.Scanner;
public class D25938A {
    public static void main(String[] args){
        double fatorial = 1, total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale a quantidade de termos:"); //faz a pergunta
        int termos = scanner.nextInt();
        for(int i = 0; i <= termos; i++) { // faz ate a quantidade de termos que sera

            for (int j = i; j > 1; j--){ // faz o fatorial
                if (j == 0){
                    total += 1;
                }
                fatorial *= j;
            }

            total += (1/fatorial); //faz a somatoria de tudo em uma variavel
        }
        System.out.println(total);
        scanner.close();
    }
}


