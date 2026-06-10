package Algoritmo_conteudo12;
import java.util.Scanner;
public class Exemplo5_BoubleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vavazinho = new int[5];
        for(int i = 0; i < vavazinho.length; i++){
            System.out.println("Escreva o numero " + (i + 1));
            vavazinho[i] = scanner.nextInt();
        }
        int temp = 0;
        for(int i = 0; i < vavazinho.length - 1; i++){
            for(int j = 0; j < vavazinho.length - 1; j++){
                if (vavazinho[j] > vavazinho[j + 1]){
                    temp = vavazinho[j];
                    vavazinho[j] = vavazinho[j + 1];
                    vavazinho[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < vavazinho.length; i++){
            System.out.print(vavazinho[i] + " ");
        }
        scanner.close();
    }
}
/* CRESCENTE
TIPO vet[] = new TIPO[TAMANHO];
TIPO temp;
for (int aux=0; aux<vet.length-1; aux++)
for (int x=0; x<vet.length-1; x++)
    if (vet[x] > vet[x+1]) {
    temp = vet[x];
    vet[x] = vet[x+1];
    vet[x+1] = temp;
}
    DECRESCENTE
TIPO vet[] = new TIPO[TAMANHO];
TIPO temp;
for (int aux=0; aux<vet.length-1; aux++)
for (int x=0; x<vet.length-1; x++)
if (vet[x] < vet[x+1]) {
temp = vet[x];
vet[x] = vet[x+1];
vet[x+1] = temp;
}
    NOME DE PESSOAS 
 for (int aux=0; aux<NOME.length-1; aux++)
            for (int x=0; x<NOME.length-1; x++)
                if (NOME[x].compareToIgnoreCase(NOME[x+1])>0) {
                    temp = NOME[x];
                    NOME[x] = NOME[x+1];
                    NOME[x+1] = temp;
                
*/