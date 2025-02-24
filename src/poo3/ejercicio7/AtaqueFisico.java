package tema4.POO3.ejercicio7;

public class AtaqueFisico implements IAtaque {
    @Override
    public void lanzar() {
        System.out.println("Ataque Fisico lanzada");
    }

    @Override
    public int coste() {
        return 10;
    }

    @Override
    public int damageInfligido() {
        return 10;
    }
}
