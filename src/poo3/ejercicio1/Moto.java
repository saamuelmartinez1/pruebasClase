package tema4.POO3.ejercicio1;

public class Moto extends Vehiculo{
    private int cilindrada;
    private final int maxCilindraraSinCarnet;

    public Moto(String matricula, String bastidor, int numRuedas, int cilindrada) {
        super(matricula, bastidor, numRuedas);
        this.cilindrada = cilindrada;
        this.maxCilindraraSinCarnet = 125;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public boolean necesitaCarnet(){
        return cilindrada > maxCilindraraSinCarnet;
    }

    public String toString(){
        return "La moto con la matricula "+getMatricula()+" tiene una cilindrara de "+getCilindrada()+"cc";
    }
}
