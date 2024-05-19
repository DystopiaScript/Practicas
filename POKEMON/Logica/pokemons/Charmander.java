package POKEMON.Logica.pokemons;

import POKEMON.Logica.tipos.IFuego;
import POKEMON.Logica.Pokemon;

public class Charmander extends Pokemon implements IFuego{
public Charmander() {

}
    @Override
    public void atacarPunioFuego() {
    System.out.println("Charmander ataca con Puño Fuego");
    }

    @Override
    public void atacarLanzallamas() {  
    System.out.println("Charmander ataca con Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
    System.out.println("Charmander ataca con Ascuas"); 
    }

    @Override
    protected void ataquePlacaje() {
    System.out.println("Charmander ataca con Placaje");
    }

    @Override
    protected void ataqueAranizado() {
    System.out.println("Charmander ataca con Arañazo");
       }   

    @Override
    protected void ataqueMoridisco() {        
    System.out.println("Charmander ataca con Moridisco");
    }

    
}
