package AtividadePY;
import java.util.Scanner;
public class Atividade3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale o usuario");
        String login = scanner.nextLine();
            if (login.contentEquals("aluno")){
                System.out.println("Usuario correto");
            } else {
                for (int i = 3; i >= 1; i--){
                    System.out.println("Errado. Voce tem mais " + i + " tentativas restantes.");
                    login = scanner.nextLine();
                    if (login.contentEquals("aluno")){
                        break;
                    }
                    if (i == 0){
                        System.out.println("Acabou suas chances.");
                        return;
                    }
                }
            }
            System.out.println("Certo\nAgora fale a senha");
            String senha = scanner.nextLine();
                if (senha.contentEquals("java2024")){
                    System.out.println("Acesso liberado");
                } else {
                    for (int i = 3; i >= 0; i--){
                        System.out.println("Errado. Voce tem mais " + i + " tentativas restantes.");
                        senha = scanner.nextLine();
                            if(senha.contentEquals("java2024"))
                            break;
                            if(i == 0) {
                                System.out.println("Acabou as tentativas");
                                break;
                            }
                    }
                }
                System.out.println("Acesso concedido! Bem-vindo");
                scanner.close();
    }
}
