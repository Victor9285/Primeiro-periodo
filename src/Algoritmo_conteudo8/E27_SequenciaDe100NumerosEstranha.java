package Algoritmo_conteudo8;

public class E27_SequenciaDe100NumerosEstranha {
    public static void main(String[] args) {
        //caso eu queria imitar isso x vezes, so fazer esse comando ... x e igual a quantidade de vezes
        /* for(int i = 1; i <= x; i++){
        codigo
            }
         */
        int estrela = 1; // falando que estrela comeca com 1
        for (int linha = 1; linha <= 8; linha++) {//ou seja, ta falando que a repeticao ira ocorrer exatamente 8 vezes, pq 256 = 2^8
            for (int i = 1; i <= estrela; i++)//ele so escreve algo se for = ao numero de estrelas, ou seja, inicialmente = 1
                System.out.print("*"); // ta pedindo pra escrever o *, porem como ta sem ln, vai ser lado a lado, e nao e necessario {} porque eu n abri, pq e so um comando
            System.out.println(); //apos ele escrever as * necessarias, ele vai entrar nesse bloco e vai pular a linha.
            estrela = estrela * 2;
        }
        estrela = 8;
        for (int i = 1; i <= estrela; i++)
            System.out.print("*");
            System.out.println();
        estrela = 64;
        for (int linha = 1; linha <= 8; linha++) {//ou seja, ta falando que a repeticao ira ocorrer exatamente 8 vezes, pq 256 = 2^8
            for (int i = 1; i <= estrela; i++)//ele so escreve algo se for = ao numero de estrelas, ou seja, inicialmente = 1
                System.out.print("*"); // ta pedindo pra escrever o *, porem como ta sem ln, vai ser lado a lado, e nao e necessario {} porque eu n abri, pq e so um comando
            System.out.println(); //apos ele escrever as * necessarias, ele vai entrar nesse bloco e vai pular a linha.
            estrela = estrela / 2;
        }
    }
}
// numero ao quadrado