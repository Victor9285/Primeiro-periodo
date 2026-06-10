package Algoritmo_conteudo9;

public class E6 {
    public static void main(String[] args) {
        double sequencia = 0, total = 0;
        for(int i = 1; i <= 20; i++){
            sequencia  = i / Math.sqrt(i * 2);
            total += sequencia;
        }
        System.out.println(10 + total);
    }
}
