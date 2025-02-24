package tema4.POO3.ejercicio8;

public class AtaqueBolaFuego implements IAtaqueAvanzado {


    @Override
    public void lanzar() {

    }
    @Override
    public Coste coste() {
        return new Coste(0,10);
    }

    @Override
    public Damage damage() {
        return new Damage(20,0);
    }
}