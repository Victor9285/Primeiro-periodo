package Algoritmo_conteudo8;

public class E19 {
    public static void main(String[] args){
        int total = 0;
        for (int i = 1; i <= 100; i++){
            int soma = i * i;
            System.out.println(soma);
            total += soma;
        }
        System.out.println("Soma de todos os numeros sao: " + total);
    }
}
