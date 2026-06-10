package Algoritmo_conteudo5;
import javax.swing.JOptionPane;
public class E1 {
    public static void main(String[] args){

        String xS = JOptionPane.showInputDialog("Qual o valor do x?");
        int x = Integer.parseInt(xS);
        int f = 2 * x + 3;
        JOptionPane.showMessageDialog(null, "O valor de x na funcao: f(x) = 2x + 3 e: " + f);
    }
}
