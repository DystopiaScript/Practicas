package Reporte.EXTRA.Herencia;

import Reporte.EXTRA.Vehiculo;

public class Terrestre extends Vehiculo{

    @Override
    public void conduccion() {
        System.out.println("Conducción terrestre");
    }

    @Override
    public void cargarCombustible() {
        System.out.println("Cargando combustible terrestre");
    }
    
}
