package Algoritmo_conteudo5;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class E2 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.##");
        String rs = JOptionPane.showInputDialog("Qual o raio da esfera para calcular o volume e a area?");
        double r = Double.parseDouble(rs);
        double area = (4 * Math.PI * (r * r));
        double volume = ((4/3)* Math.PI * Math.pow(r, 3));
        JOptionPane.showMessageDialog(null, "A area da esfera e: " + df.format(area) + "\n E o volme da esfera e: " + df.format(volume));

    }
}
//Area = 4*pi*r2
//volume = 4/3 * pi * r3