package Algoritmo_conteudo12;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Exemplo3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");
            double[] valores = new double[10];
            for (int i = valores.length; i >= 0; i--){
                System.out.println("Valor:");
                valores[i] = scanner.nextDouble();
                System.out.println(df.format(valores[i] % 3));
            }

    }
}
