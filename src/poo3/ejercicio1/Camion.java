package tema4.POO3.ejercicio1;

public class Camion extends Vehiculo{

    int maxWeight;
    boolean dangerous;

    public Camion(String matricula, String bastidor, int numRuedas, int maxWeight, boolean dangerous) {
        super(matricula, bastidor, numRuedas);
        this.maxWeight = maxWeight;
        this.dangerous = dangerous;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public String isDangerous() {
        String text;
        if (dangerous) {
            text = "Es peligroso";
        }else {
            text = "No es peligroso";
        }
        return text;
    }

    public String toString(){
        return "El camion con matricula "+getMatricula()+" tiene un peso maximo de "+getMaxWeight()+" y "+isDangerous();
    }
}
