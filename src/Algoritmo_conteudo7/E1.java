package Algoritmo_conteudo7;
import java.util.Scanner;
public class E1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       System.out.println("Fale sua idade, que irei falar qual categoria voce se encaixa");
       int idade = scanner.nextInt();
       int faixa = idade / 10; // pegar o valor e dividir por 10, como so trabalha com casas inteiras
        // vai pegar o valor e divir por geracoes, ex. 1 a 10= 1, 11 a 19 = 2, assim por diante
        if (idade >= 13){
            idade = 9;
        }
       switch(faixa){
           case 0:
               System.out.println("E crianca");
               break;
           case 1:
               System.out.println("E adolescente");
                break;
           case 2: case 3: case 4: case 5:
               System.out.println("E adulto");
               break;
           default:
               System.out.println("E idoso");
               break;
       }
    }
}
