package Algoritmo_conteudo5;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class SalarioBruto {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0.##");
        String entry = JOptionPane.showInputDialog("Digite o valor do seu salario");

        double salario = Double.parseDouble(entry); // transforma String em double

        double novoSalario = salario * 1.08;

        JOptionPane.showMessageDialog(null, "O salario com o aumento de 8% sera: " + df.format(novoSalario));





    }
}
