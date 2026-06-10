package Algoritmo_conteudo5;
import javax.swing.*;
import static java.lang.Math.*; // tira a necessidade do Math.
public class E8 {
    public static void main(String[] args){
        String sS = JOptionPane.showInputDialog("Qual a area do setor circular?");
        String aA = JOptionPane.showInputDialog("Qual o angulo do setor circular?");

        double s = Double.parseDouble(sS);
        double a = Double.parseDouble(aA);
        JOptionPane.showMessageDialog(null, "O raio do setor circular e: " + sqrt(2 * s)/a);

    }
}
