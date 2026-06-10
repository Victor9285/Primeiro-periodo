package Algoritmo_conteudo9.E11_lista2;

public class F {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i <= 100; i++) {
            double num = (1 + (i - 1) * 2) * Math.pow(2, (i + 1));
            double den = Math.pow((2 + (i - 1) * 5), 2);
            double somatorio = num / den;
            total += somatorio;
        }
        System.out.println(5.0 * Math.sqrt(total));
    }
}