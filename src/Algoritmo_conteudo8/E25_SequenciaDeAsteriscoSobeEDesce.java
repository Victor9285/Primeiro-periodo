package Algoritmo_conteudo8;

public class E25_SequenciaDeAsteriscoSobeEDesce {
    public static void main(String[] args){

        for(int aux = 1; aux <= 10; aux++) {
            for (int aux1 = 1; aux1 <= aux; aux1++)
                System.out.print("*");
                System.out.println();

        }
        for (int aux = 10; aux >= 1; aux--){
            for(int aux1 = 1; aux1 <= aux; aux1++) //sem chaves pq eu quero so um comando, entao o segundo sout n vai rodar
                System.out.print("*");
                System.out.println();

        }
    }
}
