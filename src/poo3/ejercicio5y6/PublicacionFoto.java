package tema4.POO3.ejercicio5y6;

public class PublicacionFoto extends Publicacion implements IPublicacion, IAbrirPublicacion, IPublicacionConReaccion{

    protected PublicacionFoto(String link, String tipo, String canal) {
        super(link, tipo, canal);
    }

    @Override
    public void compartir(String link, String tipo) {
        System.out.println("Foto compartido en "+link+" el tipo del archivo es "+tipo);

    }

    @Override
    public void publicar(String canal, String tipo) {
        System.out.println("Foto publicado en "+canal+" el tipo del archivo es "+tipo);

    }

    @Override
    public void abrir(String link) {
        System.out.println("Foto abierta");
    }

    @Override
    public void comentar(String link, String comentario) {
        System.out.println("Comentario: "+comentario+" ha sido publicado en la foto "+link);
    }
}
