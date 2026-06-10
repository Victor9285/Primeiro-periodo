package Algoritmo_conteudo10;
import java.util.Scanner;
public class E6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.println("VALOR A:");
            double a = scanner.nextDouble();
            System.out.println("VALOR B:");
            double b = scanner.nextDouble();
            System.out.println("VALOR C:");
            double c = scanner.nextDouble();
        System.out.println("------");

        double distance = 0, y, x;
            do{
                System.out.println("FAlE AS CORDENADAS X");
                x = scanner.nextDouble();
                System.out.println("FALE AS CORDENDASS Y");
                y = scanner.nextDouble();

                distance  = (a * x + b * y + c) / Math.sqrt(a * a + b * b);
                System.out.println(distance);
        }while(distance != 0);

    }
}
