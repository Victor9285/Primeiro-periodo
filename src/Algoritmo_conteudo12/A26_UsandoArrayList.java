package Algoritmo_conteudo12;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class A26_UsandoArrayList {
    public static void main(String[] args) {
         String nome = "";
        Scanner scanner = new Scanner(System.in);
        List<String> listaNomes = new ArrayList<String>(); //Crio a lista, com o tipo <String>
        List<Double> listaSalario = new ArrayList<Double>(); //Crio Double, porem double e primitivo, por isso tenho que colocar na classe Double.
        do{
            System.out.println("Fale o nome do funcionario: (\"X\" PARA SAIR)");
            nome = scanner.nextLine();
                if(nome.equalsIgnoreCase("X"))
                    break;
            listaNomes.add(nome);
            System.out.println("Fale o salario do " + listaNomes.get(listaNomes.size()-1) + ": " ); //pega o nome do ultimo para colocar na pergunta
            double salario = scanner.nextDouble();
            scanner.nextLine();
            listaSalario.add(salario);

        }while(!nome.equalsIgnoreCase("X"));
        System.out.println("-------------------");
        System.out.println("Quantos por cento de reajuste salarial para pessoas com menos de 1000 reais: ");
        double reajuste = scanner.nextDouble();
        reajuste /= 100;
        scanner.nextLine();
        for(int i = 0; i < listaNomes.size(); i++){
            if (listaSalario.get(i) < 1000){
                double salarioComReajuste = listaSalario.get(i) + (listaSalario.get(i) * reajuste);
                listaSalario.set(i, salarioComReajuste);
            }
        }
        for (int i = 0; i < listaNomes.size(); i++){
            System.out.println("O " + listaNomes.get(i) + " tem o salario de " + listaSalario.get(i) + ".");
        }
        scanner.close();
    }
}
