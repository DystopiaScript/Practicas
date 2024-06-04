package Reporte.EXTRA;

import Reporte.EXTRA.Herencia.Aereo;
import Reporte.EXTRA.Herencia.Espacial;
import Reporte.EXTRA.Herencia.Maritimo;
import Reporte.EXTRA.Herencia.Terrestre;

public class Main {
public static void main (String [] arg){
    Vehiculo vehiculo = new Espacial();
    Vehiculo vehiculo2 = new Aereo();
    Vehiculo vehiculo3 = new Terrestre();
    Vehiculo vehiculo4 = new Maritimo();
    vehiculo.conduccion();
    vehiculo.cargarCombustible();
    vehiculo2.conduccion();
    vehiculo2.cargarCombustible();
    vehiculo3.conduccion();
    vehiculo3.cargarCombustible();
    vehiculo4.conduccion();
    vehiculo4.cargarCombustible();
}


}
