package Algoritmo_conteudo10;
import java.util.Scanner;
public class E1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        double nota = 0;
        int media = 0;
        do{
            System.out.println("Fale o valor da multa");
            nota = scanner.nextDouble();
            if (nota == -1)
                break;
            nota *= 0.10;
           total += nota;
           media++;
           if (nota == -1)
               media--;

        } while(nota != -1);
        System.out.println(total/media);
    }
}
