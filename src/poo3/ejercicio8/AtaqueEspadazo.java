package tema4.POO3.ejercicio8;

public class AtaqueEspadazo implements IAtaqueAvanzado {
    @Override
    public void lanzar() {

    }
    @Override
    public Coste coste() {
        return new Coste(0,10);
    }

    @Override
    public Damage damage() {
        return new Damage(0,20);
    }
}