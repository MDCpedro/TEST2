public class Habitacion {
    private int personas;
    private String adicional;
    private int precio;
    public Habitacion(int person, String adc, int prc){
        this.adicional = adc;
        this.personas = person;
        this.precio = prc;
    }
    public boolean estaReservada(Habitacion habitacion, Usuario usuario){
        if (usuario.HacerReserva(habitacion, usuario).get(habitacion) == usuario) {
            return true;
        }else{
            return false;
        }
    }
    public String getAdicional() {
        return adicional;
    }
}
