package Algoritmo_conteudo9;

public class E2 {
    public static void main(String[] args){
        int n1 = 1, somatorio = 0;
        for (int i = 1; i <= 100; i++){
            somatorio += n1 / ((n1*n1) + (n1 - 1));
            n1++;
        }
        System.out.println(somatorio);
    }
}
