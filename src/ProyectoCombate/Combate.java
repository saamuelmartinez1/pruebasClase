package ProyectoCombate;


import java.util.Scanner;

public class Combate {
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
                System.out.println("\n" +
                        "███╗░░░███╗░█████╗░██████╗░████████╗░█████╗░██╗░░░░░  ██╗░░██╗░█████╗░███╗░░░███╗██████╗░░█████╗░████████╗\n" +
                        "████╗░████║██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██║░░░░░  ██║░██╔╝██╔══██╗████╗░████║██╔══██╗██╔══██╗╚══██╔══╝\n" +
                        "██╔████╔██║██║░░██║██████╔╝░░░██║░░░███████║██║░░░░░  █████═╝░██║░░██║██╔████╔██║██████╦╝███████║░░░██║░░░\n" +
                        "██║╚██╔╝██║██║░░██║██╔══██╗░░░██║░░░██╔══██║██║░░░░░  ██╔═██╗░██║░░██║██║╚██╔╝██║██╔══██╗██╔══██║░░░██║░░░\n" +
                        "██║░╚═╝░██║╚█████╔╝██║░░██║░░░██║░░░██║░░██║███████╗  ██║░╚██╗╚█████╔╝██║░╚═╝░██║██████╦╝██║░░██║░░░██║░░░\n" +
                        "╚═╝░░░░░╚═╝░╚════╝░╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝╚══════╝  ╚═╝░░╚═╝░╚════╝░╚═╝░░░░░╚═╝╚═════╝░╚═╝░░╚═╝░░░╚═╝░░░\n");

                System.out.println("-es recomendable acceder a las reglas antes de empezar a jugar");
                System.out.println("1) Elegir un personaje predefinido");
                System.out.println("2) Crear tu propio personaje");
                System.out.println("3) Combatir (elige primero tus personajes)");
                System.out.println("4) Reglas del juego");
                System.out.println("5) Abandonar juego");
                System.out.print("Elige una opción: \n");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("PERSONAJES DISPONIBLES:");

                        System.out.println("────────────────────────────────\n" +
                                "───────────────██████████───────\n" +
                                "──────────────████████████──────\n" +
                                "──────────────██────────██──────\n" +
                                "──────────────██▄▄▄▄▄▄▄▄▄█──────\n" +
                                "──────────────██▀███─███▀█──────\n" +
                                "█─────────────▀█────────█▀──────\n" +
                                "██──────────────────█───────────\n" +
                                "─█──────────────██──────────────\n" +
                                "█▄────────────████─██──████\n" +
                                "─▄███████████████──██──██████ ──\n" +
                                "────█████████████──██──█████████\n" +
                                "─────────────████──██─█████──███\n" +
                                "──────────────███──██─█████──███\n" +
                                "──────────────███─────█████████\n" +
                                "──────────────██─────████████▀\n" +
                                "────────────────██████████\n" +
                                "────────────────██████████\n" +
                                "─────────────────████████\n" +
                                "──────────────────██████████▄▄\n" +
                                "────────────────────█████████▀\n" +
                                "─────────────────────████──███\n" +
                                "────────────────────▄████▄──██\n" +
                                "────────────────────██████───▀\n" +
                                "────────────────────▀▄▄▄▄▀\n");
                        System.out.println("1) Sicario - Vida: 282, Velocidad: 73, Defensa: 80, Ataque: 65");

