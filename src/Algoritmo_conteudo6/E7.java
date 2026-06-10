package Algoritmo_conteudo6;
import java.util.Scanner;
public class E7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("O valor do seu salario");
        double sal = scanner.nextDouble();
        if (sal <= 300.00){
            System.out.println("O seu salario sera: RS" + ((500 + sal) * 0.30));
        } else if (sal > 300 && sal < 1000){
            System.out.println("O seu salario sera: RS" + ((200 + sal) * 0.50));
        } else {
            System.out.println("O seu salario sera RS" + (sal * 0.70));
        }


    }
}
//bruto = falor fixo + percentual sobre o salario
//imposto = 25% do bruto
//liquido = bruto - imposto