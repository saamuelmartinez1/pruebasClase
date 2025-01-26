package Combate;

import java.util.Scanner;

public class CombateFunciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int personaje1 = 0, personaje2 = 0;

        int vidaMaximaPlayer1 = 0, vidaMaximaPlayer2 = 0;
        double vidaPlayer1 = 0, vidaPlayer2 = 0;
        double velocidadPlayer1 = 0, velocidadPlayer2 = 0;
        double defensaPlayer1 = 0, defensaPlayer2 = 0;
        double ataquePlayer1 = 0, ataquePlayer2 = 0;
        int ultiPlayer1 = 0, ultiPlayer2 = 0;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarPersonajes();
                    personaje1 = seleccionarPersonaje(scanner, "Jugador 1");
                    personaje2 = seleccionarPersonaje(scanner, "Jugador 2");

                    if (personaje1 == 1) {
                        vidaMaximaPlayer1 = 282;
                        vidaPlayer1 = 282;
                        velocidadPlayer1 = 73;
                        defensaPlayer1 = 80;
                        ataquePlayer1 = 65;
                    } else if (personaje1 == 2) {
                        vidaMaximaPlayer1 = 215;
                        vidaPlayer1 = 215;
                        velocidadPlayer1 = 122;
                        defensaPlayer1 = 45;
                        ataquePlayer1 = 98;
                    } else if (personaje1 == 3) {
                        vidaMaximaPlayer1 = 310;
                        vidaPlayer1 = 310;
                        velocidadPlayer1 = 60;
                        defensaPlayer1 = 60;
                        ataquePlayer1 = 70;
                    }

                    if (personaje2 == 1) {
                        vidaMaximaPlayer2 = 282;
                        vidaPlayer2 = 282;
                        velocidadPlayer2 = 73;
                        defensaPlayer2 = 80;
                        ataquePlayer2 = 65;
                    } else if (personaje2 == 2) {
                        vidaMaximaPlayer2 = 215;
                        vidaPlayer2 = 215;
                        velocidadPlayer2 = 122;
                        defensaPlayer2 = 45;
                        ataquePlayer2 = 98;
                    } else if (personaje2 == 3) {
                        vidaMaximaPlayer2 = 310;
                        vidaPlayer2 = 310;
                        velocidadPlayer2 = 60;
                        defensaPlayer2 = 60;
                        ataquePlayer2 = 70;
                    }
                    break;

                case 2:
                    System.out.println("Por favor, asigna los atributos de tu personaje (1-200 cada uno, suma máxima 500):");
                    int vida = 0, velocidad = 0, defensa = 0, ataque = 0;
                    boolean personajeCreado = false;

                    while (!personajeCreado) {
                        System.out.print("Vida: ");
                        vida = scanner.nextInt();
                        System.out.print("Velocidad: ");
                        velocidad = scanner.nextInt();
                        System.out.print("Defensa: ");
                        defensa = scanner.nextInt();
                        System.out.print("Ataque: ");
                        ataque = scanner.nextInt();

                        int sumaAtributos = vida + velocidad + defensa + ataque;

                        if (sumaAtributos <= 500 && vida <= 200 && velocidad <= 200 && defensa <= 200 && ataque <= 200) {
                            personajeCreado = true;
                        } else {
                            System.out.println("Error: Atributos no válidos. Intenta de nuevo.");
                        }
                    }

                    if (personaje1 == 0) {
                        vidaMaximaPlayer1 = vida;
                        vidaPlayer1 = vida;
                        velocidadPlayer1 = velocidad;
                        defensaPlayer1 = defensa;
                        ataquePlayer1 = ataque;
                        personaje1 = 4;
                    } else if (personaje2 == 0) {
                        vidaMaximaPlayer2 = vida;
                        vidaPlayer2 = vida;
                        velocidadPlayer2 = velocidad;
                        defensaPlayer2 = defensa;
                        ataquePlayer2 = ataque;
                        personaje2 = 4;
                    } else {
                        System.out.println("Ambos jugadores ya tienen personajes asignados.");
                    }
                    break;

                case 3:
                    if (vidaPlayer1 == 0 || vidaPlayer2 == 0) {
                        System.out.println("Por favor, elige los personajes antes de combatir.");
                        break;
                    }
                    combatir(scanner, vidaMaximaPlayer1, vidaPlayer1, velocidadPlayer1, defensaPlayer1, ataquePlayer1, ultiPlayer1,
                            vidaMaximaPlayer2, vidaPlayer2, velocidadPlayer2, defensaPlayer2, ataquePlayer2, ultiPlayer2);
                    break;

                case 4:
                    mostrarReglas();
                    break;

                case 5:
                    System.out.println("Gracias por jugar. ¡Adiós!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("Menú del juego:");
        System.out.println("1) Elegir un personaje predefinido");
        System.out.println("2) Crear tu propio personaje");
        System.out.println("3) Combatir (elige primero tus personajes)");
        System.out.println("4) Reglas del juego");
        System.out.print("Elige una opción: ");
    }

    public static void mostrarPersonajes() {
        System.out.println("PERSONAJES DISPONIBLES:");
        System.out.println("1) Sicario - Vida: 282, Velocidad: 73, Defensa: 80, Ataque: 65");
        System.out.println("2) Asesino - Vida: 215, Velocidad: 122, Defensa: 45, Ataque: 98");
        System.out.println("3) Manolo el Curandero - Vida: 310, Velocidad: 60, Defensa: 60, Ataque: 70");
    }

    public static int seleccionarPersonaje(Scanner scanner, String jugador) {
        System.out.print(jugador + ", elige tu personaje: ");
        return scanner.nextInt();
    }

    public static void combatir(Scanner scanner, int vidaMax1, double vida1, double vel1, double def1, double atk1, int ulti1,
                                int vidaMax2, double vida2, double vel2, double def2, double atk2, int ulti2) {
        int turno = (vel1 > vel2) ? 1 : 2;
        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            System.out.println("\nTurno del Jugador " + turno);
            System.out.println("1) Atacar");
            System.out.println("2) Curarse");
            System.out.println("3) Usar ulti (requiere 3 ataques)");
            System.out.print("Elige una acción: ");
            int accion = scanner.nextInt();

            if (turno == 1) {
                if (accion == 1) {
                    vida2 -= atk1;
                    System.out.println("Jugador 1 atacó y dejó al Jugador 2 con " + vida2 + " de vida.");
                    turno = 2;
                }
            } else {
                if (accion == 1) {
                    vida1 -= atk2;
                    System.out.println("Jugador 2 atacó y dejó al Jugador 1 con " + vida1 + " de vida.");
                    turno = 1;
                }
            }

            if (vida1 <= 0) {
                System.out.println("¡Jugador 2 ganó!");
                juegoTerminado = true;
            } else if (vida2 <= 0) {
                System.out.println("¡Jugador 1 ganó!");
                juegoTerminado = true;
            }
        }
    }

    public static void mostrarReglas() {
        System.out.println("Reglas del juego:");
        System.out.println("1. Crear personajes correctamente antes de combatir.");
        System.out.println("2. Cada jugador debe turnarse para realizar acciones.");
        System.out.println("3. Usar ulti requiere 3 ataques previos.");
    }
}