package cuenta_bancaria_aplicacion;

public class CuentaAhorro extends cuentabancaria{
    public CuentaAhorro(String titutlar, float saldo) {
        super(titutlar, saldo);
    }

    @Override
    public void depositar(float cantidad) {
        var calculoDel2Porciento = cantidad * 0.02F;
        setSaldo(getSaldo()+cantidad + calculoDel2Porciento);
        System.out.println("Usted a depositado "+cantidad + " su saldo " +
                "ahora es de " + getSaldo());
    }
}
