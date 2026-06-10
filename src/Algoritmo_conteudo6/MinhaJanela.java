package Algoritmo_conteudo6;
import javax.swing.*;
import java.awt.*; //abstrac windows toolkit
import java.awt.event.ActionEvent; //pacote que detalha os botoes apertados
import java.awt.event.ActionListener; //Espera o click do mouse

public class MinhaJanela extends JFrame {
        public MinhaJanela(){
            setTitle("Calculator de soma");
            setSize(300, 250); //tamanho da janela
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new FlowLayout()); //flow = sequencia, esquerda para direita
            setLocationRelativeTo(null);

            //criar um campo de texto
            JTextField campo1  = new JTextField(10);//10 quantas letras cabem na caixa

            JTextField campo2 = new JTextField(10); // tamanho da caixa

            JButton botao = new JButton("Somar");
            JLabel resultado = new JLabel("O resultado aparecera aqui");
            resultado.setForeground(Color.RED);

            botao.addActionListener(new ActionListener() { //ou seja, faz o botao esperar um click sobre ele
                @Override
                public void actionPerformed(ActionEvent e) {
                    double n1 = Double.parseDouble(campo1.getText()); // era uma string
                    double n2 = Double.parseDouble(campo2.getText());
                    double soma = n1 + n2;

                    resultado.setText("Resultado e " + soma);
                }
            });
            add(new JLabel("Numero 1"));
            add(campo1);
            add(new JLabel("Numero 2"));
            add(campo2);
            add(botao);
            add(resultado);

            setVisible(true);


        }

        public static void main(String[] args){
            new MinhaJanela();
    }
}
