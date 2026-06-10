package Algoritmo_conteudo12;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class A27_UsandoArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaCpf = new ArrayList<String>();
        List<String> listaEndereco = new ArrayList<String>();

        while (true) {
            System.out.println("Fale o CPF: (\"0\" PARA ENCERRAR)");
            String cpf = scanner.nextLine();
            if (cpf.equals("0"))
                break;
            listaCpf.add(cpf);
            System.out.println("Fale o endereco: ");
            String endereco = scanner.nextLine();
            listaEndereco.add(endereco);
        }

        System.out.println("--------");
        System.out.println("Fale um CPF que voce quer buscar");
        String cpfBuscar = scanner.nextLine();
        int pos = listaCpf.indexOf(cpfBuscar);
        if (pos != -1) {
            System.out.println("ACHADO!");
            System.out.println("Quer alterar o endereco ou excluir o CPF e endereco? (A/E)");
            String resposta = scanner.nextLine();

            while (!resposta.equalsIgnoreCase("A") && !resposta.equalsIgnoreCase("E")) {
                System.out.println("Opcao invalida, digite somente A ou E");
                resposta = scanner.nextLine();
            }

            if (resposta.equalsIgnoreCase("A")) {
                System.out.println("Fale o novo endereco");
                String novoEndereco = scanner.nextLine();
                listaEndereco.set(pos, novoEndereco);
                System.out.println("Endereco alterado com sucesso");
            } else {
                listaCpf.remove(pos);
                listaEndereco.remove(pos);
                System.out.println("Registo excluido com sucesso");
            }

        } else {
            System.out.println("CPF nao encontrado, deseja adicionar o CPF? (S/N)");
            String resposta = scanner.nextLine();

            while (!resposta.equalsIgnoreCase("S") && !resposta.equalsIgnoreCase("N")) { //USA && por que os dois tem que ser verdade, ou seja, nenhum dos dois pode ser S ou N
                System.out.println("Digite somente S ou N");
                resposta = scanner.nextLine(); //crie um while so pra pergunta, o resto use if
            }
            if (resposta.equalsIgnoreCase("S")) {
                System.out.println("Fale o CPF para adiciona-lo: ");
                String cpf = scanner.nextLine();
                listaCpf.add(cpf);
                System.out.println("Fale o endereco desse CPF: ");
                String endereco = scanner.nextLine();
                listaEndereco.add(endereco);
                System.out.println("CPF adicionado com sucesso");
            } else {
                System.out.println("Operacao cancelada.");
            }
        }
        for (int i = 0; i < listaCpf.size(); i++) {
            System.out.println("CPF: " + listaCpf.get(i) + "- ENDERECO: " + listaEndereco.get(i));
        }
        scanner.close();
    }
}
