package POKEMON.Logica.pokemons;

import POKEMON.Logica.Pokemon;
import POKEMON.Logica.tipos.IPlanta;
public class Bulbasaur extends  Pokemon implements IPlanta{
  public Bulbasaur(){
  }

    @Override
    public void atacarDrenaje() {
      System.out.println("Bulbasaur ataca con Drenaje");  
    }

    @Override
    public void atacarParalizar() {
    System.out.println("Bulbasaur ataca con Paralizar");        

    }

    @Override
    public void ataquePlacaje() {
    System.out.println("Bulbasaur ataca con Placaje");    
        
    }

    @Override
    public void ataqueAranizado() {
    System.out.println("Bulbasaur ataca con Arañazo");
        
    }

    @Override
    public void ataqueMoridisco() {
        
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
