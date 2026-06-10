package POO;

public class A3 {
    public static void main(String[] args) {
        //telefone = + = publico;   - = privado;    # = protegido.
        // + = todas as classes tem acesso a ela
        // - = somente a classe atual
        // # = classe atual e sub classes
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        
        c1.status();


    }
}
