import java.util.ArrayList;

public class ListaHabitaciones {
    private ArrayList<Habitacion> listahabitaciones = new ArrayList<Habitacion>();

    public ArrayList<Habitacion> addHabitacion(Habitacion habitacion){
        listahabitaciones.add(habitacion);
        return listahabitaciones;
    }
    public boolean comprobarHabitacion(Habitacion habitacion){
        if (listahabitaciones.size() > 0){
            return true;
        }else{
            return false;
        }
    }
    public ArrayList<Habitacion> removeHabitacion(Habitacion habitacion){
        listahabitaciones.remove(habitacion);
        return listahabitaciones;
    }
    public boolean listarHabitaciones(){
        // int i = 0;
        // while (i < listahabitaciones.size()) {
        //     System.out.println(listahabitaciones.get(i).getAdicional()); 
        // }
        System.out.println("ventana");
        return true;
    }
    
}
