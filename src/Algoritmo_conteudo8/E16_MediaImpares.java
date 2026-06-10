package Algoritmo_conteudo8;
public class E16_MediaImpares {
    public static void main(String[] args){
        int impar = 0;
        int media = 0;
        for(int i = 1000; i <= 2000; i++){
            if(i % 2 != 0) {
                media += i;
                impar++;
            }
        }
        if(media > 0){
            System.out.println("A media dos numeros primos dentro de 1000 e 2000 é: " + (media/impar));
        } else {
            System.out.println("ERROR");
        }

    }
}
