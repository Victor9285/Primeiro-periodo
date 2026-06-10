package PROVA;
import java.util.Scanner;
public class D25938C {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int crianca = 0, adolescente = 0, adulto = 0, idoso = 0;
        while (true){
            System.out.println("Fale a idade:");//faz a pergunta
            int idade = scanner.nextInt();
                if(idade == 0) // cria a flag
                    break;
            if(idade <= 12)
                crianca++;
            else if (idade <= 17)
                adolescente++;
            else if(idade <= 59)
                adulto++;
            else idoso++; //compara todos valores
        }
        System.out.println("Criança = " + crianca + "\n" + // coloca no terminal
                "Adolescente = " + adolescente + "\n" +
                "Adulto = " + adulto + "\n" +
                "Idoso = " + idoso);
        scanner.close();
    }
}
