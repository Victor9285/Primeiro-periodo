package Algoritmo_conteudo12;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class A28_UsandoArrayList {
    public static void main(String[] args) {
        List<String> listaNome = new ArrayList<String>();
        List<String> listaRa = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    while(true){
        System.out.println("Fale o nome do aluno: (\"X\" PARA SAIR)");
        String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("X"))
                break;
        listaNome.add(nome);
        System.out.println("Digite o RA do aluno " + listaNome.get(listaNome.size() - 1) + ": ");
        String ra = scanner.nextLine();
        listaRa.add(ra);
    }   
    //ORDENACAO BOUBLE SHORT DE DOIS VALORES
    String temp;
    for(int i = 0; i < listaNome.size() - 1; i++){
        for (int j = 0; j < listaNome.size() - 1 ; j++){
           if (listaNome.get(j).compareToIgnoreCase(listaNome.get(j + 1)) > 0){
            temp = listaNome.get(j);
            listaNome.set(j, listaNome.get(j + 1)); 
            listaNome.set(j + 1, temp);

            temp = listaRa.get(j);
            listaRa.set(j, listaRa.get(j + 1));
            listaRa.set(j + 1, temp);
           } 
        }
    }
    //PESQUISA O ALUNO POR NOME, INDEXO OF VOLTA -1 SE NAO ACHAR, OU SEJA, QUALQUER OUTRO VALOR E IGUAL AO INDEX DELE NA LISTA.
    System.out.println("Digite o nome do aluno que voce quer saber o RA:");
    String nomeAluno = scanner.nextLine();
    int pos = listaNome.indexOf(nomeAluno);
        if(pos != -1)
        System.out.println("O RA do aluno " + listaNome.get(pos)+" na posicao: " + (pos + 1) + " e: " + listaRa.get(pos) + ".");
        else System.out.println("NOME NAO ENCONTRADO");    
    scanner.close();
    }
}
