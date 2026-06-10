package Algoritmo_conteudo5;
import javax.swing.*;

public class E9 {
    public static void main(String[] args){
        String n1s = JOptionPane.showInputDialog("Fale a nota da primeira prova");
        String n2s = JOptionPane.showInputDialog("Fale a nota da segunda prova");
        String n3s = JOptionPane.showInputDialog("Fale a nota da terceira prova");

        double n1 = Double.parseDouble(n1s);
        double n2 = Double.parseDouble(n2s);
        double n3 = Double.parseDouble(n3s);

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 5))/(2+3+5);
        JOptionPane.showMessageDialog(null, "A media ponderada das notas sao: " + media);

    }
}
