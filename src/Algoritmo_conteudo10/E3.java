package Algoritmo_conteudo10;
import java.util.Scanner;
public class E3 {
    public static void main(String[] args) {
        double raio = 0;
    Scanner scanner = new Scanner(System.in);
        System.out.println("Fale o angulo do setor circular: ");
        double angulo = scanner.nextDouble();
    do {
        System.out.println("Fale o raio do setor circular: (PARA FINALIZAR DIGITE: -1)");
        raio = scanner.nextDouble();
        double setorc = (angulo * Math.PI * (raio * raio))/360;
        System.out.println("Com o raio " + raio + " sera: " + setorc );
    } while(raio != -1);

    }
}
