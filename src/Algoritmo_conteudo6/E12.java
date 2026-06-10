package Algoritmo_conteudo6;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
public class E12 extends JFrame {
    public E12(){
       DecimalFormat df = new DecimalFormat("0.##");

    setTitle("Calculadora de gastos");
    setSize(800, 600);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout()); //vai colocar da esquerda pra direita

        JTextField bolasC = new JTextField(10);
        JTextField bolasComDefeitoC = new JTextField(10);
        JTextField precoDaCaixaC = new JTextField(10);
        JTextField mesesAteCopaC = new JTextField(4);
        JTextField valorAluguelC = new JTextField(10);

        JButton botao = new JButton("Custo total");
        JLabel resultado = new JLabel("Preencha todos os dados");
        resultado.setForeground(Color.RED);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double bolas = Double.parseDouble(bolasC.getText());
                double bolasComDefeito = Double.parseDouble(bolasComDefeitoC.getText());
                double precoDaCaixa = Double.parseDouble(precoDaCaixaC.getText());
                double mesesAteCopa = Double.parseDouble(mesesAteCopaC.getText());
                double valorAluguel = Double.parseDouble(valorAluguelC.getText());

                double GastoAluguel = valorAluguel * mesesAteCopa;
                        if(bolas < bolasComDefeito){
                            resultado.setText("As bolas com defeito ultrapassam a quantidade de bolas normais");
                            resultado.setForeground(Color.RED);
                            return;
                        }
                double TotalDeBolas = bolas - bolasComDefeito;
                double galpao = Math.ceil((TotalDeBolas/10.0) / 850.0);
                double CustoTotal = (valorAluguel * galpao) * mesesAteCopa;

                DecimalFormat df = new DecimalFormat("0.00");
                resultado.setText("Custo total gasto em alguel sera " + df.format(CustoTotal) +
                        "E os galpoes necessarios sao: " + (int)galpao);
            }
        });
        add(new JLabel("Total de bolas"));
        add(bolasC);
        add(new JLabel("Bolas com defeito"));
        add(bolasComDefeitoC);
        add(new JLabel("Preco da caixa"));
        add(precoDaCaixaC);
        add(new JLabel("Meses ate a copa"));
        add(mesesAteCopaC);
        add(new JLabel("Preco do aluguel"));
        add(valorAluguelC);

        add(botao);
        add(resultado);

    setVisible(true);
    }
    public static void main(String[] args){
        new E12();
    }
}