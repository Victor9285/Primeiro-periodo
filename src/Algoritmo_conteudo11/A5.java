package Algoritmo_conteudo11;

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String name = "";
        double valor = 0, media = 0, ENGLISH = 0, SPANISH = 0, FRENCH = 0;
        int ingles = 0, alunos = 0;
        while (!name.equalsIgnoreCase("fim")) {
            System.out.println("Fale o seu nome:");
            name = scanner.nextLine();
                if (name.equalsIgnoreCase("fim"))
                break;
            System.out.println("---LINGUAS--- \n" +
                    "INGLES = 1\n" +
                    "FRANCES = 2\n" +
                    "ESPANHOL = 3");
                System.out.println("Fale o codigo da lingua");
            int code = scanner.nextInt();
                while(code > 3 || code < 1){
                    System.out.println("Fale o codigo");
                    code = scanner.nextInt();
                }
                if (code == 1) {
                    valor = 100;
                    ingles++;
                    ENGLISH += valor;
                }
                else if (code == 2){
                    valor = 150;
                    FRENCH += valor;
                }
                else {
                    valor = 120;
                    SPANISH += valor;
                }
                media += valor;
                alunos++;
            stringBuilder.append("Nome: ").append(name).append("  ").append("O VALOR DA MENSALIDADE: ").append(valor).append("\n");
            scanner.nextLine();
        }
        System.out.println(stringBuilder.toString());
        System.out.println("ALUNOS MATRICULADOS EM INGLES: " + ingles);
        System.out.println("MENSALIDADE MEDIA: " + media/alunos);
        System.out.println("VALOR TOTAL DAS MENSALIDADES: \n" +
                "INGLES: R$" + ENGLISH + "\n" +
                "FRANCES: R$" + FRENCH + "\n" +
                "ESPANHOL: R$" + SPANISH);
    }
}