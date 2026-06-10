package Algoritmo_conteudo10;
import java.text.DecimalFormat;
import java.util.Scanner;
public class E5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.##");

    int quantidade = 0, mulher = 0, homem = 0;
    double altura, mediahomem = 0, pesomulher = 0;

    do{
        System.out.println("Fale sua altura: ");
        altura = scanner.nextDouble();
            if(altura == 0)
                break;
       scanner.nextLine();
        System.out.println("Fale o seu peso");
        double peso =  scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Fale o seu sexo: (M ou F");
        String sexo = scanner.nextLine().toUpperCase();
            while(!sexo.equals("M") && !sexo.equals("F")){
            System.out.println("Fale o seu sexo: (M ou F");
            sexo = scanner.nextLine();
        }
        if (sexo.contentEquals("F")){
            if(peso < 60)
                pesomulher++;
            mulher++;
        }

        if (sexo.contentEquals("M")) {
           mediahomem += altura;
            homem++;
        }

            quantidade++;

        System.out.println("Para terminar o progama, digite 0 na altura.");
    } while(altura != 0);
        System.out.println("-----------------------\n" +
                "A quantidade de pessoas pesquisas foi: " + quantidade);
        System.out.println("A quantidade de mulheres foi: " + mulher);
        System.out.println("A altura media dos homem foram: " + df.format(mediahomem/homem));
        System.out.println("A quantiade de mulheres com o peso menor que 60: " + df.format(pesomulher)) ;
    }
}
