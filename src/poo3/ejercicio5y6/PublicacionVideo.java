package tema4.POO3.ejercicio5y6;

public class PublicacionVideo extends Publicacion implements IPublicacion, IAbrirPublicacion, IPublicacionConReaccion{


    protected PublicacionVideo(String link, String tipo, String canal) {
        super(link, tipo, canal);
    }

    @Override
    public void compartir(String link, String tipo) {
        System.out.println("Video compartido en "+link+" el tipo del archivo es "+tipo);

    }

    @Override
    public void publicar(String canal, String tipo) {
        System.out.println("Video publicado en "+canal+" el tipo del archivo es "+tipo);
    }

    @Override
    public void abrir(String link) {
        System.out.println("Video abierto");
    }

    @Override
    public void comentar(String link, String comentario) {
        System.out.println("Comentario: "+comentario+" ha sido publicado en el video "+link);

    }
}
