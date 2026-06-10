package Algoritmo_conteudo6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent; // o pacote de botoes
import java.awt.event.ActionListener; // o botao esperando o click
public class UsandoOJLabel extends JFrame{
    public UsandoOJLabel(){
        setTitle("Calculadora");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JTextField campo1 = new JTextField(10);
        JTextField campo2 = new JTextField(10); //quantidade de string,ou char

        JButton botao = new JButton("Somar");
        JLabel resultado = new JLabel();
        resultado.setForeground(Color.RED);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(campo1.getText());
                int n2 = Integer.parseInt(campo2.getText());

                int soma = (n1 + n2);

                resultado.setText("Resultado da soma e: " + soma);
            }
        });
        add(new JLabel());
        add(campo1);
        add(new JLabel());
        add(campo2);
        add(botao);
        add(resultado);

        setVisible(true);

    }
    public static void main(String[] args){
        new UsandoOJLabel();
    }
}
