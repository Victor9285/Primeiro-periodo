package POO;

public class Caneta {
        public String modelo;
        public String cor;
        private float ponta;
        protected  int carga;
        protected boolean tampada;
        public void status(){
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Uma caneta: " + this.cor);
                System.out.println("Ponta " + this.ponta);
                System.out.println("Carga " + this.carga);
                System.out.println("Esta tampada? " + this.tampada);
        }
        protected void Tampar(){}
        protected void Destampar(){}


        public void Rabiscar(){//void = sem retorno


        }
    }
