package test2;

import java.util.ArrayList;

public class ListaHabitaciones {
    private ArrayList<Habitacion> listaHab;

    public ListaHabitaciones() {
        listaHab = new ArrayList<>();
    }

    public void addHabitacion(Habitacion habitacion) {
        listaHab.add(habitacion);
        return;
    }

    public void removeHabitacion(Habitacion habitacion) {
        listaHab.remove(habitacion);
        return;
    }

    public boolean comprobarHabitacion(Habitacion habitacion) {
        for (Habitacion habitaciondeLista : listaHab) {
            if (habitaciondeLista.getNumero() == (habitacion.getNumero())) {
                return true;
            }
        }
        return false;
    }
    
}
