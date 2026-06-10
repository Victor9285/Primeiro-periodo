package AtividadePY;
import java.util.Scanner;
public class Atividade4_2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        double total = 0;
        boolean continuar = true;

        while (continuar){
            System.out.println("Preco do produto:");
            double preco = scanner.nextDouble();
            total += preco;
            if (preco < 0){
                System.out.println("Fale algum valor positivo.");
                break;
            }
            scanner.nextLine();

            String resposta = ""; //criando a string resposta
            while (true){
                System.out.println("Adicionar mais? (s/n): ");
                        resposta = scanner.nextLine().toLowerCase(); //pegando a resposta e mudadando-a para lowercase
                if (resposta.equals("s") || resposta.equals("n")){
                    if (resposta.equals("n"))
                        continuar = false;

                    break; // se a resposta for s ou n, quebra
                } else
                    System.out.println("Resposta invalida. Digite somente s ou n.");
            }
        }
        scanner.close();
        System.out.println("O preco do produto e: R$" + total);
    }
}
