package Algoritmo_conteudo6;
import java.util.Scanner;
public class E9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu genero, F para feminino e M para masculino:");
        String genero = scanner.nextLine();
        if (genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("f")){
            System.out.println("Agora fale a sua altura");
            double height = scanner.nextDouble();
            if(height > 140){
                height = height / 100;
            }
                if(genero.equalsIgnoreCase("m")){
                    System.out.println("Seu peso ideial e: " + (72.7 * height - 58 ));
                } else {
                    System.out.println("Seu peso ideial e: " + (62.1 * height - 44.7));
                }
        } else {
            System.out.println("A letra digitada nao se enquandra nos generos estabelecidos.");
        }
        scanner.close();
    }
}
