package Algoritmo_conteudo12;
import java.util.Scanner;
public class A26 {
    public static void main(String[] args) {
        String[] nome = new String[1000];
        double[] salario = new double[1000];
        Scanner scanner = new Scanner(System.in);   
        int i = 0;
        while(true){
            System.out.println("Fale o nome do funcionario " + (i+ 1) + ":");
                nome[i] = scanner.nextLine();
                if (nome[i].equalsIgnoreCase("x"))
                        break;
            System.out.println("Fale o salario do " + nome[i] + ":");
                salario[i] = scanner.nextDouble();
                scanner.nextLine();
                i++;
        }
        System.out.println("Qual sera o indice de reajuste salarial para salarios menores que R$1000.00? (10% = 10)");
        double reajuste = scanner.nextDouble();
            reajuste = reajuste / 100;

        for (int j = 0; j < i; j++) {
            if (salario[j] < 1000) {
                salario[j] = salario[j] + (salario[j] * reajuste);
            }
        }

        System.out.println("\n--- Salários após reajuste ---");
        for (int j = 0; j < i; j++) {
            System.out.println(nome[j] + ": R$ " + String.format("%.2f", salario[j]));
        }
        scanner.close();
    }
}
