package Algoritmo_conteudo9;

public class E12_sinal {
    public static void main(String[] args) {
        double total = 0, sinal = -1;
        for (int i = 1; i <= 10000; i++) {
            double den = 3 + (i - 1) * 2;
            sinal  *= -1;
            total += (1.0 / den) * sinal;
        }
        System.out.println("Pi e igual a: " + (4 * (1 - total)));
    }
}
// comeca com 1 e apos cada rodada ele vai invertendo o sinal
// tem como usar o if e % tbm, porem esse modo e mais bonito