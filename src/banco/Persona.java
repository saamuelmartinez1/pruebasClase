package tema4;

import java.util.Arrays;

public class Persona {
    private final String dni;
    private int numCuentas;
    private final Cuenta[] cuentas;

    public String getDni() {
        return dni;
    }

    public int getNumCuentas() {
        return numCuentas;
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public Persona(String dni) {
        this.dni = dni;
        this.numCuentas = 0;
        this.cuentas = new Cuenta[3];
    }

    public void addCuenta(Cuenta cuenta){
        if (numCuentas < 3){
            cuentas[numCuentas] = cuenta;
            numCuentas++;
        }else {
            System.out.println("No se pueden añadir mas cuentas.");
        }
    }

    public void morosa(){
        for (int i = 0; i< numCuentas; i++){
            if (cuentas[i].getSaldo() < 0){
                System.out.println(getDni()+" eres un moroso.");
            }
        }
    }

    public String toString(){
        return "El dni "+getDni()+" tiene las cuentas "+ Arrays.toString(getCuentas());
    }
}
