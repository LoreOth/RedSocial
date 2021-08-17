import java.util.ArrayList;

public  class Usuario implements  Instagramer, IEspectador{
    private String nombre;
    private String mensaje;
    ArrayList<IEspectador> seguidores = new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void recibirMensaje(String nombreIG, String mensaje) {
        System.out.println("Soy " + this.nombre + ", recibí el siguiente mensaje, " + mensaje + " del usuario , "+ nombreIG);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        for ( IEspectador e : seguidores){
            e.recibirMensaje(this.nombre, mensaje);
        }
    }


    @Override
    public void agregarSeguidor(IEspectador e) {
        seguidores.add(e);

    }

    @Override
    public void eliminarSeguidor(IEspectador e) {
        seguidores.remove(e);

    }
}
