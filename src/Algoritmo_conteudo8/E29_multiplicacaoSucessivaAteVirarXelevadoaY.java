package Algoritmo_conteudo8;
import java.util.Scanner;
public class E29_multiplicacaoSucessivaAteVirarXelevadoaY {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale o valor de x");
        int x = scanner.nextInt();
        System.out.println("Fale o valor de y");
        int y = scanner.nextInt();
        while (x != Math.pow(x, y)){
           x = x * x;
            System.out.println(x);

        }
    }
}
