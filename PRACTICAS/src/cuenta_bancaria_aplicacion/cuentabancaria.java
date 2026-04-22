    package cuenta_bancaria_aplicacion;

    public class cuentabancaria {
        private String titutlar;
        private float saldo;

        public cuentabancaria(String titutlar, float saldo) {
            this.titutlar = titutlar;
            this.saldo = saldo;
        }

        public float getSaldo() {
            return saldo;
        }

        public void setSaldo(float saldo) {
            this.saldo = saldo;
        }

        public String getTitutlar() {
            return titutlar;
        }

        public void setTitutlar(String titutlar) {
            this.titutlar = titutlar;
        }
        public void depositar(float cantidad){
            this.saldo += cantidad;
            System.out.println("Usted ha depositado "+cantidad +" su saldo " +
                    "actual es de "+ getSaldo());

        }
        public void mostrarSaldo(){
            System.out.println("Tu saldo es: "+ this.saldo);
        }
        public void retirarSaldo(float cantidad){
            if (this.saldo<cantidad){
                System.out.println("No tienes esa cantidad en tu cuenta Saldo");
            } else{
                this.saldo -=cantidad;
            }
        }
    }
