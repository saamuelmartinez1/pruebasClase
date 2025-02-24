package tema4.POO3.ejercicio1;

abstract class Vehiculo {
    private String matricula;
    private String bastidor;
    private int numRuedas;

    protected Vehiculo(String matricula, String bastidor, int numRuedas) {
        this.matricula = matricula;
        this.bastidor = bastidor;
        this.numRuedas = numRuedas;
    }

    protected String getMatricula() {
        return matricula;
    }

    protected void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    protected String getBastidor() {
        return bastidor;
    }

    protected void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    protected int getNumRuedas() {
        return numRuedas;
    }

    protected void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }
}
