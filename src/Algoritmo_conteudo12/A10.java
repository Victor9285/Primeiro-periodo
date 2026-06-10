package Algoritmo_conteudo12;
import java.util.Scanner;
public class A10 {
    public static void main(String[]args){
        int quantidade = 8;
        double media = 0;

        Scanner scanner = new Scanner(System.in);
        double[] nota = new double[quantidade];
        String[] nome = new String[quantidade];
        for(int i = 0; i < quantidade; i++){
            System.out.println("Fale o nome do aluno " + (i + 1) +":");
            nome[i] = scanner.nextLine();
            System.out.println("Fale a nota da(o) " + nome[i] + ":");
            nota[i] = scanner.nextDouble();
            scanner.nextLine();
        }
        for(int i = 0; i < quantidade; i++){
            media += nota[i];
        }
        media /= quantidade;
        System.out.println("A media e "+ media);
        System.out.print("Alunos com a nota maior que a media: \n");
        for(int i = 0; i < quantidade; i++){
            if (nota[i] >= media){
                System.out.println(nome[i].toUpperCase() + " com a nota de " + nota[i]);
            }
            scanner.close();
        }
    }
}