                        System.out.println("─────▄██▀▀▀▀▀▀▀▀▀▀▀▀▀██▄─────\n" +
                                "────███───────────────███────\n" +
                                "───███─────────────────███───\n" +
                                "──███───▄▀▀▄─────▄▀▀▄───███──\n" +
                                "─████─▄▀────▀▄─▄▀────▀▄─████─\n" +
                                "─████──▄████─────████▄──█████\n" +
                                "█████─██▓▓▓██───██▓▓▓██─█████\n" +
                                "█████─██▓█▓██───██▓█▓██─█████\n" +
                                "█████─██▓▓▓█▀─▄─▀█▓▓▓██─█████\n" +
                                "████▀──▀▀▀▀▀─▄█▄─▀▀▀▀▀──▀████\n" +
                                "███─▄▀▀▀▄────███────▄▀▀▀▄─███\n" +
                                "███──▄▀▄─█──█████──█─▄▀▄──███\n" +
                                "███─█──█─█──█████──█─█──█─███\n" +
                                "███─█─▀──█─▄█████▄─█──▀─█─███\n" +
                                "███▄─▀▀▀▀──█─▀█▀─█──▀▀▀▀─▄███\n" +
                                "████─────────────────────████\n" +
                                "─███───▀█████████████▀───████\n" +
                                "─███───────█─────█───────████\n" +
                                "─████─────█───────█─────█████\n" +
                                "───███▄──█────█────█──▄█████─\n" +
                                "─────▀█████▄▄███▄▄█████▀─────\n" +
                                "──────────█▄─────▄█──────────\n" +
                                "──────────▄█─────█▄──────────\n" +
                                "───────▄████─────████▄───────\n" +
                                "─────▄███████───███████▄─────\n" +
                                "───▄█████████████████████▄───\n" +
                                "─▄███▀───███████████───▀███▄─\n" +
                                "███▀─────███████████─────▀███\n" +
                                "▌▌▌▌▒▒───███████████───▒▒▐▐▐▐\n" +
                                "─────▒▒──███████████──▒▒─────\n" +
                                "──────▒▒─███████████─▒▒──────\n" +
                                "───────▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒───────\n" +
                                "─────────████░░█████─────────\n" +
                                "────────█████░░██████────────\n" +
                                "──────███████░░███████───────\n" +
                                "─────█████──█░░█──█████──────\n" +
                                "─────█████──████──█████──────\n" +
                                "──────████──████──████───────\n" +
                                "──────████──████──████───────\n" +
                                "──────████───██───████───────\n" +
                                "──────████───██───████───────\n" +
                                "──────████──████──████───────\n" +
                                "─██────██───████───██─────██─\n" +
                                "─██───████──████──████────██─\n" +
                                "─███████████████████████████─\n" +
                                "─██─────────████──────────██─\n" +
                                "─██─────────████──────────██─\n" +
                                "────────────████─────────────\n" +
                                "─────────────██──────────────\n");
                        System.out.println("2) Asesino - Vida: 215, Velocidad: 122, Defensa: 45, Ataque: 98");


                        System.out.println("────────▄▄▄▄▄▄▄▄▄\n" +
                                "────────▌▐░▀░▀░▀▐\n" +
                                "────────▌░▌░░░░░▐\n" +
                                "────────▌░░░░░░░▐\n" +
                                "────────▄▄▄▄▄▄▄▄▄\n" +
                                "──▄▀▀▀▀▀▌▄█▄░▄█▄▐▀▀▀▀▀▄\n" +
                                "─█▒▒▒▒▒▐░░░░▄░░░░▌▒▒▒▒▒█\n" +
                                "▐▒▒▒▒▒▒▒▌░░░░░░░▐▒▒▒▒▒▒▒▌\n" +
                                "▐▒▒▒▒▒▒▒█░▀▀▀▀▀░█▒▒▒▒▒▒▒▌\n" +
                                "▐▒▒▒▒▒▒▒▒█▄▄▄▄▄█▒▒▒▒▒▒▒▒▌\n" +
                                "▐▒▒▒▒▐▒▒▒▒▒▒▒▒▒▒▒▒▐▒▒▒▒▒▌\n" +
                                "▐▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▌\n" +
                                "▐▒▒▒▒▒▐▒▒▒▒▒▒▒▒▒▒▒▌▒▒▒▒▒▌\n" +
                                "▐▒▒▒▒▒▒▌▒▒▒▒▒▒▒▒▒▐▒▒▒▒▒▒▌\n" +
                                "▐▒▒▒▒▒▒▌▄▄▄▄▄▄▄▄▄▐▒▒▒▒▒▒▌\n" +
                                "▐▄▄▄▄▄▄▌▌███████▌▐▄▄▄▄▄▄▌\n" +
                                "─█▀▀▀▀█─▌███▌███▌─█▀▀▀▀█\n" +
                                "─▐░░░░▌─▌███▌███▌─▐░░░░▌\n" +
                                "──▀▀▀▀──▌███▌███▌──▀▀▀▀\n" +
                                "────────▌███▌███▌\n" +
                                "────────▌███▌███▌\n" +
                                "──────▐▀▀▀██▌█▀▀▀▌\n" +
                                "▒▒▒▒▒▒▐▄▄▄▄▄▄▄▄▄▄▌▒▒▒▒▒▒▒\n");
                        System.out.println("3) Manolo el Curandero - Vida: 310, Velocidad: 60, Defensa: 60, Ataque: 70");

