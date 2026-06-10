package Algoritmo_conteudo9;

public class E1 {
    public static void main(String[] args){
        double num1 = 37, num2 = 38, somatorio = 0,div = 1;
        for(int i = 1; i <= 37; i++){
            somatorio += (num1 * num2)/div;
            num1--;
            num2--;
            div++;
        }
        System.out.println(somatorio);
    }
}
