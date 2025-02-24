package tema4.POO3.ejercicio2;

public class Mamifero extends Animal{
    boolean isViviparo;

    public Mamifero(String nombreCientifico, int edad, String tipoGestacion, String habitat, boolean isViviparo) {
        super(nombreCientifico, edad, tipoGestacion, habitat);
        this.isViviparo = isViviparo;
    }

    public boolean isViviparo() {
        return isViviparo;
    }
    @Override
    void comer() {
        System.out.println("El mamifero "+getNombreCientifico()+"come de todo");
    }

    @Override
    void dormir() {
        System.out.println("El mamifero "+getNombreCientifico()+" duerme como los humanos");
    }

    @Override
    void hacerRuido() {
        System.out.println("El mamifero "+getNombreCientifico()+" hace ruido con las cuerdas vocales / menos las jirafas");
    }

    public void esViviparo(){
        if (isViviparo()){
            System.out.println("El mamifero "+getNombreCientifico()+" es viviparo");
        }else {
            System.out.println("El mamifero "+getNombreCientifico()+" es oviparo");
        }
    }
}
