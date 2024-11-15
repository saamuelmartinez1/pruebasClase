package ProyectoCombate;


import java.util.Scanner;

public class Combate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        int personaje1 = 0;
        int personaje2 = 0;
        int boton = 0;

        double VidaPLayer1 = 0;
        double VelocidadPLayer1 = 0;
        double DefensaPLayer1 = 0;
        double AtaquePLayer1 = 0;
        int HabilidadP1 = 0;
        int ultiP1 =0;


        double VidaPLayer2 = 0;
        double VelocidadPLayer2 = 0;
        double DefensaPLayer2 = 0;
        double AtaquePLayer2 = 0;
        int HabilidadP2 = 0;
        int ultiP2 =0;


        System.out.println("\n" +
                "███╗░░░███╗░█████╗░██████╗░████████╗░█████╗░██╗░░░░░  ██╗░░██╗░█████╗░███╗░░░███╗██████╗░░█████╗░████████╗\n" +
                "████╗░████║██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██║░░░░░  ██║░██╔╝██╔══██╗████╗░████║██╔══██╗██╔══██╗╚══██╔══╝\n" +
                "██╔████╔██║██║░░██║██████╔╝░░░██║░░░███████║██║░░░░░  █████═╝░██║░░██║██╔████╔██║██████╦╝███████║░░░██║░░░\n" +
                "██║╚██╔╝██║██║░░██║██╔══██╗░░░██║░░░██╔══██║██║░░░░░  ██╔═██╗░██║░░██║██║╚██╔╝██║██╔══██╗██╔══██║░░░██║░░░\n" +
                "██║░╚═╝░██║╚█████╔╝██║░░██║░░░██║░░░██║░░██║███████╗  ██║░╚██╗╚█████╔╝██║░╚═╝░██║██████╦╝██║░░██║░░░██║░░░\n" +
                "╚═╝░░░░░╚═╝░╚════╝░╚═╝░░╚═╝░░░╚═╝░░░╚═╝░░╚═╝╚══════╝  ╚═╝░░╚═╝░╚════╝░╚═╝░░░░░╚═╝╚═════╝░╚═╝░░╚═╝░░░╚═╝░░░");


        do {
            System.out.println("ingrese una opcion:");
            System.out.println("1) Elige un personaje predterminado");
            System.out.println("2) Crea tu propio personaje");
            System.out.println("3) Combatir (elige primero tu personaje)");
            System.out.println("4) Abandonar juego");

            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:


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
                    System.out.println("SICARIO (1)");
                    System.out.println("Vida = 125;");
                    System.out.println("Velocidad = 125;");
                    System.out.println("Defensa = 125;");
                    System.out.println("Ataque = 125;");
                    System.out.println("robo vital =1 uso");


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


                    System.out.println("ASESINO (2)");
                    System.out.println("Vida = 215;");
                    System.out.println("Velocidad = 122;");
                    System.out.println("Defensa = 65;");
                    System.out.println("Ataque = 70;");
                    System.out.println("ataque veloz = 1 uso");


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


                    System.out.println("Manolo el Curandero (3)");
                    System.out.println("Vida = 310;");
                    System.out.println("Velocidad = 60;");
                    System.out.println("Defensa = 60;");
                    System.out.println("Ataque = 98;");
                    System.out.println("curacion= 2 usos");


                    System.out.println("elija el personaje del jugador 1:");
                    personaje1 = scanner.nextInt();
                    System.out.println("elija el personaje del jugador 2:");
                    personaje2 = scanner.nextInt();



                    switch (personaje1) {

                        case 1:
                            System.out.println("El personaje 1 eligio al sicario");
                            VidaPLayer1 = 282;
                            VelocidadPLayer1 = 73;
                            DefensaPLayer1 = 80;
                            AtaquePLayer1 = 65;
                            HabilidadP1 = 2;
                            ultiP1 ++;
                            break;

                        case 2:
                            System.out.println("El personaje 1 eligio al asesino");
                            VidaPLayer1 = 215;
                            VelocidadPLayer1 = 122;
                            DefensaPLayer1 = 45;
                            AtaquePLayer1 = 98;
                            HabilidadP1 = 1;
                            ultiP1 ++;

                            break;

                        case 3:

                            System.out.println("El personaje 1 eligio a Manolo el Curandero");
                            VidaPLayer1 = 310;
                            VelocidadPLayer1 = 60;
                            DefensaPLayer1 = 60;
                            AtaquePLayer1 = 70;
                            HabilidadP1 = 2;
                            ultiP1 ++;


                            break;


                    }

                    switch (personaje2) {

                        case 1:
                            System.out.println("El personaje 2 Eligio al sicario");
                            VidaPLayer2 = 282;
                            VelocidadPLayer2 = 73;
                            DefensaPLayer2 = 80;
                            AtaquePLayer2 = 65;
                            HabilidadP2 = 2;
                            ultiP2 ++;

                            break;

                        case 2:
                            System.out.println("El personaje 2  eligio al asesino");
                            VidaPLayer2 = 215;
                            VelocidadPLayer2 = 122;
                            DefensaPLayer2 = 45;
                            AtaquePLayer2 = 98;
                            HabilidadP2 = 1;
                            ultiP2 ++;

                            break;

                        case 3:

                            System.out.println("El personaje 2  eligio a Manolo el Curandero");
                            VidaPLayer2 = 310;
                            VelocidadPLayer2 = 60;
                            DefensaPLayer2 = 60;
                            AtaquePLayer2 = 70;
                            HabilidadP2 = 2;
                            ultiP2 ++;


                            break;


                    }


                    break;
                case 2:
                    break;

                case 3:
                    System.out.println("\n" +
                            "███████╗██╗░██████╗░██╗░░██╗████████╗\n" +
                            "██╔════╝██║██╔════╝░██║░░██║╚══██╔══╝\n" +
                            "█████╗░░██║██║░░██╗░███████║░░░██║░░░\n" +
                            "██╔══╝░░██║██║░░╚██╗██╔══██║░░░██║░░░\n" +
                            "██║░░░░░██║╚██████╔╝██║░░██║░░░██║░░░\n" +
                            "╚═╝░░░░░╚═╝░╚═════╝░╚═╝░░╚═╝░░░╚═╝░░░");

                    do{
                        if(VelocidadPLayer1 > VelocidadPLayer2){
                            System.out.println("comienza el turno de jugador 1");
                            System.out.println("- pulse 1 para atacar");
                            System.out.println("-pulse 2 para usar pocion curativa");
                            System.out.println("pulse 3 para usar ulti(necesitas 3 ataques para poder usarla)");
                            System.out.println("-pulse 4 para usar habilidad");

                             boton = scanner.nextInt();
                            switch (boton){
                                case 1:
                                    System.out.println("jugador 1 ataco");
                                    double randomNumber = 0.5 + (Math.random() * (1.8 - 0.5));
                                    VidaPLayer2 = VidaPLayer2 - (DefensaPLayer2 -AtaquePLayer1 * randomNumber);
                                    if (randomNumber>1.3){
                                        System.out.println("Golpe critico");
                                        System.out.println("el ataque fue de:");
                                        System.out.println("la vida del jugador 2 es de"+VidaPLayer2);
                                    }
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;



                            }
                            System.out.println("turno jugador 2");



                        }else{
                            System.out.println("comienza atacando jugador 2");
                            System.out.println("comienza el turno de jugador 2");
                            System.out.println("- pulse 1 para atacar");
                            System.out.println("-pulse 2 para usar pocion curativa");
                            System.out.println("pulse 3 para usar ulti(necesitas 3 ataques para poder usarla)");
                            System.out.println("-pulse 4 para usar habilidad");

                            boton = scanner.nextInt();
                            switch (boton){
                                case 1:
                                    System.out.println("jugador 2 ataco");
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;



                            }

                        }


                    }while(VidaPLayer1 >= 0 && VidaPLayer2 >= 0);

                    break; //aqui acaba caso 3

                case 4:
                    System.out.println("salio del programa");
                    break;

            }
        } while (opcion != 4);


    }
}

