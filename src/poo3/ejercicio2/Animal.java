package tema4.POO3.ejercicio2;

abstract class Animal {
    private String nombreCientifico;
    private int edad;
    private String tipoGestacion;
    private String habitat;

    //CONSTRUCTOR
    protected Animal(String nombreCientifico, int edad, String tipoGestacion, String habitat) {
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;
        this.tipoGestacion = tipoGestacion;
        this.habitat = habitat;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipoGestacion() {
        return tipoGestacion;
    }

    public String getHabitat() {
        return habitat;
    }
    abstract void comer();
    abstract void dormir();
    abstract void hacerRuido();
}
