package Algoritmo_conteudo9.E11_lista2;

public class B {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i <= 100; i++) {
        double num = 1 + (i - 1) * 3;
        double den = Math.sqrt(7 + (i - 1) * 3);
            double somatorio = num / den;
            total += somatorio;
        }
        System.out.println(5.0/3.0 * total);
    }
}