package Reporte.EXTRA;

public abstract class Vehiculo {
    String nombre;
    int pasajeros;
    float pesoSoportado;
    float velocidadMaxima;

    public abstract void conduccion();
    public abstract void cargarCombustible();
}
