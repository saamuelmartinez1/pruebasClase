package tema4.POO3.ejercicio1;

public class Turismo extends Vehiculo{

    public enum TipoUso{
        PRFESIONAL,PARTICULAR
    }
    private int numPlazas;
    private TipoUso tipoUso;

    public Turismo(String matricula, String bastidor, int numRuedas, int numPlazas, TipoUso tipoUso) {
        super(matricula, bastidor, numRuedas);
        this.numPlazas = numPlazas;
        this.tipoUso = tipoUso;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public TipoUso getTipoUso() {
        return tipoUso;
    }

    public String toString(){
        return "El turismo con matricula "+getMatricula()+" tiene "+getNumPlazas()+" y se usa para "+ getTipoUso();
    }
}
