package tema4.POO3.ejercicio2;

public class Roedor extends Animal{
    private int numPatas;

    public Roedor(String nombreCientifico, int edad, String tipoGestacion, String habitat, int numPatas) {
        super(nombreCientifico, edad, tipoGestacion, habitat);
        this.numPatas = numPatas;
    }

    public int getNumPatas() {
        return numPatas;
    }

    @Override
    void comer() {
        System.out.println("El roedor "+getNombreCientifico()+"come pipas");
    }

    @Override
    void dormir() {
        System.out.println("El roedor "+getNombreCientifico()+" duerme boca arriba");
    }

    @Override
    void hacerRuido() {
        System.out.println("El roedor "+getNombreCientifico()+" hace miñmñimiñi");
    }

    public void cantidadDePatas(){
        System.out.println("El roedor "+getNombreCientifico()+" tiene "+getNumPatas()+" patas");
    }
}
