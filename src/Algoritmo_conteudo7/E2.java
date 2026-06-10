package Algoritmo_conteudo7;
import java.util.Scanner;
import java.text.DecimalFormat;
public class E2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do produto?");
        double valor = scanner.nextDouble();
        System.out.println("Selecione o codigo do desconto");
        int desconto = scanner.nextInt();

        while (desconto < 1 || desconto > 4) {
            System.out.println("Nao esta dentro da lista de nenhum codigo.\n" +
                    "Fale agora o codigo correto: (1 a 4)");
            desconto = scanner.nextInt();

        switch (desconto) {
            case 1:
                valor *= 0.9;
                break;
            case 2:
                valor *= 0.8;
                break;
            case 3:
                valor *= 0.7;
                break;
            case 4:
                valor *= 0.5;
                break;

        }
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("O valor do produto com desconto sera: " + df.format(valor));
    }
}
