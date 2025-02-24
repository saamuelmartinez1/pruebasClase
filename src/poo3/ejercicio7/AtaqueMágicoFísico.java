package tema4.POO3.ejercicio7;

public class AtaqueMágicoFísico implements IAtaque{
    @Override
    public void lanzar() {
        System.out.println("Ataque magica y fisica lanzada");
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
