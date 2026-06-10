package Algoritmo_conteudo9;
import java.util.Scanner;
public class E9 {
    public static void main(String[] args) {
        double sequencia = 0, total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos termos tera a serie?");
        int termos = scanner.nextInt();
        for (int i = 1; i <= termos; i++){
            sequencia = (9 * Math.pow(3, (i - 1))) / ((9 + i) * Math.sqrt(Math.pow(i, 4)));
            total += sequencia;
        }
        System.out.println(100 - Math.pow(total, 3));
        //pogou a ideia e i - 1 e simplesmnete colocou ela na potencia, entao 9 * 3^0 = 9 * 1 e vai da tudo certinho
    }
}
