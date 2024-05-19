package POKEMON.Logica.pokemons;

import POKEMON.Logica.tipos.IElectrico;
import POKEMON.Logica.Pokemon;

public class Pikachu extends Pokemon implements IElectrico{

    @Override
    public void atacarImpactrueno() {
    System.out.println("Pikachu ataca con Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
    System.out.println("Pikachu ataca con Puño Trueno");
    }

    @Override
    protected void ataquePlacaje() {
    System.out.println("Pikachu ataca con Placaje");  
    }

    @Override
    protected void ataqueAranizado() {
        System.out.println("Pikachu ataca con Arañazo");
    
    }

    @Override
    protected void ataqueMoridisco() {
        System.out.println("Pikachu ataca con Moridisco");
       
    }
    public Pikachu(){
    }

    @Override
    public void atacarRayo() {
    System.out.println("Pikachu ataca con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
    System.out.println("Pikachu ataca con RayoCarga");    }
    
}
