package Algoritmo_conteudo8;
import java.util.Locale;
import java.util.Scanner;
public class E31 {
    public static void main(String[] args){
        int totalC = 0, totalP = 0, totalO = 0, totalA = 0, totalX = 0;
        double mediaAdm = 0, menorSalario = 30000, mediaAdmTotal = 0;
        String menorNome = "", menorCodigo = "", cargo = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos engenheiros:");
        int quant = scanner.nextInt();
        for (int i = 1; i <= quant; i++) {

            System.out.print("-------Engenheiro-------\n");
            System.out.println("Fale seu nome: ");
            String nome = scanner.nextLine();
            System.out.println("Seu salario bruto: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // limpando o buffer.
            System.out.println("Seu codigo de cargo exercido na empre: (C, P, O, A ou X)");
            String codigo = scanner.nextLine();
            codigo = codigo.toUpperCase();
            while (!codigo.equals("C") && !codigo.equals("P") && !codigo.equals("O") && !codigo.equals("A") && !codigo.equals("X")) {
                System.out.println("Fale alguma letra que esta dentro dos parametros. (C, P, O, A ou X)");
                codigo = scanner.nextLine();
            }

            if (salario < menorSalario){
                menorSalario = salario;
                menorNome = nome;
                menorCodigo = codigo;
                    if (codigo.contentEquals("C"))
                        cargo = "Engenheiro Calculista";
                    if (codigo.contentEquals("P"))
                        cargo = "Engenheiro Projetista";
                    if (codigo.contentEquals("O"))
                        cargo = "Engengeiro de Obra";
                    if (codigo.contentEquals("X"))
                        cargo = "Engenheiro Administrador";
                    if (codigo.contentEquals("X"))
                        cargo = "Outros";
            }

            System.out.println("---------------------");
            System.out.println("PARA O ENGENHEIRO " + i + ":");

            switch (codigo) {
                case "C": //SM = 2500.00
                    if (salario < 2500.00) {
                        System.out.println("ABAIXO DO SALARIO MINIMO");
                        break;
                    } else {
                        totalC++;
                        System.out.println("Quantidade de engenheiros que o salario esta igual ou acima do salario minimo: " + totalC);
                        break;
                    }
                case "P":
                    if(salario < 4650.00){
                        System.out.println("ABAIXO DO SALARIO MINIMO");
                        break;
                    }else{
                        totalP++;
                        System.out.println("Quantidade de engenheiros que o salario esta igual ou acima do salario minimo: " + totalP);
                        break;
                    }
                case "O":
                    if(salario < 3200){
                        System.out.println("ABAIXO DO SALARIO MINIMO");
                        break;
                    }else{
                        totalO++;
                    System.out.println("Quantidade de engenheiros que o salario esta igual ou acima do salario minimo: " + totalO);
                    break;
                }
                case "A":

                    if(salario < 5100.00){
                        System.out.println("ABAIXO DO SALARIO MINIMO");
                        break;
                    }else{
                        totalA++;
                        mediaAdm += salario;
                        System.out.println("Quantidade de engenheiros que o salario esta igual ou acima do salario minimo: " + totalA);
                        break;
                    }
                case "X":
                if (salario > 5000) {
                    totalX++;
                    System.out.println("A quantidade de engenheiros de cargo 'Outros' que recebem mais de R$5.000,00 e: " + totalX);
                    break;
                }
            }
            mediaAdmTotal =(mediaAdm/totalA);
            System.out.println("Media de salarios dos Administradores e " + mediaAdmTotal);
        }
    }
}
