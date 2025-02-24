package tema4.POO3.ejercicio7;

public class AtaqueMagica implements IAtaque{
    @Override
    public void lanzar() {
        System.out.println("Ataque magica lanzada");
    }

    @Override
    public int coste() {
        return 15;
    }

    @Override
    public int damageInfligido() {
        return 20;
    }
}
