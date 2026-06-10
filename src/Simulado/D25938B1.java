package Simulado;
import java.util.Scanner;
public class D25938B1 {
    public static void main(String[] args){
        int contprimo = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale um numero para testalo se e numero primo");
        int n = scanner.nextInt();
            if (n < 0){
                System.out.println("FALE UM NUMERO MAIOR QUE 0");
                return;
            }
            if (n == 2){
                System.out.println("E numero primo");
                return;
            }
            for (int i = 1; i <= n; i++){
                if (n % i == 0)
                    contprimo++;
            }
        if (contprimo == 2)
            System.out.println("E numero primo");
        else System.out.println("Nao e numero primo");
    }
}
