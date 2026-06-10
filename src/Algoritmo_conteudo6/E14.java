package Algoritmo_conteudo6;
import java.util.Scanner;
public class E14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale um numero de 4 digitos:");
        String num = scanner.nextLine();

        if (num.length() != 4) { // acho que era pra usar < ou > e &&, porem e tao idiota que eu nem pensei por esse lado kkkkkkkkkk
            System.out.println("Fale um numero que tenha 4 digitos");
        }
        int numero = Integer.parseInt(num);
        int resultado;
        for (int i = 0; i < 4; i++) {
            resultado = numero % 10;
            System.out.print(resultado);
            numero /= 10;
        }

    }
}
// tem 2 solucoes, string e int