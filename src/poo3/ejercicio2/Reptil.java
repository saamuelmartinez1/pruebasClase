package tema4.POO3.ejercicio2;

public class Reptil extends Animal{
    public enum TipoPiel{
        ESCAMAS,CAPARAZON
    }
    private static TipoPiel tipoPiel;

    public Reptil(String nombreCientifico, int edad, String tipoGestacion, String habitat, Reptil.TipoPiel tipoPiel) {
        super(nombreCientifico, edad, tipoGestacion, habitat);
        this.tipoPiel = tipoPiel;
    }

    @Override
    void comer() {
        System.out.println("El reptil "+getNombreCientifico()+"come mosquitos y roedores");
    }

    @Override
    void dormir() {
        System.out.println("El reptil "+getNombreCientifico()+" duerme con los ojos abiertos");
    }

    @Override
    void hacerRuido() {
        System.out.println("El reptil "+getNombreCientifico()+" hace btzzzzzz");
    }
    public void seArrastra(){
        if (tipoPiel == Reptil.TipoPiel.ESCAMAS){
            System.out.println("El animal "+ getNombreCientifico()+" se esta arrastrando");
        }else {
            System.out.println("El animal "+ getNombreCientifico()+" NO se arrastra");
        }
    }
}
