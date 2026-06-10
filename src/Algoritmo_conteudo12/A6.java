package Algoritmo_conteudo12;
import java.util.Scanner;
public class A6 {
    public static void main(String[] arsgs){
        Scanner scanner = new Scanner(System.in);
        String[] meses = new String[12];
        for(int i = 0; i < 12; i++){
            System.out.println("Fale o mes " + (i + 1));
            meses[i] = scanner.nextLine();
        }
        for (int i = meses.length - 1; i >= 0; i--){
            System.out.print(meses[i] + " ");

        }
    }
}
