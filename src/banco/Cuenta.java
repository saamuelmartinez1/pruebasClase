package tema4;

public class Cuenta {
    private final String numCuenta;
    private int saldo;

    public String getNumCuenta() {
        return numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    private void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Cuenta(String numCuenta, int saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }

    public String toString(){
        return getNumCuenta();
    }

    public void abono(int cantidad){
        setSaldo(saldo + cantidad);
        System.out.println(cantidad+ " Euros abonados al saldo de la cuenta "+getNumCuenta());
    }

    public void recibo(int cantidad){
        setSaldo(saldo-cantidad);
        System.out.println("Recibo pagado");
    }
}