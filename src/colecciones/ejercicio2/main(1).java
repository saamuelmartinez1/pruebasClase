package Tema5.Colecciones1.Ejercicio2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Map<String, Usuario> gym = new HashMap<>();
        int breakWhile = 0;
        while (breakWhile == 0) {
            showMenu();
            System.out.println("Elije que quieres hacer: ");
            Scanner in = new Scanner(System.in);
            int opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    //DAR DE ALTA A UN USUARIO
                    System.out.println("Escriba aqui su nombre:");
                    String nombre = in.next();

                    System.out.println("Escriba aqui su edad:");
                    int edad = in.nextInt();

                    Usuario usuario = new Usuario(nombre, edad);

                    System.out.println("Escriba aqui su DNI:");
                    String dni = in.next();
                    gym.put(dni, usuario);
                    break;
                case 2:
                    //DAR DE BAJA A UN USUARIO
                    System.out.println("Escriba aqui su DNI:");
                    dni = in.next();
                    System.out.println("¿Seguro que quiere dar de baja? s/n");
                    String baja = in.next();
                    if (Objects.equals(baja, "s")){
                        if (gym.containsKey(dni)) {
                            System.out.println("El cliente "+ gym.get(dni).getNombre()+" ha sido dado de baja");
                            gym.remove(dni);
                        } else {
                            System.out.println("El dni "+ dni+" no se encuentra en el sistema");
                        }
                    }else {
                        System.out.println("Baja cancelada");
                    }
                    break;
                case 3:
                    //VISUALIZAR DATOS DE UN USUARIO
                    System.out.println("Escriba aqui su DNI:");
                    dni = in.next();

                    if (gym.containsKey(dni)) {
                        System.out.println(gym.get(dni));
                    } else {
                        System.out.println("El dni "+ dni+" no se encuentra en el sistema");
                    }
                    break;
                case 4:
                    //MODIFICAR DATOS DE UN USUARIO
                    System.out.println("Escriba aqui su DNI:");
                    dni = in.next();

                    if (gym.containsKey(dni)) {
                        int exit = 0;
                        while (exit == 0) {
                            System.out.println("""
                                    1. Modificar nombre
                                    2. Modificar edad
                                    3. Salir
                                    """);
                            int eleccion = in.nextInt();
                            switch (eleccion) {
                                case 1:
                                    System.out.println("Nombre actual: " + gym.get(dni).getNombre());
                                    System.out.println("Escriba el nombre nuevo:");
                                    String newName = in.next();
                                    System.out.println("Confirme el nombre nuevo;");
                                    String confirmationName = in.next();
                                    if (Objects.equals(newName, confirmationName)) {
                                        gym.get(dni).setNombre(newName);
                                        System.out.println("Nombre cambiado correctamente");
                                    } else {
                                        System.out.println("La confirmacion del nombre no concuerda con el nombre nuevo");
                                    }
                                    break;
                                case 2:
                                    System.out.println("Edad actual: " + gym.get(dni).getEdad());
                                    System.out.println("Escriba la nueva edad:");
                                    int newAge = in.nextInt();
                                    System.out.println("Confirme la nueva edad:");
                                    int confirmationAge = in.nextInt();
                                    if (newAge == confirmationAge) {
                                        gym.get(dni).setEdad(newAge);
                                        System.out.println("Edad cambiada correctamente");
                                    } else {
                                        System.out.println("La confirmacion de la edad no concuerda con nueva edad");
                                    }
                                    break;
                                case 3:
                                    exit++;
                                    break;
                                default:
                                    System.out.println("Error, recuerda poner un numero entre 1 y 3");
                                    break;
                            }
                        }
                    } else {
                        System.out.println("El dni "+ dni+" no se encuentra en el sistema");
                    }
                    break;
                case 5:
                    //SALIR
                    breakWhile++;
                    break;
                default:
                    //INFORMAR DE ERROR
                    System.out.println("Error, recuerda poner un numero entre 1 y 5");
                    break;
            }
        }

    }
    public static void showMenu(){
        System.out.println("""
                1. Dar de alta
                2. Dar de baja
                3. Mostrar datos
                4. Modificar datos
                5. Salir.
                """);
    }
}
