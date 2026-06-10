package Algoritmo_conteudo9;

public class Desafio_comFatorialE1_3_7_15_31_63 {
        public static void main(String[] args) {
            double total = 0, sinal = -1;
            for (int i = 1; i <= 10; i++) {
                double num = 1;
                for (int j = i; j >= 1; j--){
                    num *= j;
                }
                double den = Math.pow(2, i) - 1; //1,3,7,15,31,63
                sinal *= -1;
                total += num / den * sinal;
        }
            System.out.println(total);
    }
}
