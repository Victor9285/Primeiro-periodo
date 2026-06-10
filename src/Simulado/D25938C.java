package Simulado;

import java.text.DecimalFormat;
import java.util.Scanner;

public class D25938C {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.##");
        int idade, cont = 0;
        double mediaaltura = 0, maior = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
        System.out.println("Fale a idade do atleta, digite um numero negativo para sair.@!@");
            idade = scanner.nextInt();
            if (idade < 0)
                break;
            System.out.println("Fale a altura do atleta:");
            double altura = scanner.nextDouble();
            scanner.nextLine();
            if (altura > maior)
                maior = altura;
            if (idade >= 18){
                mediaaltura += altura;
                cont++;
            }
        }
        System.out.println("E a media de altura dos atletas com mais de 18 anos é: " + df.format((mediaaltura/cont)));
        System.out.println("A maior altura é " + maior);

    }
}

