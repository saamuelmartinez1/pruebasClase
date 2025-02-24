package tema4.POO3.ejercicio5y6;

public class PublicacionTexto extends Publicacion implements IPublicacion, IPublicacionConReaccion{


    protected PublicacionTexto(String link, String tipo, String canal) {
        super(link, tipo, canal);
    }

    @Override
    public void compartir(String link, String tipo) {
        System.out.println("Texto compartido en "+link+" el tipo del archivo es "+tipo);
    }

    @Override
    public void publicar(String canal, String tipo) {
        System.out.println("Texto publicado en "+canal+" el tipo del archivo es "+tipo);
    }

    @Override
    public void comentar(String link, String comentario) {
        System.out.println("Comentario: "+comentario+" ha sido publicado en el texto "+link);
    }
}
