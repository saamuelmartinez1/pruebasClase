package tema4;

import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int breakWhile = 0;
        int numPersonas = 0;
        Persona[] ArrayDePersonas = new Persona[10];
        while (breakWhile == 0){
            menu();
            System.out.println("Elije una opcion:");
            int opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    if (numPersonas < 10) {
                        System.out.println("Escribe el dni:");
                        String dni = in.next();
                        ArrayDePersonas[numPersonas] = new Persona(dni);
                        numPersonas++;
                    }else {
                        System.out.println("ERROR, ya hay 10 personas añadidas.");
                    }
                    break;
                case 2:
                    System.out.println("Escribe el numero de cuenta que quieres crear:");
                    String numCuenta = in.next();
                    System.out.println("Escribe el saldo que quieres en la cuenta:");
                    int saldo = in.nextInt();
                    Cuenta NuevaCuenta = new Cuenta(numCuenta, saldo);
                    System.out.println("Escribe el dni al que quieres añadir una cuenta:");
                    String dni = in.next();
                    for (int i = 0; i < numPersonas; i++){
                        if (ArrayDePersonas[i].getDni().equals(dni)){
                            ArrayDePersonas[i].addCuenta(NuevaCuenta);
                            System.out.println("Cuenta asociada.");
                        }else {
                            System.out.println("La persona no se ha encontrado.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Escribe el DNI");
                    String DNI = in.next();
                    for (int i = 0; i < numPersonas; i++){
                        if (ArrayDePersonas[i].getDni().equals(DNI)){
                            System.out.println(ArrayDePersonas[i]);
                            System.out.println("Escribe que cuenta quieres ver");
                            String cuentaQueVer = in.next();
                            Cuenta[] cuentasDeLaPersona = ArrayDePersonas[i].getCuentas();
                            for (int j = 0; j < ArrayDePersonas[i].getNumCuentas(); j++){
                                if (cuentasDeLaPersona[j].getNumCuenta().equals(cuentaQueVer)){
                                    System.out.println("El numero de cuenta "+cuentasDeLaPersona[j].getNumCuenta()+" tiene de saldo "+ cuentasDeLaPersona[j].getSaldo()+"€");
                                }else {
                                    System.out.println("No se ha encontrado la cuenta");
                                }
                            }
                            break;
                        }else {
                            System.out.println("La persona no se ha encontrado.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Escribe el dni");
                    String dni2 = in.next();
                    System.out.println("Escribe el numero de la cuenta");
                    String numeroCuenta = in.next();
                    for (int i = 0; i < numPersonas; i++) {
                        if (ArrayDePersonas[i].getDni().equals(dni2)){
                            Cuenta[] cuentasDeLaPersona  = ArrayDePersonas[i].getCuentas();
                            for (int j = 0; j < ArrayDePersonas[i].getNumCuentas(); j++){
                                if (cuentasDeLaPersona[j].getNumCuenta().equals(numeroCuenta)){
                                    System.out.println("Escribe la nomina del mes que hay que abonar:");
                                    int cantidad = in.nextInt();
                                    cuentasDeLaPersona[j].abono(cantidad);
                                }
                            }

                        }

                    }
                    break;
                case 5:
                    System.out.println("Escribe el dni:");
                    String dni5 = in.next();
                    System.out.println("Escribe el numero de cuenta:");
                    String NumeroCuenta = in.next();
                    for (int i = 0; i < numPersonas; i++){
                        if (ArrayDePersonas[i].getDni().equals(dni5)){
                            Cuenta[] cuentasDeLaPersona = ArrayDePersonas[i].getCuentas();
                            for (int j = 0; j < ArrayDePersonas[i].getNumCuentas(); j++){
                                if (cuentasDeLaPersona[j].getNumCuenta().equals(NumeroCuenta)){
                                    System.out.println("Escribe la cantidad que quieres pagar:");
                                    int cantidad = in.nextInt();
                                    cuentasDeLaPersona[j].recibo(cantidad);
                                }
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Escribe el numero de la cuenta remitente");
                    String cuentaRemitente = in.next();
                    System.out.println("Escribe el DNI de la cuenta remitente");
                    String dniRemitente = in.next();
                    System.out.println("Escribe el numero de la cuenta destinatario");
                    String cuentaDestinatario = in.next();
                    System.out.println("Escribe el DNI de la cuenta destinatario");
                    String dniDestinatario = in.next();
                    System.out.println("Escribe la cantidad que quieres tranferir");
                    int CantidadAtransferir = in.nextInt();
                    for (int i = 0; i < numPersonas; i++){
                        if (ArrayDePersonas[i].getDni().equals(dniRemitente)){
                            Cuenta[] cuentasDelRemitente = ArrayDePersonas[i].getCuentas();
                            for (int j = 0; j < ArrayDePersonas[i].getNumCuentas(); j++){
                                if (cuentasDelRemitente[j].getNumCuenta().equals(cuentaRemitente)){
                                    cuentasDelRemitente[j].recibo(CantidadAtransferir);
                                    for (int k = 0; k < numPersonas; k++){
                                        if (ArrayDePersonas[k].getDni().equals(dniDestinatario)){
                                            Cuenta[] cuentasDelDestinatario = ArrayDePersonas[k].getCuentas();
                                            for (int m = 0; m < ArrayDePersonas[k].getNumCuentas(); m++){
                                                if (cuentasDelDestinatario[m].getNumCuenta().equals(cuentaDestinatario)){
                                                    cuentasDelDestinatario[m].abono(CantidadAtransferir);
                                                    System.out.println("Transferenfia realizada con exito");
                                                }else {
                                                    System.out.println("Error, no se ha podido efectuar la operacion.");
                                                    cuentasDelRemitente[j].abono(CantidadAtransferir);
                                                }
                                            }
                                        }
                                    }
                                }else {
                                    System.out.println("Error, no se ha podido efectuar la operacion.");
                                }
                            }
                        }
                    }
                    break;
                case 7:
                    for (int i = 0; i < numPersonas; i++){
                        ArrayDePersonas[i].morosa();
                    }
                    break;
                case 8:
                    breakWhile -= 1;
                default:
                    breakWhile -= 1;
            }
        }
    }
    public static void menu(){
        System.out.println("""
                1. Instanciar objetos de tipo Persona
                2. Instanciar objetos de tipo Cuenta y asociarlo a una persona.
                3. Mostrar datos de una persona (por su dni).
                4. Recibir la nómina mensual de una persona (por dni y núm de cuenta).
                5. Recibir un pago (por dni y núm de cuenta).
                6. Realizar transferencia entre cuentas.
                7. Imprimir las personas morosas.
                8. Salir""");
    }
}

