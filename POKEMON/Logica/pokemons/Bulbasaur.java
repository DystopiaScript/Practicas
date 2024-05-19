package POKEMON.Logica.pokemons;

import POKEMON.Logica.Pokemon;
import POKEMON.Logica.IPlanta;
public class Bulbasaur extends  Pokemon implements IPlanta{

    @Override
    public void atacarDrenaje() {
      System.out.println("Bulbasaur ataca con Drenaje");  
    }

    @Override
    public void atacarParalizar() {
    System.out.println("Bulbasaur ataca con Paralizar");        

    }

    @Override
    protected void ataquePlacaje() {
    System.out.println("Bulbasaur ataca con Placaje");    
        
    }

    @Override
    protected void ataqueAranizado() {
    System.out.println("Bulbasaur ataca con Arañazo");
        
    }

    @Override
    protected void ataqueMoridisco() {
        
    System.out.println("Bulbasaur ataca con Moridisco");
    }

    @Override
    public void atacarHojaAfilada() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'atacarHojaAfilada'");
    }

    @Override
    public void atacarLatigoCepa() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'atacarLatigoCepa'");
    }

}
