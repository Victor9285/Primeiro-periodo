package Algoritmo_conteudo8;
import java.util.Scanner;
public class E18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale um numero para calcular a tabuada");
        int n1 = scanner.nextInt();
            for (int i = 1; i <= 9; i++){
                int res = n1 * i;
                System.out.println(i + " x " + n1 + " = " + res);
            }
    }
}
