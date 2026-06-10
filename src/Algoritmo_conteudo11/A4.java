package Algoritmo_conteudo11;
import java.util.Scanner;
public class A4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = 0,qnthomem = 0,qntmulheres7p = 0, maisvelho = 0;
        double mediaidade= 0, totalmultas = 0;
        String nomemaisvelho = "";
        while(n < 230){
            System.out.println("NOME");
            String nome = scanner.nextLine();
            System.out.println("IDADE");
            int idade = scanner.nextInt();
                if(idade > maisvelho){
                    maisvelho = idade;
                    nomemaisvelho = nome;
                }
            mediaidade += idade;
            System.out.println("SEXO (M OU F)");
            String sexo = scanner.nextLine();
                while(!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F")){
                    System.out.println("SEXO (M OU F)");
                    sexo = scanner.nextLine();
                }
                if (sexo.equalsIgnoreCase("M")){
                    qnthomem++;
                }
            System.out.println("PONTOS PERDIDOS");
            int pontos = scanner.nextInt();
            System.out.println("VALOR DA MULTA");
            double valor = scanner.nextDouble();
            totalmultas += valor;
            if (sexo.equalsIgnoreCase("M") && pontos >= 7){
                qntmulheres7p++;
            }
        }
        System.out.println("IDADE MEDIA DOS CONDUTORES: " + mediaidade/230);
        System.out.println("VALOR TOTAL DE MULTAS: " + totalmultas);
        System.out.println("PERCENTUAL DE HOMENS MULTADOS: " + 230/qnthomem );
        System.out.println("QUANTIDADE DE MULHERES QUE PERDERAM 7 PONTOS NA CARTEIRA: " + qntmulheres7p);
        System.out.println("PESSOA MAIS VELHA: " + nomemaisvelho + " COM " + nomemaisvelho + " ANOS");
    }
}
