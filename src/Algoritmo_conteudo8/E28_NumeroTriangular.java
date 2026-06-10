package Algoritmo_conteudo8;

public class E28_NumeroTriangular {
    public static void main(String[] args){
        for (int i = 3; i <= 14; i++){ // quantas vezes vai fazer o codigo, no caso 15x
            int triangular = (i * (i - 1) * (i - 2));
            if (triangular <= 1000) {
                System.out.println(triangular);
            }
        }
    }
}
