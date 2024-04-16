
import java.util.HashMap;

public class Usuario {
    private String nombre;
    private String email;
    HashMap<Habitacion, Usuario> listaReserva = new HashMap<Habitacion, Usuario>();
    public Usuario(String nombre, String email){
        this.nombre = nombre;
        this.email = email;
    }
    public HashMap<Habitacion, Usuario> HacerReserva(Habitacion habitacion, Usuario usuario){
        listaReserva.put(habitacion, usuario);
        return listaReserva; 
    }
}
