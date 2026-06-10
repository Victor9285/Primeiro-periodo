package Algoritmo_conteudo10;
import java.util.Scanner;
public class E4 {
    public static void main(String[]args){
        String nome = "";
        double total = 0,valbdi =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale a taxa BDI(Bonificacao e Despesar indiretas).");
        double bdi = scanner.nextDouble();
        scanner.nextLine();
        do{
            System.out.println("O nome do produto: ");
            nome = scanner.nextLine();
                if (!nome.equalsIgnoreCase("fim")) {
                    System.out.println("Quantidade do produto: ");
                    double quant = scanner.nextInt();
                    System.out.println("Preco unitario do produto: ");
                    double preco = scanner.nextDouble();
                    System.out.println("O custo parcial e: " + quant * preco + "\n" +
                            "-------------------");
                    scanner.nextLine();
                    total += (quant * preco);
                    valbdi = total * (bdi / 100);
                }

        }while (!nome.equalsIgnoreCase("fim"));

        System.out.println("O custo total foi: " + total);
        System.out.println("O valor do BDI e: " + valbdi);
        System.out.println("O preco final foi: " + (total + valbdi));
        scanner.close();
    }
}
