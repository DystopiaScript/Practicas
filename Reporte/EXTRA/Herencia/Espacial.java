package Reporte.EXTRA.Herencia;

import Reporte.EXTRA.Vehiculo;

public class Espacial extends Vehiculo{

    @Override
    public void conduccion() {
       System.out.println("Conducción espacial");
    }

    @Override
    public void cargarCombustible() {
System.out.println("Cargando combustible espacial");
    }
    
}
