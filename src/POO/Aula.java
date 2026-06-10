package POO;
import java.text.DecimalFormat;
public class Aula {
    DecimalFormat df = new DecimalFormat("0.##");
    double nota;
    String duracao;
    void status(){
        System.out.println("A sua nota da aula foi " + df.format(nota));
        System.out.println("E a duracao da aula foi " + duracao);
    }
}
