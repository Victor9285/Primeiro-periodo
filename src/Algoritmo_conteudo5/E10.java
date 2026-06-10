package Algoritmo_conteudo5;
import javax.swing.*;
public class E10 {
    public static void main(String[] args){
        String ns = JOptionPane.showInputDialog("Fale o numero");
        int n = Integer.parseInt(ns);
        int tamanho = ns.length();
        String number = "";
        for (int i = 0; i < tamanho; i++) {
            number += ns.charAt(i) + " ";
        }
            JOptionPane.showMessageDialog(null, number);

    }
}
