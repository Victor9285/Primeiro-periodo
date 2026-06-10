package Algoritmo_conteudo12;
import java.util.Arrays;
import java.util.Scanner;
public class A15 {
    public static void main(String[] arsgs) {

        Scanner scanner = new Scanner(System.in);
        String[] meses = new String[12];
        for (int i = 0; i < 12; i++) {
            System.out.println("Fale o mes " + (i + 1) + "º mês: ");
            meses[i] = scanner.nextLine();
        }
        Arrays.sort(meses, String.CASE_INSENSITIVE_ORDER);

        System.out.println(Arrays.toString(meses));
        }
    }