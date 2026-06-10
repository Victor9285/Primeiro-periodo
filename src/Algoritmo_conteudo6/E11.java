package Algoritmo_conteudo6;
import java.util.logging.*;
import javax.swing.*;
public class E11 {
    private static final Logger logger = Logger.getLogger(E11.class.getName());
    public static void main(String[] args){
             String PrimeiraEquipe = JOptionPane.showInputDialog("Qual a primeira equipe?");
             String SegundaEquipe = JOptionPane.showInputDialog("Qual a segunda equipe?");
             String SSetEq1 = JOptionPane.showInputDialog("Quantos sets a equipe " + PrimeiraEquipe + " fez?");
             int SetEq1 = Integer.parseInt(SSetEq1);
             String SSetEq2 = JOptionPane.showInputDialog("Quantos set a equipe " + SegundaEquipe + " fez?");
             int SetEq2 = Integer.parseInt(SSetEq2);

             if (SetEq1 == 3 && SetEq2 == 0 || SetEq1 == 3 && SetEq2 == 1){
                 JOptionPane.showMessageDialog(null,"Pontos da " + PrimeiraEquipe + " = 3\n" +
                         "Pontos da " + SegundaEquipe + " = 0"  );
             } else if (SetEq1 == 3 && SetEq2 == 2 ) {
                 JOptionPane.showMessageDialog(null, "Pontos da " + PrimeiraEquipe + " = 2\n" +
                         "Pontos da " + SegundaEquipe + " = 1");
             }
             if (SetEq2 == 3 && SetEq1 == 0 || SetEq2 == 3 && SetEq1 == 1){
            JOptionPane.showMessageDialog(null,"Pontos da " + SegundaEquipe + " = 3\n" +
                    "Pontos da " + PrimeiraEquipe + " = 0"  );
            }else if (SetEq2 == 3 && SetEq1 == 2){
            JOptionPane.showMessageDialog(null, "Pontos da " + SegundaEquipe + " = 2\n" +
                    "Pontos da " + PrimeiraEquipe + " = 1");
        }
        logger.info("O SISTEMA INICIOU CORRETAMENTE");
        System.exit(0);
        }
    }
