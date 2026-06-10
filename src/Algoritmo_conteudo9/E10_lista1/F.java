package Algoritmo_conteudo9.E10_lista1;

public class F {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i <= 100; i++) {
            double num = (i * i);
            double den = Math.pow((i * 2), 2);
            double somatorio = num / den;
            total += somatorio;
        }
        System.out.println("Total: " + total);
    }
}