package test2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;

class AppTest {
    
    @Test
    void addUsuario() {
        App classUnderTest = new App();
        ListaUsuarios listaUsuarios = new ListaUsuarios();
        Usuario User1 = new Usuario("Pablo", "Pablopro@gmail.com");
        listaUsuarios.addUsuario(User1);
        assertTrue(listaUsuarios.coprobarUsuario(User1));
    }

    @Test
    void removeUsuario() {
        App classUnderTest = new App();
        ListaUsuarios listaUsuarios = new ListaUsuarios();
        Usuario User1 = new Usuario("Pablo", "Pablopro@gmail.com");
        listaUsuarios.addUsuario(User1);
        listaUsuarios.removeUsuario(User1);
        assertFalse(listaUsuarios.coprobarUsuario(User1));
    }

    @Test
    void addHabitacion() {
        App classUnderTest = new App();
        ListaHabitaciones listaHabitaciones = new ListaHabitaciones();
        Habitacion habitacion1 = new Habitacion(1, "ventana", 200);
        listaHabitaciones.addHabitacion(habitacion1);
        assertTrue(listaHabitaciones.comprobarHabitacion(habitacion1));
    }

    @Test
    void removeHabitacion() {
        App classUnderTest = new App();
        ListaHabitaciones listaHabitaciones = new ListaHabitaciones();
        Habitacion habitacion1 = new Habitacion(1, "ventana", 200);
        listaHabitaciones.addHabitacion(habitacion1);
        listaHabitaciones.removeHabitacion(habitacion1);
        assertFalse(listaHabitaciones.comprobarHabitacion(habitacion1));
    }

    @Test
    void listarHabitaciones() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        App classUnderTest = new App();
        ListaHabitaciones listaHabitaciones = new ListaHabitaciones();
        Habitacion habitacion1 = new Habitacion(1, "ventana", 200);
        listaHabitaciones.addHabitacion(habitacion1);
        listaHabitaciones.listarHabitaciones();

        String comprobarLista = outputStream.toString();
        assertTrue(comprobarLista.contains("ventana"));
    }

//     @Test
//     void fer_reserva(numero_habitacio, usuari) {
//         App classUnderTest = new App();
//         asserTrue(reserva_hecha);
//     }

//     @Test
//     void visualitza_reserves(usuari) {
//         App classUnderTest = new App();
//         asserTrue(reserva_hecha);
//     }
}
