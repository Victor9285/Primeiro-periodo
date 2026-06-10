package Algoritmo_conteudo9.E10_lista1;

public class A {
    public static void main (String args[]){
        double termo = 0, total = 0;
        for (int i = 1; i <= 100; i++){
         double den =Math.sqrt(2 * i);
         double num = i;
         termo = num / den;
         total += termo;
        }
        System.out.println(total);
    }
}
