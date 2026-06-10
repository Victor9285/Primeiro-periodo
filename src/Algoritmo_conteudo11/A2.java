package Algoritmo_conteudo11;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        StringBuilder relatorio = new StringBuilder();
        double total = 0, menor = 999999, mediab = 0;
        Scanner scanner = new Scanner(System.in);
        int cliente = 1,b = 0, p = 0, o = 0;
        String classificacao;
        while (cliente <= 5){
            System.out.println("Fale o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.println("Fale o valor aplicado: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();
            if (valor > menor){
                menor = valor;
            }
            total += valor;
                if (valor < 1000) {
                    classificacao = "Bronze";
                    mediab += valor;
                    b++;
                } else if (valor > 1000 && valor < 5000) {
                    classificacao = "Prata";
                    p++;
                }else {
                    classificacao = "Ouro";
                    o++;
                }
            relatorio.append(nome).append(" ").append(valor).append("  ").append(classificacao).append("\n");
        cliente++;
        }
        System.out.println("----RELATORIO FINAL----");
        System.out.println(relatorio.toString());
        System.out.println("Total bronze: " + b);
        System.out.println("Total prata: " + p);
        System.out.println("Total ouro: " + o);
        System.out.println("Media bronze: R$" + df.format(mediab/b));
        System.out.println("Volume total: R$" + df.format(total));
        ;
    }
}
