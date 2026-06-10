package Algoritmo_conteudo6;
import java.util.Scanner;
import java.text.DecimalFormat;
public class E15 {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale o codigo do seu pacote:\n" +
                "Basic = 1 \n" +
                "Advanced = 2\n" +
                "Premium = 3");
        double codigo = scanner.nextDouble();
        if(codigo < 1 || codigo > 3){
            System.out.println("Fale algum codigo que esteja dentro dos parametros");
            return;
        }
         double diasppv = 0;
        if(codigo == 3) {}
        else{
            System.out.println("Fale a quantidade de dias assistidos canais Pay-per-view(Pague para ver):");
            diasppv = scanner.nextDouble();
        }
        double valorppv = diasppv * 1.20;
        if(valorppv > 65.00) {
            valorppv = 65.00;
        }
        if (codigo == 2){
            valorppv = diasppv * 2.10;
        }
        System.out.println("Servicos extras:");
        double extra = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Fale a sua cidade: \n" +
                "Belo Horizonte\n" +
                "Sao Paulo\n" +
                "Rio de janeiro\n" +
                "Outras...");
        double imposto = 0;
        String cidade = scanner.nextLine();

        if(cidade.equalsIgnoreCase("Sao paulo")){
                    imposto = 1.01;
        }else if(cidade.equalsIgnoreCase("Rio de janeiro")){
                    imposto = 1.015;
                } else {
                    imposto = 1.02;
                }
            if (codigo == 1) {
                System.out.println("R$" + df.format(65 + valorppv + extra));
            } else if (codigo == 2){
                System.out.println("R$" + df.format((104 + valorppv + extra) * imposto));
            } else if (codigo == 3){
                System.out.println("R$" + df.format((137 + extra) * imposto));
            }
    }
}
