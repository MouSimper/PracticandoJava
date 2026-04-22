package cuenta_bancaria_aplicacion;

public class CuentaCorriente extends cuentabancaria{
    public CuentaCorriente(String titutlar, float saldo) {
        super(titutlar, saldo);
    }

    @Override
    public void retirarSaldo(float cantidad) {
        if(getSaldo()+200<cantidad){
            System.out.println("No se puede hacer ese retiro");
        }else{
            setSaldo(getSaldo()-cantidad);
            System.out.println("Su saldo ha sido actualizado: "+getSaldo());
        }
    }
}
