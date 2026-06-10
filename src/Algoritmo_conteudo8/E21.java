package Algoritmo_conteudo8;
import java.util.Scanner;
import java.text.DecimalFormat;
public class E21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Fale qual sua altura em metros");
        double altura = scanner.nextDouble();
        for(int i = 60; i <= 100; i++){
            double imc = i / (altura * altura);
                if(imc < 20) {
                    System.out.println("Com o peso " + i + " seu IMC sera: " + df.format(imc) + " Situacao Corporea = ABAIXO DO PESO");
                } else if (imc < 25){
                    System.out.println("Com o peso " + i + " seu IMC sera: " + df.format(imc) + " Situacao Corporea =PESO IDEAL");
                } else{
                    System.out.println("Com o peso " + i + " seu IMC sera: " + df.format(imc) + " Situacao Corporea =ACIMA DO PESO");
                }
        }

    }
}
