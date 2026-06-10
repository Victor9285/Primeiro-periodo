package Algoritmo_conteudo12;
import java.util.Scanner;
public class A22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] placas =  new String[100];
        String[] donos = new String[placas.length];
        for (int i = 0; i < placas.length; i++){
                System.out.println("Fale o nome do dono da vaga:");
                donos[i] = scanner.nextLine();
                System.out.println("Fale a placa deste veiculo");
                placas[i] = scanner.nextLine();
        }
            System.out.println("Fale a placa do carro ou o nome do morador e irei falar sua vaga: ");
                String vaga = scanner.nextLine();
                boolean encontrado = false;
                
         for (int i = 0; i < placas.length; i++){
            if (vaga.chars().anyMatch(Character::isDigit)){
                if(placas[i].equalsIgnoreCase(vaga)){
                    System.out.println("Sua posicao esta na vaga: " + (i + 1));
                    encontrado = true;
                    break;
                }
            }
            else if(donos[i].equalsIgnoreCase(vaga)){
                System.out.println("Sua posicao esta na vaga: " + (i + 1));
                encontrado = true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("Voce digitou algo de errado");
        }
        scanner.close();
    }
}
