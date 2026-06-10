package Algoritmo_conteudo5;
import javax.swing.JOptionPane;
public class E5 {
    public static void main(String[] args){
        String x = JOptionPane.showInputDialog("O valor em celsius da temperatua");
        double celsius = Double.parseDouble(x);

        JOptionPane.showMessageDialog(null, "O valor em Kelvin e: " + (celsius + 273.15)+
            "\n E o valor em Fahrenheit e: " + ((celsius * 1.8) + 32));




    }
}
// K = C + 273.15