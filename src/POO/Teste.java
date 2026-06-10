/*Segue um programa Java completo que calcula o fatorial de um número usando um loop for, com tratamento de entradas inválidas e suporte a números grandes usando BigInteger (para evitar estouro de inteiros).

        Javaimport java.math.BigInteger;
import java.util.Scanner;

public class FatorialComFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro não negativo: ");
            if (!sc.hasNextInt()) {
                System.out.println("Entrada inválida. Digite apenas números inteiros.");
                return;
            }

            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Não existe fatorial de número negativo.");
                return;
            }

            // Usa BigInteger para suportar valores grandes
            BigInteger fatorial = BigInteger.ONE;

            for (int i = 2; i <= n; i++) {
                fatorial = fatorial.multiply(BigInteger.valueOf(i));
            }

            System.out.println(n + "! = " + fatorial);

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}


Como funciona:


Entrada e validação

Garante que o usuário digite um número inteiro.
Rejeita números negativos (fatorial não é definido para eles).



Cálculo com for

Começa de 2 até n, multiplicando o acumulador (fatorial).



Uso de BigInteger

Evita estouro de valores para números grandes (ex.: 50!).




Exemplos de execução:
Digite um número inteiro não negativo: 5
        5! = 120

Digite um número inteiro não negativo: 20
        20! = 2432902008176640000


        Se quiser, posso te enviar uma versão otimizada que calcula o fatorial de vários números em sequência sem reiniciar o programa.
Quer que eu faça essa versão?
*/