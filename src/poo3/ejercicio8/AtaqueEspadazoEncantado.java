package tema4.POO3.ejercicio8;

public class AtaqueEspadazoEncantado implements IAtaqueAvanzado {
    @Override
    public void lanzar() {

    }
    @Override
    public Coste coste() {
        return new Coste(10,15);
    }

    @Override
    public Damage damage() {
        return new Damage( 20,10);
    }
}