/*package Atividade_j0ptionPane;
import javax.swing.*; // Importa tudo do swing

public class UsandoIAswing {

    // Criando as caixas de texto
    JTextField campo1 = new JTextField(5);
    JTextField campo2 = new JTextField(5);

    // Criando o painel que vai segurar as caixas
    JPanel meuPainel = new JPanel();
meuPainel.add(new JLabel("N1:"));
meuPainel.add(campo1);
meuPainel.add(Box.createHorizontalStrut(15)); // Espaço entre os campos
meuPainel.add(new JLabel("N2:"));
meuPainel.add(campo2);

    // O JOptionPane aceita o painel como mensagem!
    int resultado = JOptionPane.showConfirmDialog(null, meuPainel,
            "Digite os valores", JOptionPane.OK_CANCEL_OPTION);

if (resultado == JOptionPane.OK_OPTION) {
        double n1 = Double.parseDouble(campo1.getText());
        double n2 = Double.parseDouble(campo2.getText());
        JOptionPane.showMessageDialog(null, "Soma: " + (n1 + n2));
    }
}
*/