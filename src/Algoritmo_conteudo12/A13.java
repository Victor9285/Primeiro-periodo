package Algoritmo_conteudo12;
import java.util.Scanner;
public class A13 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        String[] fila = new String[10];
        for(int i = 0; i < 10; i++){
            System.out.println("Nome das pessoas em ordem na fila: ");
            fila[i] = scanner.nextLine();
        }
        System.out.println("------------------");
        System.out.println("Fale o nome da pessoa que deseja proucuar:");
        String nomedapessoa = scanner.nextLine();
            int posicaofila = 0;
        for(int i = 0; i < fila.length; i++){
            if(fila[i].equalsIgnoreCase(nomedapessoa)){
                posicaofila = i + 1;
            }
        }
        if (posicaofila == 0){
            System.out.println("A pessoa nao esta na fila");
        } else System.out.println(nomedapessoa + " esta na posicao " + posicaofila);
    }
}
