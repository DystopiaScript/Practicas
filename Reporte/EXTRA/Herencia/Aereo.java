package Reporte.EXTRA.Herencia;

import Reporte.EXTRA.Vehiculo;

public class Aereo extends Vehiculo{

    @Override
    public void conduccion() {
        System.out.println("Conducción aérea");
    }

    @Override
    public void cargarCombustible() {
        System.out.println("Cargando combustible aéreo");
    }
    

}
