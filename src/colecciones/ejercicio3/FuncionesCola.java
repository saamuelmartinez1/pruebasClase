package Tema5.Colecciones1.Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FuncionesCola {
    List<Usuario> cola = new ArrayList<>();
    public void agregarUsuario(Usuario usuario) {
        cola.add(usuario);
        System.out.println("Usuario agregado a la cola.");
    }

    public void eliminarPrimero(){
        if (cola.isEmpty()){
            System.out.println("La cola esta vacia");
        }else {
            cola.removeFirst();
            System.out.println("Eliminado el primer usuario de la cola");
        }
    }
    public void eliminarPorDNI(String dni){
        for (Usuario usuario: cola){
            if (Objects.equals(dni, usuario.getDni())){
                cola.remove(usuario);
                System.out.println("Usuario eliminado de la cola");
                return;
            }
        }
        System.out.println("DNI no encontrado en la cola");
    }
}
