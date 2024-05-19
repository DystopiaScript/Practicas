package POKEMON.Logica;

public class Charmander extends Pokemon implements IFuego{

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
