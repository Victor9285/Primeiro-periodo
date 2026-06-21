package PROVA;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class D25938C {
    public static void main(String[] args) {
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        List<String> produtos = new ArrayList<String>();
            while (true){
                System.out.println("Fale o nome do " + (k + 1) + "º produto: (\"FIM\" para fechar)"); //Pega o nome dos produtos
                String nomeProduto = scanner.nextLine();
                    if (nomeProduto.equalsIgnoreCase("FIM"))
                        break;
                produtos.add(nomeProduto);
                k++;
            }
            
             String temp;
    for(int i = 0; i < produtos.size() - 1; i++){
        for (int j = 0; j < produtos.size() - 1 ; j++){
           if (produtos.get(j).compareToIgnoreCase(produtos.get(j + 1)) > 0){ //Coloca em ordem alfabetica
            temp = produtos.get(j);
            produtos.set(j, produtos.get(j + 1)); 
            produtos.set(j + 1, temp);
           } 
        }
    }


            System.out.println("Totais de produtos: " + k);
            for(int i = 0; i < produtos.size(); i++){ //coloca o numero no terminal
                System.out.println(produtos.get(i));
            }
        scanner.close();
    }
}