                        System.out.print("Jugador 1, elige tu personaje: \n");
                        personaje1 = scanner.nextInt();
                        System.out.print("Jugador 2, elige tu personaje: \n");
                        personaje2 = scanner.nextInt();

                        switch (personaje1) {
                            case 1:
                                vidaMaximaPlayer1 = 282;
                                vidaPlayer1 = 282;
                                velocidadPlayer1 = 73;
                                defensaPlayer1 = 80;
                                ataquePlayer1 = 65;
                                break;
                            case 2:
                                vidaMaximaPlayer1 = 215;
                                vidaPlayer1 = 215;
                                velocidadPlayer1 = 122;
                                defensaPlayer1 = 45;
                                ataquePlayer1 = 98;
                                break;
                            case 3:
                                vidaMaximaPlayer1 = 310;
                                vidaPlayer1 = 310;
                                velocidadPlayer1 = 60;
                                defensaPlayer1 = 60;
                                ataquePlayer1 = 70;
                                break;
                        }

                        switch (personaje2) {
                            case 1:
                                vidaMaximaPlayer2 = 282;
                                vidaPlayer2 = 282;
                                velocidadPlayer2 = 73;
                                defensaPlayer2 = 80;
                                ataquePlayer2 = 65;
                                break;
                            case 2:
                                vidaMaximaPlayer2 = 215;
                                vidaPlayer2 = 215;
                                velocidadPlayer2 = 122;
                                defensaPlayer2 = 45;
                                ataquePlayer2 = 98;
                                break;
                            case 3:
                                vidaMaximaPlayer2 = 310;
                                vidaPlayer2 = 310;
                                velocidadPlayer2 = 60;
                                defensaPlayer2 = 60;
                                ataquePlayer2 = 70;
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("CREAR PERSONAJE:");

                        int vida, velocidad, defensa, ataque;
                        boolean personajeCreado = false;

                        while (!personajeCreado) {
                            System.out.println("Por favor, asigna los atributos de tu personaje. Cada atributo debe estar entre 1 y 200, y la suma no debe exceder 500.");
                            System.out.print("Vida: ");
                            vida = scanner.nextInt();
                            System.out.print("Velocidad: ");
                            velocidad = scanner.nextInt();
                            System.out.print("Defensa: ");
                            defensa = scanner.nextInt();
                            System.out.print("Ataque: ");
                            ataque = scanner.nextInt();

                            int sumaAtributos = vida + velocidad + defensa + ataque;

                            if (vida < 1 || vida > 200 || velocidad < 1 || velocidad > 200 ||
                                    defensa < 1 || defensa > 200 || ataque < 1 || ataque > 200) {
                                System.out.println("Error: Todos los atributos deben estar entre 1 y 200. Por favor, inténtalo de nuevo.");
                            } else if (sumaAtributos > 500) {
                                System.out.println("Error: La suma total de los atributos no puede exceder 500. Por favor, inténtalo de nuevo.");
                            } else {
                                System.out.println("¡Personaje creado exitosamente!");
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
                                personajeCreado = true;
                            }
                        }
                        break;
                    case 3:

                        if (vidaPlayer1 == 0 || vidaPlayer2 == 0) {
                            System.out.println("Por favor, elige los personajes antes de combatir.");
                            break;
                        }
                        System.out.println("\n" +
                                "███████╗██╗░██████╗░██╗░░██╗████████╗\n" +
                                "██╔════╝██║██╔════╝░██║░░██║╚══██╔══╝\n" +
                                "█████╗░░██║██║░░██╗░███████║░░░██║░░░\n" +
                                "██╔══╝░░██║██║░░╚██╗██╔══██║░░░██║░░░\n" +
                                "██║░░░░░██║╚██████╔╝██║░░██║░░░██║░░░\n" +
                                "╚═╝░░░░░╚═╝░╚═════╝░╚═╝░░╚═╝░░░╚═╝░░░");

                        int turno = (velocidadPlayer1 > velocidadPlayer2) ? 1 : 2;
                        boolean juegoTerminado = false;

                        while (!juegoTerminado) {
                            System.out.println("\nEs el turno del Jugador " + turno);
                            System.out.println("---------------------------------------------------");
                            System.out.println("1) Atacar");
                            System.out.println("2) Curarse");
                            System.out.println("3) Usar ulti (requiere 3 ataques)");
                            System.out.print("Elige una acción: ");
                            int accion = scanner.nextInt();

                            if (turno == 1) {

                                switch (accion) {
                                    case 1:
                                        double daño = ataquePlayer1 * (0.5 + Math.random());
                                        if (defensaPlayer2 > 0) {
                                            defensaPlayer2 -= daño;
                                            if (defensaPlayer2 < 0) {
                                                vidaPlayer2 += defensaPlayer2;
                                                defensaPlayer2 = 0;
                                            }
                                        } else {
                                            vidaPlayer2 -= daño;
                                        }
                                        ultiPlayer1++;
                                        int intdaño = (int)daño;
                                        System.out.println("Jugador 1 atacó causando " + intdaño + " de daño.");
                                        if(vidaPlayer2<0){
                                            System.out.println("la vida del jugador 2 es 0");
                                    }else{
                                            int intvida = (int)vidaPlayer1;
                                            System.out.println("la vida restante del jugador 2 es de " + intvida);
                                        }
                                        break;
                                    case 2:
                                        int intvida1 = (int)vidaPlayer1;
                                        vidaPlayer1 = Math.min(vidaPlayer1 + 100, vidaMaximaPlayer1);
                                        System.out.println("Jugador 1 se curó. Vida actual: " + intvida1);
                                        break;
                                    case 3:
                                        if (ultiPlayer1 >= 3) {
                                            System.out.println("Jugador 1 usó su ulti. ¡Daño devastador!");
                                            vidaPlayer2 -= ataquePlayer1 * 2;
                                            ultiPlayer1 = 0;
                                        } else {
                                            System.out.println("No tienes suficientes ataques para usar la ulti.");
                                        }
                                        break;

                                }
                                turno = 2;
                            } else {
                                switch (accion) {
                                    case 1:
                                        double daño = ataquePlayer2 * (0.5 + Math.random());
                                        if (defensaPlayer1 > 0) {
                                            defensaPlayer1 -= daño;
                                            if (defensaPlayer1 < 0) {
                                                vidaPlayer1 += defensaPlayer1;
                                                defensaPlayer1 = 0;
                                            }
                                        } else {
                                            vidaPlayer1 -= daño;
                                        }
                                        ultiPlayer2++;
                                        int intdaño = (int)daño;
                                        System.out.println("Jugador 2 atacó causando " + intdaño + " de daño.");
                                        if(vidaPlayer1<0){
                                            System.out.println("la vida restante del jugador 1 es de 0");
                                    }
                                        int intvida1 = (int)vidaPlayer1;
                                        System.out.println("la vida restante del jugador 1 es de " + intvida1);
                                        break;
                                    case 2:
                                        int intvida2 = (int)vidaPlayer2;
                                        vidaPlayer2 = Math.min(vidaPlayer2 + 100, vidaMaximaPlayer2);
                                        System.out.println("Jugador 2 se curó. Vida actual: " + intvida2);
                                        break;
                                    case 3:
                                        if (ultiPlayer2 >= 3) {
                                            System.out.println("Jugador 2 usó su ulti. ¡Daño devastador!");
                                            vidaPlayer1 -= ataquePlayer2 * 2;
                                            ultiPlayer2 = 0;
                                        } else {
                                            System.out.println("No tienes suficientes ataques para usar la ulti.");
                                        }
                                        break;
                                }
                                turno = 1;
                            }

                            if (vidaPlayer1 <= 0) {
                                System.out.println("¡Jugador 2 ganó!\n");
                                juegoTerminado = true;
                            } else if (vidaPlayer2 <= 0) {
                                System.out.println("¡Jugador 1 ganó!\n");
                                juegoTerminado = true;
                            }
                        }
                        break;
                    case 4:
                        System.out.println("*Reglas:\n");
                        System.out.println("* es necesario para crear un personaje personalizado,  que inmediatamente despues de crear el personaje 1, volver a acceder a la opcion 1) para crear el personaje 2");
                        System.out.println("* Para utilizar el super ataque (ulti), es necesario haber atacado anteriormente 3 veces, si se utiliza sin esta condicion, pasara el turno");
                        System.out.println("* Si utilizas la curacion y tienes la vida al maximo, tu turno pasara y no recibiras mas salud");
                        System.out.println("* Si los personajes cuentan con la misma velocidad, atacara primero jugador 2");
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
    }

