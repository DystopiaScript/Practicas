package Reporte.EXTRA.Herencia;

import Reporte.EXTRA.Vehiculo;

public class Maritimo extends Vehiculo{

    @Override
    public void conduccion() {
       System.out.println("Conducción marítima");
    }

    @Override
    public void cargarCombustible() {
      System.out.println("Cargando combustible marítimo");
    }
    
}