package Algoritmo_conteudo6;
import java.util.Scanner;
public class E13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Fale a hora de comeco do jogo");
        String hora = scanner.nextLine();
        if (!hora.contains(":")){
            hora = hora + ":00";
        }

        String partes[] = hora.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        System.out.println("Fale a hora final do jogo");
        String horafinal = scanner.nextLine();
        String partesfinal[] = horafinal.split(":");
        int horasfinal = Integer.parseInt(partesfinal[0]);
        int minutosfinal = Integer.parseInt(partesfinal[1]);
        int diferencahoras = (horasfinal - horas);
        int diferencaminutos = (minutosfinal - minutos);
        if(diferencaminutos < 0){
            diferencahoras -= 1;
            diferencaminutos += 60;
        }

        System.out.println(("Duracao = " + diferencahoras + " hs " + diferencaminutos + " min."));
    }
}
