package Algoritmo_conteudo5;
import java.util.Scanner;
import static java.lang.Math.*; //tira a necessidade de ter que chamar a classe Math.
public class E6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fale o valor do ponto A");
        double a = scanner.nextDouble();
        System.out.println("Fale o valor do ponto B");
        double b = scanner.nextDouble();
        System.out.println("Fale o valor do ponto C");
        double c = scanner.nextDouble();
        System.out.println("Fale as cordenadas do ponto X");
        double x = scanner.nextDouble();
        System.out.println("Fale as cordenadas do ponto y");
        double y = scanner.nextDouble();
        double d = (a * pow(x, 0) + b * pow(y,0) + c)/ (sqrt(pow(a,2) + pow(b, 2)));
        System.out.println(d);

    }
}
