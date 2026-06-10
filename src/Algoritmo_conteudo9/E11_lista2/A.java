package Algoritmo_conteudo9.E11_lista2;

public class A {
    public static void main(String[]args){
        double sequencia = 0, total = 0;

        for (int i = 1; i <= 100; i++) {
            double num = i + (1 + (i - 1) * 7);
            double den = Math.pow(2, i - 1);
            sequencia = num / den;
            total += sequencia;
        }
        System.out.println(Math.pow(total, 1.0/3.0));
    }
}
