package tema4;

import java.util.Scanner;

public class Reloj {
    private int minutos;
    private int horas;
    private int segundos;

            public Reloj(int minutos, int horas, int segundos) {
        setMinutos(minutos);
        setHoras(horas);
        setSegundos(segundos);
    }

    public Reloj() {
        this.minutos = 0;
        this.horas = 0;
        this.segundos = 0;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if (minutos < 60 && minutos >= 0) {
            this.minutos = minutos;
        } else {
            System.out.println("Minutos erróneos");
        }
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if (horas < 24 && horas >= 0) {
            this.horas = horas;
        } else {
            System.out.println("Horas erróneas");
        }
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos < 60 && segundos >= 0) {
            this.segundos = segundos;
        } else {
            System.out.println("Segundos erróneos");
        }
    }

    public void amOrPm() {
        Scanner in = new Scanner(System.in);
        System.out.println("Elige el modo en el que se mostrará la hora (AM o PM):");
        String modo = in.next();
        if (modo.equalsIgnoreCase("AM") || modo.equalsIgnoreCase("PM")) {
            if (modo.equalsIgnoreCase("PM") && horas > 12) {
                horas -= 12;
            } else if (modo.equalsIgnoreCase("AM") && horas == 0) {
                horas = 12;
            }
        } else {
            System.out.println("Modo no válido. Se mantiene en formato 24 horas.");
        }
    }

    public void showTime() {
        System.out.println("Son las: " + getHoras() + ":" + getMinutos() + ":" + getSegundos());
    }

    @Override
    public String toString() {
        return "Reloj{" +
                "horas=" + horas +
                ", minutos=" + minutos +
                ", segundos=" + segundos +
                '}';
    }
}
