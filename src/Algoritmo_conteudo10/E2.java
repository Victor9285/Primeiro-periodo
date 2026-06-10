package Algoritmo_conteudo10;
import java.util.Scanner;
public class E2 {
    public static void main(String[] andreygay){
        Scanner scanner = new Scanner(System.in);
        double valor = 0, total = 0;
        int media = 0, acima = 0;
        do{
            System.out.println("Valor recebido pelos serviços");
            valor = scanner.nextDouble();
            total += valor;
            if (valor == 0)
                break;
            media++;
            if (valor > 1000)
                acima++;

        }while(valor != 0);
        System.out.println("Valor total: " + total);
        System.out.println("Media: " + total/media);
        System.out.println("Valores acima de 1000: " + acima);
    }
}
