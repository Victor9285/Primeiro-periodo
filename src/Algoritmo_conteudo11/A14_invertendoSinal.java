package Algoritmo_conteudo11;


public class A14_invertendoSinal {
    public static void main(String[]args){
        double total = 0, pi = 0, pitotal, sinal = -1;
        int i = 1;
        do{
            double den = 3 + (i - 1) * 2;

            pi =(1.0/den);
            total += pi * sinal;
            pitotal = (4 * (1 + total));

            sinal *= -1;
            i++;
        }while(pitotal < 3.1416 || pitotal > 3.1417);
        System.out.println(i);
    }
}
