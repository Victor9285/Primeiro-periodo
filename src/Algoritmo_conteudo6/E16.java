package Algoritmo_conteudo6;
import java.util.Scanner;
public class E16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale a quantidade de faltas: ");
        int faltas = scanner.nextInt();
            if(faltas < 0){
                System.out.println("Fale um numero de faltas que seja maior que 0");
                return;
            }
            else if ( faltas <= 5){
                faltas = 3;
            } else if (faltas > 5 &&  faltas <= 10){
                faltas = 2;
            } else {
                faltas = 1;
            }
        System.out.println("Fale a nota da sua primeira prova");
            double nota1 = scanner.nextDouble();
        System.out.println("Fale a nota da sua segunda prova");
            double nota2 = scanner.nextDouble();
        System.out.println("Fale a nota da sua terceira prova");
             double nota3 = scanner.nextDouble();
             double maior;
             double segundamaior;
             if (nota1 >= nota2 && nota1 >= nota3){
                 maior = nota1;
                 segundamaior = Math.max(nota2, nota3);
             } else if (nota1 <= nota2 && nota2 >= nota3){
                 maior = nota2;
                 segundamaior = Math.max(nota1, nota3);
             } else {
                 maior = nota3;
                 segundamaior = Math.max(nota1, nota2);
             }
             double media = (maior + segundamaior)/2;
        System.out.println("Fale a nota do seu trabalho final");
        double trabalhofinal = scanner.nextDouble();

        System.out.println("Fale a sua idade:");
            int idade = scanner.nextInt();
                if(idade < 0) {
                    System.out.println("Fale uma idade que seja maior que 0");
                    return;
                } else if (idade <= 17){
                    idade = 1;
                } else if (idade > 18 && idade <= 50){
                    idade = 2;
                } else {
                    idade = 3;
                }

            double resultadoFinal = (media * faltas) + (trabalhofinal * idade);
        System.out.print("Sua nota final foi: " + resultadoFinal);
            if (resultadoFinal <= 50){
                System.out.print(", e voce foi reprovado");
            } else if(resultadoFinal > 50 && resultadoFinal <= 70){
                System.out.print(", e voce foi considerado regular");
            } else if(resultadoFinal > 70 && resultadoFinal <= 80){
                System.out.print(", e voce foi considerado bom");
            } else if(resultadoFinal > 80 && resultadoFinal <= 90){
                System.out.print(", e voce foi cosiderado muito bom");
            } else {
                System.out.print(", e voce foi considerado excelente");
            }

    }
}
