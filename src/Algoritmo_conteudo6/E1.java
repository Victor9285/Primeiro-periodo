package Algoritmo_conteudo6;
import javax.swing.*;
import static java.lang.Math.*;
public class E1 {
    public static void main(String[] args){
        String answearS = JOptionPane.showInputDialog("O valor de x?");
        double x = Double.parseDouble(answearS);

        if(x < 4){
            x = ((5 * x + 3)/ sqrt(16 - (x*x)));
        } else if (x == 4){
            x = 0;
        } else if (x > 4){
            x = (5 * x + 3)/ sqrt(x * x - 16);
        }
           JOptionPane.showMessageDialog(null, "O valor de x e: " + x);
        System.exit(0);
    }
}
