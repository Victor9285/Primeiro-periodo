package Algoritmo_conteudo12;
import java.util.Scanner;
public class A24 {
    public static void main(String[] args) {
        int temp = 0;
        String tempE = "";
        Scanner scanner = new Scanner(System.in);
        String[] equipes = new String[20];
        int[] pontos = new int[equipes.length];
        System.out.println("Fale as 20 equipes que compoem a seria A do futebol brasileiro");
            for (int i = 0; i < equipes.length; i++){
                System.out.println("Fale a equipe " + (i + 1) + "º:");
                equipes[i] = scanner.nextLine();
                System.out.println("Fale a pontuacao da equipe " + (i + 1) + "º:");
                pontos[i] = scanner.nextInt();
                scanner.nextLine();
            }
            for(int i = 0; i < equipes.length - 1; i++){
                for(int j = 0; j < equipes.length - 1; j++){
                    if (pontos[j] < pontos[j + 1]){
                        temp = pontos[j];
                        pontos[j] = pontos[j + 1];
                        pontos[j + 1] = temp;

                        tempE = equipes[j];
                        equipes[j] = equipes[j + 1];
                        equipes[j + 1] = tempE;
                    }
                }
             }
                 boolean encontrado = false;
                    System.out.println("Fale qual equipe quer pesquisar no campeonato:");
                   String posicao = scanner.nextLine();
                    for(int i = 0; i < pontos.length; i++){
                            if (equipes[i].equalsIgnoreCase(posicao)){
                               System.out.println("Posicao encontrada " + (i + 1));
                               encontrado = true;
                               break; 
                            }
            }
            if (!encontrado){
                System.out.println("Nome da equipe errado.");
            }
        scanner.close();
    }
}
