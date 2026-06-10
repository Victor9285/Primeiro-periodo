package Algoritmo_conteudo5;
import javax.swing.JOptionPane;
public class E3 {
    public static void main(String[] args){
        String salarioS = JOptionPane.showInputDialog("Qual o salario ganho?");
        String numDeDepS = JOptionPane.showInputDialog("Qual o numero de dependentes?");
        double salario = Double.parseDouble(salarioS);
        double numDeDep = Double.parseDouble(numDeDepS);
        double liquido = numDeDep * 60;
        double ImpRenda = liquido * 0.15;
        JOptionPane.showMessageDialog(null, "O ganho liquido sera: " + liquido +
                "\n E o imposto de renda sera: " + ImpRenda);

    }
}
