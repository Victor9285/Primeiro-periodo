package Algoritmo_conteudo8;
import java.util.Scanner;
import java.text.DecimalFormat;
public class E20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.#");
        System.out.println("Fale quantos termos terao a sequencia numerica");
        int n = scanner.nextInt();
        double total = 0;
        long soma = 0;
        for(int i = 0; i < n; i++){
            total = Math.pow(2, i);
            soma += total;
            System.out.println(df.format(total));
        }
        System.out.println("A soma dos " + n + " termos e: " + soma);
    }
}
