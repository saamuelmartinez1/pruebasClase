package tema4.POO3.ejercicio2;

public class Pez extends Animal{
    private String sistemaRespiratorio;

    public Pez(String nombreCientifico, int edad, String tipoGestacion, String habitat, String sistemaRespiratorio) {
        super(nombreCientifico, edad, tipoGestacion, habitat);
        this.sistemaRespiratorio = sistemaRespiratorio;
    }

    public String getSistemaRespiratorio() {
        return sistemaRespiratorio;
    }

    @Override
    void comer() {
        System.out.println("El pez "+getNombreCientifico()+"come peces");
    }

    @Override
    void dormir() {
        System.out.println("El pez "+getNombreCientifico()+" duerme flotando");
    }

    @Override
    void hacerRuido() {
        System.out.println("El pez "+getNombreCientifico()+" hace glub glub glub");
    }

    public void tipoDeRespiracion(){
        System.out.println("El pez "+getNombreCientifico()+" tiene el sistema Respiratorio "+getSistemaRespiratorio());
    }
}
