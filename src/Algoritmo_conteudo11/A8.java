package Algoritmo_conteudo11;

import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String projeto = "", maiorsalarionome ="";
        double valorhora = 1, produtividade = 0, maiorsalario = 0, total = 0;
        int ate100 = 0, ate500 = 0, mais500 = 0;
        Scanner scanner = new Scanner(System.in);
        while (!projeto.equalsIgnoreCase("fim")) {
            System.out.println("PROJETO: ");
            projeto = scanner.nextLine();
            if (projeto.equalsIgnoreCase("fim"))
                break;
            System.out.println("VALOR DA HORA TRABALHADA");
            valorhora = scanner.nextDouble();
            scanner.nextLine();
                while (true){
                    System.out.println("NOME:");
                    String nome = scanner.nextLine();
                        if (nome.equalsIgnoreCase("fim")) {
                            System.out.println("-----------\n" + projeto);
                            break;
                        }
                    System.out.println("FUNCAO:");
                    String funcao = scanner.nextLine();
                    System.out.println("HORAS TRABALHADAS: ");
                    double horasTrabalhadas = scanner.nextDouble();
                    scanner.nextLine();
                        if (horasTrabalhadas <= 100){
                            produtividade = 1000;
                            ate100++;
                        } else if (horasTrabalhadas >= 500){
                            produtividade = 10 * horasTrabalhadas;
                            ate500++;
                        } else {
                            produtividade = 100 *(int)(horasTrabalhadas / 10);
                            mais500++;
                        }
                        stringBuilder.append("NOME: ").append(nome).append(" ").append("VALOR A RECEBER: ").append(horasTrabalhadas * valorhora + produtividade).append(" ").append("HORAS TRABALHADAS: ").append(horasTrabalhadas).append("\n");
                            if(maiorsalario < (horasTrabalhadas * valorhora + produtividade)){
                               maiorsalarionome = "MAIOR SALARIO: " + nome + " E SUA FUNCAO E: " + funcao;
                            }
                            total += (horasTrabalhadas * valorhora + produtividade);
                }
            System.out.println(stringBuilder.toString());
        }
        System.out.println(maiorsalario);
        System.out.println("QUANTIDADE POR PRODUTIVIDADE: \n" +
                "ATE 100: "+ ate100 + "\n" +
                "ACIMA DE 100 ATE 500: " + ate500 + "\n" +
                "ACIMA DE 500: " + mais500);
        System.out.println("VALOR TOTAL DA FOLHA DE PAGAMENTO: " + total);
    }
}
