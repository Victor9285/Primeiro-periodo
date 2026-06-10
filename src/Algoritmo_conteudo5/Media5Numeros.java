package Algoritmo_conteudo5;
import javax.swing.JOptionPane;
public class Media5Numeros {
    public static void main(String[] args){

        String n1S = JOptionPane.showInputDialog("Escreva o primeiro numero");
        int n1 = Integer.parseInt(n1S);

        String n2S = JOptionPane.showInputDialog("Escreva o segundo numero");
        int n2 = Integer.parseInt(n2S);

        String n3S = JOptionPane.showInputDialog("Escreva o terceiro numero");
        int n3 = Integer.parseInt(n3S);

        String n4S = JOptionPane.showInputDialog("Escreva o quarto numero");
        int n4 = Integer.parseInt(n4S);

        String n5S = JOptionPane.showInputDialog("Escreva o quinto numero");
        int n5 = Integer.parseInt(n5S);

        int media = (n1 + n2 + n3 + n4 + n5)/5;

        JOptionPane.showMessageDialog(null,"A media e: " + media);

    }
}
