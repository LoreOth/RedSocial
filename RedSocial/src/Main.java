/*
Este modelo de estructura contempla usuarios que podrian ser tanto instagramers como espectadores
 */


public class Main {
    public static void main(String[] args) {
        Usuario a = new Usuario("Lore");
        Usuario b = new Usuario("Leo");
        Usuario c = new Usuario("Bren");
        Usuario d = new Usuario("Pato");
        Usuario e = new Usuario("Andre");

        a.agregarSeguidor(b);
        a.agregarSeguidor(c);
        a.agregarSeguidor(d);
        a.agregarSeguidor(e);

        a.enviarMensaje("¡ Hola, seguidores ! ");

        a.eliminarSeguidor(d);
        System.out.println("_______________________________\n");


        a.enviarMensaje(" Saludos seguidores! ");


    }
}
