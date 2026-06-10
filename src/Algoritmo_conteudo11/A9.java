package Algoritmo_conteudo11;

import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        String setmaior = "", antigao = "", novao = "";
        int rf = 0, year = 0, codigo = 0, admissao = 0;
        int obras = 0, pesquisa = 0, administracao = 0, gerencia = 0, adm10 = 0, novo = 999, antigo = 0;
        boolean valid = false;

        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        while (!valid) {
            System.out.println("FALE SEU NOME: (0 para acabar)");
            String nome = scanner.nextLine();
            if (nome.contentEquals("0"))
                break;
            System.out.println("Fale seu RF: ");
            rf = scanner.nextInt();
            scanner.nextLine();
                if (rf >999999){
                   System.out.println("Número de RF inválido. Tente novamente.");
                }
            year = (int) (rf / 10000);
            codigo = (int) ((rf / 1000) % 10);
            admissao = (int) (rf/1000);
            if (year > 14 || year < 10) {
                System.out.println("Número de RF inválido. Tente novamente.");
            } else if (codigo > 4 || codigo < 1) {
                System.out.println("Número de RF inválido. Tente novamente.");
            } else if (admissao > 999){
                System.out.println("NUmero de RF invalido. Tente novamente.");
            }
                if  (admissao < novo) {
                    novo = admissao;
                    novao = nome;
                }
                if (admissao > antigo) {
                    antigo = admissao;
                    antigao = nome;
                }

            if (codigo == 4)
                obras++;
            else if (codigo == 3)
                pesquisa++;
            else if (codigo == 2) {
                administracao++;
                if (year == 10)
                    adm10++;
            }
            else gerencia++;
            stringBuilder.append("NOME: ").append(nome).append("  ").append("REGISTO: ").append(rf).append("\n");
        }
        int maior = Math.max(Math.max(obras, pesquisa), Math.max(administracao, gerencia));
            if (maior == obras){
                setmaior = "Obras";
            } else if (maior == pesquisa){
                setmaior = "Pesquisa";
            } else if (maior == administracao){
                setmaior = "Administracao";
            } else {
                setmaior = "Gerecia";
            }
        System.out.println("FUNCIONARIOS POR SETOR: \n" +
                "Gerencia = " + gerencia + "\n" +
                "Administracao = " + administracao + "\n" +
                "Pesquisa = " + pesquisa + "\n" +
                "Obras = " + obras);
        System.out.println("ENTRARAM EM 2010 na Administracao = " + adm10);
        System.out.println("SETOR COM MAIS FUNCIONARIOS = " + setmaior);
        System.out.println("MAIS ANTIGO = " + antigo + "\n" +
                "Mais novo " + novo);

    }
}
