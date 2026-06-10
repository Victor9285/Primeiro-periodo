package Algoritmo_conteudo11;
import java.text.DecimalFormat;
import java.util.Scanner;
public class A3 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        StringBuilder relatorio = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int dia = 0, primquinz = 0;
        double valor = 0, total = 0;
        while (dia != 99){
            System.out.println("Digite o dia: ");
            dia = scanner.nextInt();
                if (dia == 99)
                    break;
            while (dia <= 0){
                System.out.println("Digite o dia: ");
                dia = scanner.nextInt();
            }
            scanner.nextLine();
            System.out.println("Digite a placa do veiculo: ");
            String placa = scanner.nextLine();
            System.out.println("Digite os pontos: ");
            int pontos = scanner.nextInt();
                while(pontos != 3 && pontos != 5 &&  pontos !=8){
                    System.out.println("Digite os pontos: ");
                    pontos = scanner.nextInt();
                }
            if (pontos == 3) {
                valor = 42;
                total += valor;
            }else if (pontos == 5) {
                valor = 108;
                total += valor;
            }else {
                 valor = 479;
                 total += valor;
                if (dia >= 15)
                    primquinz++;
            }
            relatorio.append("DIA: ").append(dia).append("  ").append("PLACA: ").append(placa).append("  ").append("PONTOS: ").append(pontos).append("  ").append("VALOR: R$").append(valor).append("\n");
            System.out.println("------");
        }
        System.out.println(relatorio.toString());
        System.out.println("Multas com 8 pontos na primeira quinzena " + primquinz);
        System.out.println("Valor total arrecadado: R$" + df.format(total));
    }
}
