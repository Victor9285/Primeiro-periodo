package Algoritmo_conteudo9.E10_lista1;

public class D {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i <= 100; i++) {
        double num = i + (i - 1);
        double den = (i * i);
        double somatorio = num / den;
        total += somatorio;
        }
        System.out.println(total);
    }
}
