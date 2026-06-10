package Algoritmo_conteudo6;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;

public class E10 {
    private static final Logger logger = Logger.getLogger(E10.class.getName());
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        logger.info("O progama iniciou corretamente");
        System.out.println("Capital aplicada");
        double capAplicado = scanner.nextDouble();
        System.out.println("Numero de dias que ficou aplicado");
        double days = scanner.nextDouble();
        System.out.println("Taxa diaria");
        double taxInDay = scanner.nextDouble();
        taxInDay = taxInDay / 100;

        double rend = capAplicado * taxInDay * days;
        double impost = rend * 0.15; //15% do rendimento
        //resgatado = money + money - rend - 10
        double resgatado = capAplicado + rend - impost - 10;
        System.out.println("O valor resgatado sera: RS" + resgatado);
    }
}
