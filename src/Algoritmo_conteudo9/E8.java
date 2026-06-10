package Algoritmo_conteudo9;

public class E8 {
    public static void main(String[] args) {
        double sequencia = 0, total = 0;
        for (int i = 1; i <= 20; i++){
            sequencia = (3 + (i - 1) * 2) * Math.sqrt(5 + (i - 1) * 4) / Math.pow(5, i);
            total += sequencia;
        }
        System.out.println(Math.pow(total, 2));
    }
}
