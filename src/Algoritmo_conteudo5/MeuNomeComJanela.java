package Algoritmo_conteudo5;
import javax.swing.JOptionPane; //javax = extesao grafica, swing = interface visual
public class MeuNomeComJanela {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Qual seu nome?");

        JOptionPane.showMessageDialog(null, "Ola " + nome);


    }
}