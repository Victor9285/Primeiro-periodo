package Algoritmo_conteudo9.E10_lista1;

public class E {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i <= 100; i++) {
            double num = i;
            double den = 3 * (i * 2);
            double somatorio = num / den;
            total += somatorio;
        }
        System.out.println("Total: " + total);
    }
}