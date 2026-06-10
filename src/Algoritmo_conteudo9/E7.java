package Algoritmo_conteudo9;

public class E7 {
    public static void main(String[] args) {
        double sequencia = 0, total = 0;
        for(int i = 1; i <= 6; i++){
            sequencia = (((i - 1) * 2) + (3 * i)/(7 +(i - 1) * 6));
            total += sequencia;
        }
        System.out.println(total);
    }
}
