package Algoritmo_conteudo9.E11_lista2;

public class C {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i <= 100; i++) {
        double num = (3 + (i - 1) * 2) * Math.sqrt((5 + (i - 1) * 4));
        double den = Math.pow(5, i);
        double somatorio = num / den;
        total += somatorio;
        }
        System.out.println(total * total);
    }
}