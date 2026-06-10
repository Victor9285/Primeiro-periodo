package Algoritmo_conteudo8;

public class E23_palindromo {
    public static void main(String[] args){
        int media = 0;
        for(int i= 1000; i <= 9999; i++){ //ex 1221
            int n1 = i / 1000; //pega o 1 e o resto joga fora pq e int
            int n2 = (i / 100) % 10; // vai pegar o valor, ex 1234 e dividir por 100 = vai ser 12x e sobra 34, porem como e int o numero 34 n existe, apos isso pega 12 e faz o mod de 10 = 2
            int n3 = (i / 10) % 10; //vai pegar o numero, ex 1234 e tirar o ultimo= 123 agora faz o mod por 10 e pega so o 3
            int n4 = (i % 10);

            if (n1 == n4 && n2 == n3){
                System.out.println("O numero " + i + " e um palindromo.");
            }
        }
    }
}
