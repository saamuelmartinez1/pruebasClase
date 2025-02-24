package tema4.POO3.ejercicio2;

public class Ave extends Animal{
    private int alturaVuelo;

    public Ave(String nombreCientifico, int edad, String tipoGestacion, String habitat, int alturaVuelo) {
        super(nombreCientifico, edad, tipoGestacion, habitat);
        this.alturaVuelo = alturaVuelo;
    }

    public int getAlturaVuelo() {
        return alturaVuelo;
    }

    @Override
    void comer() {
        System.out.println("El ave "+getNombreCientifico()+"come gusanos");
    }

    @Override
    void dormir() {
        System.out.println("El ave "+getNombreCientifico()+" duerme en su nido");
    }

    @Override
    void hacerRuido() {
        System.out.println("El ave "+getNombreCientifico()+" hace piopiopio");
    }

    public void distanciaDeVuelo(){
        System.out.println("El ave "+getNombreCientifico()+" vuela a una altura de "+getAlturaVuelo()+" metros");
    }
}
