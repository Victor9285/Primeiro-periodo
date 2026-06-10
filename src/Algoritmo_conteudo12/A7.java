package Algoritmo_conteudo12;
import java.util.Scanner;
public class A7 {
    public static void main(String[] args){
        int alunos = 50;
        String conceito = "";
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[alunos];
        for (int i = 0; i < alunos; i++){
            System.out.println("Fale a nota do aluno " + (i + 1) + ":");
            notas[i] = scanner.nextDouble();
                if (notas[i] > 100){
                    System.out.println("Nota invalida");
                    return;
                }
        }

        for (int i = 0; i < alunos; i++){
            if (notas[i] <= 30)
                conceito = "D";
            else if(notas[i] <= 60)
                conceito = "C";
            else if (notas[i] <= 80)
                conceito = "B";
            else conceito = "A";
            System.out.println(notas[i] + " com conceito " + conceito );
        }

    }

}
