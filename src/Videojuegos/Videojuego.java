package tema4.Videojuegos;

import java.io.Serializable;

public abstract class Videojuego implements Serializable {
    private String titulo;
    private String plataforma;
    private int nota;

    public Videojuego(String titulo, String plataforma, int nota) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.nota = nota;
    }



    public int getNota() {
        return nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }



    public abstract String getTipo();

    public static Videojuego fromString(String texto) {
        try {
            // Dividir por coma y espacio
            String[] partes = texto.split(", ");

            // Sacar tipo de videojuego
            String tipo = partes[0].split(": ")[1];

            // Extraer datos comunes
            String titulo = partes[1].split(": ")[1];
            String plataforma = partes[2].split(": ")[1];
            int nota = Integer.parseInt(partes[3].split(": ")[1]);

            if (tipo.equals("FISICO")) {
                String tienda = partes[4].split(": ")[1];
                String estadoStr = partes[5].split(": ")[1];
                VideojuegoFisico.Estado estado = VideojuegoFisico.Estado.valueOf(estadoStr);
                return new VideojuegoFisico(titulo, plataforma, nota, tienda, estado);
            } else if (tipo.equals("DIGITAL")) {
                String tiendaOnline = partes[4].split(": ")[1];
                double tamanio = Double.parseDouble(partes[5].split(": ")[1]);
                return new VideojuegoDigital(titulo, plataforma, nota, tiendaOnline, tamanio);
            } else {
                System.out.println("Tipo de videojuego desconocido.");
                return null;
            }

        } catch (Exception e) {
            System.out.println("Error al parsear videojuego: " + e.getMessage());
            return null;
        }
    }



    }






