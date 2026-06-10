package Algoritmo_conteudo12;
import java.util.Scanner;
public class A28 {
    public static void main(String[] args) {
        String[] ra = new String[1000];
        String[] nome = new String[ra.length];
     Scanner scanner = new Scanner(System.in);
     int i = 0;
    while (true){
        System.out.println("Qual o RA do aluno " + (i + 1) + ": (\"0\" para parar)");
            String raEncotrado = scanner.nextLine();
                if(raEncotrado.equalsIgnoreCase("0"))
                    break;
                ra[i] = raEncotrado;
        System.out.println("Nome do aluno " + (i + 1));
            nome[i] = scanner.nextLine();
            i++;
    }
    for (int j = 0; j < i - 1; j++) { //bouble sort
        for (int k = j + 1; k < i; k++) {
            if (nome[j].compareTo(nome[k]) > 0) {
                String tempNome = nome[j];
                nome[j] = nome[k];
                nome[k] = tempNome;
                
                String tempRa = ra[j];
                ra[j] = ra[k];
                ra[k] = tempRa;
            }
        }
    }
    boolean encontrado = false;
            System.out.println("Fale o nome do aluno que deseja encontrar");
             String nomeEncontrado = scanner.nextLine();
    for(int j = 0; j < i; j++){
                if (nomeEncontrado == nome[j]){
                    System.out.println("Posicao: " + (j + 1) + "\n" + "RA: " + ra[j]);
                    encontrado = true;
                }
    }
    if(!encontrado)
        System.out.println("NOME NAO ENCONTRADO");
    scanner.close();
    }
}
