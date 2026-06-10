package Algoritmo_conteudo11;

import java.util.Scanner;

public class A7 {
    public static void main(String[]args){
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        int i = 0, day = 0,qntdias = 0;
        double menortemp = 200, maiortemp = 0, media = 0;
        while (i < 5) {
            i++;
            System.out.println("A TEMPERATURA DO DIA " + i);
            double temp = scanner.nextDouble();
            if (temp < menortemp)
                menortemp = temp;
            if (temp > maiortemp){
                maiortemp = temp;
            qntdias++;
                }


            media += temp;
        }
        System.out.println("MENOR TEMPERATURA: " + menortemp);
        System.out.println("MAIOR TEMPERATURA: " + maiortemp);
        System.out.println("MEDIA DAS TEMPERATURAS: " + media/i);
        System.out.println("QUANTIDADE DE DIAS QUE OCORREU A MAIOR TEMPERATURA: " + qntdias);

    }
}
