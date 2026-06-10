package Algoritmo_conteudo5;
import javax.swing.*;
public class E11_Completo {
    public static void main(String[] args){
    String n = JOptionPane.showInputDialog("O numero do cheque:");
    String banco = n.substring(0,3);
    String agencia = n.substring(3, 6);
    String sequencial = n.substring(7);
    JOptionPane.showMessageDialog(null, "Banco e: " + banco + "\n" +
            "Agencia e: " + agencia + "\n" +
            "Sequencial e: " + sequencial);
    System.exit(0);
    }
}
