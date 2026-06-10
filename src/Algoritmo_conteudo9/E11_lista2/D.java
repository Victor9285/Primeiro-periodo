package Algoritmo_conteudo9.E11_lista2;

public class D {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i <= 100; i++) {
            double num = (i * i * i);
            double den = (Math.pow(10, i - 1));
            double somatorio = num / den;
            total += somatorio;
        }
        System.out.println(total);
    }
}
