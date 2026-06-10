package Algoritmo_conteudo10;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder relatorio = new StringBuilder();
        String city = "";
        int citys = 0, totalpeople = 0, morewomen = 0,quantity = 0;
        double votersporcent = 0, population = 0,mediaman = 0, minus = 1000000;
        do {
            System.out.println("Nome da cidade: ");
            city = scanner.nextLine();
                if (city.contentEquals("Zimbabue de Minas"))
                    break;
            System.out.println("Populacao: ");
            population = scanner.nextInt();
                if(population < minus) {
                    minus = population;
                }
            System.out.println("Numero de eleitores: ");
            int voters = scanner.nextInt();
            System.out.println("Quantidade de Homens: ");
            int man = scanner.nextInt();
            System.out.println("Quantidade de Mulheres: ");
            int women = scanner.nextInt();
                while((women + man) > population){
                    System.out.println("HOMEM E MULHERES E DIFERENTE DA POPULACAO.");
                    System.out.println("Quantidade de Homens: ");
                    man = scanner.nextInt();
                    System.out.println("Quantidade de Mulheres: ");
                    women = scanner.nextInt();
                }
                    if(women > man)
                        morewomen++;
                    mediaman += man;
                citys++;
                totalpeople += population;
                votersporcent = population - votersporcent;
                votersporcent /= 100;
                quantity++;
                relatorio.append("CIDADE: ").append(city).append(" ").append("Populacao: ").append(population).append(" ").append("Eleitores: ").append(voters).append(" ").append("Homens: ").append(man).append(" ").append("Mulheres: ").append(women).append("\n");
        }while(!city.contentEquals("Zimbabue de Minas"));
        System.out.println(relatorio.toString());
        System.out.println("------");
        System.out.println("Total de cidades = " + citys);
        System.out.println("Populacao total  = " + totalpeople);
        System.out.println("Percentual de eleitores = %" + (population * votersporcent));
        System.out.println("Cidades com mais mulheres que homens= " + morewomen);
        System.out.println("Media de homens= " + (mediaman/quantity));
        System.out.println("Cidade com menor populacao: " + minus);
        scanner.close();

    }
}
