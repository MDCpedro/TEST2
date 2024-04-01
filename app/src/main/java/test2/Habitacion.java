package test2;

public class Habitacion {
    private int numero;
    private String tipo;
    private int precio;
    private boolean reservada;

    public Habitacion(int numero, String tipo, int precio) {
        this.tipo = tipo;
        this.numero = numero;
        this.precio = precio;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getPrecio() {
        return precio;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public boolean estaReservada() {
        return reservada;
    }
    public void setReserva(boolean reservada) {
        this.reservada = reservada;
    }
}

