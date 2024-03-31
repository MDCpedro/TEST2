package test2;

public class Habitacion {
    private int numero;
    private String tipo;
    private int precio;

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
}

