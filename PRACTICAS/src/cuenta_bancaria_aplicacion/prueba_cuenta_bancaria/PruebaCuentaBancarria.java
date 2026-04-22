package cuenta_bancaria_aplicacion.prueba_cuenta_bancaria;

import cuenta_bancaria_aplicacion.CuentaAhorro;
import cuenta_bancaria_aplicacion.CuentaCorriente;
import cuenta_bancaria_aplicacion.cuentabancaria;

public class PruebaCuentaBancarria {
    public static void main(String[] args) {
        var objeto1 = new CuentaAhorro("Diego",1200);
        objeto1.depositar(500);
        var objeto2 = new CuentaCorriente("Arturo",300);
        objeto2.retirarSaldo(600);
    }
}
