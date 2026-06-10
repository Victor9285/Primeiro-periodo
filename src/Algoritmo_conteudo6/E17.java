package Algoritmo_conteudo6;
import java.util.Scanner;
public class E17 {

    public static boolean lerVouF(Scanner scanner, String pergunta) { //cria o scanner e conecta ao teclado
        System.out.println(pergunta + " (Escreva V ou F)"); //vai colocar a pergunta e apos ela ira adicionar escreva V ou F
        String entrada = scanner.nextLine(); //pega realmente oq o usuario digitar

        while (!entrada.equalsIgnoreCase("V") && !entrada.equalsIgnoreCase("F")) {
            System.out.println("Escreva V ou F");
            entrada = scanner.nextLine();
        }

        return entrada.equalsIgnoreCase("V"); //equalsIgnoreCase ja e um boolean, ou seja
    // estou perguntando entrada e V? se for e True, se nao for e False sem a necessidade de todos os
    //ifs que eu faco, e o while garante que so vai passar V ou F.
}
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
                boolean temTecnico = lerVouF(scanner, "1-Voce tem curso tecnico em progamacao?");// pegando o scanner emprestado
                boolean supEmProg = lerVouF(scanner, "2-Tem superior em progamacao?");
                if(supEmProg == false){
                    System.out.println("Desculpe voce nao esta apto para trabalhar");
                    return;
                }
                boolean men3exp = lerVouF(scanner, "3-Tem menos de 3 anos de experiencia?");
                boolean criativa = lerVouF(scanner, "4-Voce se considera uma pessoa criativa?");
                boolean liderar = lerVouF(scanner, "5-Voce prefere liderar?");
                boolean sozinho = lerVouF(scanner, "6-Prefere trabalhar sozinho?");
                if (sozinho == true){
                    System.out.println("Desculpa, entao voce nao se enquadra no papel da empresa");
                    return;
                }
                boolean autodidata  = lerVouF(scanner, "E autodidata?");
                boolean remuneracao = lerVouF(scanner, "Aceita remuneracao de R$1500?");
                if (remuneracao == true){
                    liderar = false;
                    System.out.println("Se voce aceita ser lider, nao pode receber uma remuneracao abaixo de 1500, entao considera-se False ser lider.");
                }
                boolean grandeBh = lerVouF(scanner, "So aceita trabalhar em escritorios da empresa dentro de BH?");
                if(grandeBh == true){
                    System.out.println("Entao o senhor(a) nao se encaixa no perfil da empresa");
                return;
                }




    }
}

