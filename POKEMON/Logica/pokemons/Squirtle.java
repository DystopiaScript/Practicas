package POKEMON.Logica.pokemons;
import POKEMON.Logica.IAgua;
import POKEMON.Logica.Pokemon;
public class Squirtle extends Pokemon implements IAgua{

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squirtle ataca con Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squirtle ataca con Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squirtle ataca con Pistola de Agua");
            }

    @Override
    protected void ataquePlacaje() {
        System.out.println("Squirtle ataca con Placaje");
    }

    @Override
    protected void ataqueAranizado() {
       System.out.println("Squirtle ataca con Arañazo");     
    }

    @Override
    protected void ataqueMoridisco() {
        System.out.println("Squirtle ataca con Moridisco");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Squirtle ataca con Hidropulso");
    }


}
