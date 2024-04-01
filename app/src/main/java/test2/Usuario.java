package test2;

import java.util.ArrayList;

public class Usuario {
    private String nom_usuari; 
    private String correu_electronic;
    private ArrayList<Habitacion> listaReservas;

    public Usuario(String nom_usuari, String correu_electronic) {
        this.nom_usuari = nom_usuari;
        this.correu_electronic = correu_electronic;

    }
    public void setCorreu_electronic(String correu_electronic) {
        this.correu_electronic = correu_electronic;
    }
    public String getCorreu_electronic() {
        return correu_electronic;
    }

    public String getNom_usuari() {
        return nom_usuari;
    }
    public void setNom_usuari(String nom_usuari) {
        this.nom_usuari = nom_usuari;
    }

    public void HacerReserva(Habitacion habitacion, Usuario usuario) {
        if (habitacion.estaReservada()) {
            return;
        }
        habitacion.setReserva(true);
        listaReservas.add(habitacion);
        return;
    }
    
}
