package Algoritmo_conteudo9.E10_lista1;

public class C {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i <= 100; i++) {
            double num = 1 + (i - 1) * 2;
            double den = 2 * i;
            double somatorio = num / den;
            total += somatorio;
        }
        System.out.println((1.0/3.0) * (total * total));
    }
}
