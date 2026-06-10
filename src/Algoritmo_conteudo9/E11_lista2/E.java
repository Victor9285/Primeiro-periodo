package Algoritmo_conteudo9.E11_lista2;

public class E {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i <= 100; i++) {
        double num = (i * i) * Math.sqrt(5 + (i - 1) * 2);
        double den = Math.pow((2 + (i - 1) * 1), i);
        double somatorio = num/den;
        total += somatorio;
        }
        System.out.println(2.0/3.0 * total);
    }
}