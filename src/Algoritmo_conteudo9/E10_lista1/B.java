package Algoritmo_conteudo9.E10_lista1;

public class B {
    public static void main(String[] args) {
        double total = 0;
        for (int i = 1; i <= 100; i++) {
         double num = 2 * i;
         double den = 3 * i;
         double somatorio = num / den;
         total += somatorio;
        }
        System.out.println(1 + Math.sqrt(total));
    }
}
