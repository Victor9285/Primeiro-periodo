package Algoritmo_conteudo8;
public class Exemplo23 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            for (int aux = 1; aux <= 5; aux++) {
                for (int aux1 = 1; aux1 <= aux; aux1++) {
                    System.out.print(aux1);
                }
                System.out.println();
            }
            for (int aux = 5; aux >= 1; aux--) {
                for (int aux1 = 1; aux1 <= aux; aux1++) {
                    System.out.print(aux1);
                }
                System.out.println();
            }

        }
    }
}
