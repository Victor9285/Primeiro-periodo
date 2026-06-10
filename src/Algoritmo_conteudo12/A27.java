package Algoritmo_conteudo12;
import java.util.Scanner;

public class A27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        String[] cpf = new String[1000];
        String[] endereco = new String[cpf.length];
        int i = 0; 
        while(true){
            System.out.print("Fale o CPF da pessoa " + (i + 1) + " (ou 0 para parar): ");
            String cpfDigitado = scanner.nextLine(); 
            if(cpfDigitado.equals("0")) {
                break;
            }
            cpf[i] = cpfDigitado;
            System.out.print("Fale o endereco da pessoa " + (i + 1) + ": ");
            endereco[i] = scanner.nextLine();
            i++;
        }
        System.out.print("\nDigite um CPF para pesquisar na lista: ");
        String cpfBusca = scanner.nextLine();
        int indiceEncontrado = -1; 
        for (int j = 0; j < i; j++) {
            if (cpf[j] != null && cpf[j].equalsIgnoreCase(cpfBusca)) {
                indiceEncontrado = j; 
                break; 
            }
        }
        if (indiceEncontrado != -1) {
            while (true) {
                System.out.println("\nCPF Encontrado! Voce deseja [ALTERAR] o endereco ou [EXCLUIR] o CPF/endereco?");
                String opcao = scanner.nextLine();
                
                if (opcao.equalsIgnoreCase("alterar")) {
                    System.out.print("Fale o novo endereco: ");
                    endereco[indiceEncontrado] = scanner.nextLine();
                    break;
                } else if (opcao.equalsIgnoreCase("excluir")) {
                    cpf[indiceEncontrado] = null;
                    endereco[indiceEncontrado] = null;
                    System.out.println("Registro excluido com sucesso.");
                    break;
                } else {
                    System.out.println("Opcao invalida! Digite 'alterar' ou 'excluir'.");
                }
            }
        } else {
    
            while (true) {
                System.out.println("\nCPF nao encontrado. Deseja [INCLUIR] este CPF com um novo endereco? (Sim/Nao)");
                String opcao = scanner.nextLine();
                
                if (opcao.equalsIgnoreCase("sim") || opcao.equalsIgnoreCase("incluir")) {
                  
                    cpf[i] = cpfBusca; 
                    System.out.print("Fale o endereco para este novo CPF: ");
                    endereco[i] = scanner.nextLine();
                    i++; 
                    System.out.println("Novo registro incluido com sucesso.");
                    break;
                } else if (opcao.equalsIgnoreCase("nao")) {
                    break;
                } else {
                    System.out.println("Opcao invalida! Digite 'Sim' ou 'Nao'.");
                }
            }
        }
        System.out.println("\n--- LISTA FINAL DE CPFs E ENDEREÇOS ---");
        for(int j = 0; j < i; j++){
            if (cpf[j] != null) {
                System.out.println("CPF: " + cpf[j] + " | Endereco: " + endereco[j]);
            }
        }
        scanner.close();
    }
}