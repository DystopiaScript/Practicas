package POKEMON.Logica;

import java.util.Scanner;

import POKEMON.Logica.pokemons.Bulbasaur;
import POKEMON.Logica.pokemons.Charmander;
import POKEMON.Logica.pokemons.Pikachu;
import POKEMON.Logica.pokemons.Squirtle;

public class Main {

    static Squirtle squirtle = new Squirtle();
    static Pikachu pikachu = new Pikachu();
    static Charmander charmander = new Charmander();
    static Bulbasaur bulbasaur = new Bulbasaur();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
    System.out.println("-----------Menú------------");
    System.out.println("1. Squirtle");
    System.out.println("2. Pikachu");
    System.out.println("3. Charmander");
    System.out.println("4. Bulbasaur");     
    opt = sc.nextInt();
switch (opt) {
    case 1:
        System.out.println("Squirtle");
        System.out.println("1. Placaje");
        System.out.println("2. Burbuja");
        System.out.println("3. Pistola de Agua");
        System.out.println("4. Hidrobomba");
        System.out.println("5. Hidropulso");
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                squirtle.ataquePlacaje();
                break;
            case 2:
                squirtle.atacarBurbuja();
                break;
            case 3:
                squirtle.atacarPistolaAgua();
                break;
            case 4:
                squirtle.atacarHidrobomba();
                break;
            case 5:
                squirtle.atacarHidropulso();
                break;
            default:
            System.out.println("Opción no válida");
                break;
        }
        break;
        case 2:
        System.out.println("Pikachu");
        System.out.println("1. Placaje");
        System.out.println("2. Impactrueno");
        System.out.println("3. Puño Trueno");
        System.out.println("4. Rayo");
        System.out.println("5. Rayo Carga");
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                pikachu.ataquePlacaje();
                break;
            case 2:
                pikachu.atacarImpactrueno();
                break;
            case 3:
                pikachu.atacarPunioTrueno();
                break;
            case 4:
                pikachu.atacarRayo();
                break;
            case 5:
                pikachu.atacarRayoCarga();
                break;
            default:
            System.out.println("Opción no válida");
                break;
        }
        break;
        case 3:
        System.out.println("Charmander");
        System.out.println("1. Placaje");
        System.out.println("2. Puño Fuego");
        System.out.println("3. Lanzallamas");
        System.out.println("4. Ascuas");
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                charmander.ataquePlacaje();
                break;
            case 2:
                charmander.atacarPunioFuego();
                break;
            case 3:
                charmander.atacarLanzallamas();
                break;
            case 4:
                charmander.atacarAscuas();
                break;
            default:
            System.out.println("Opción no válida");
                break;
        }
        break;
        case 4:
        System.out.println("Bulbasaur");
        System.out.println("1. Placaje");
        System.out.println("2. Látigo Cepa");
        System.out.println("3. Hoja Afilada");
        System.out.println("4. Rayo Solar");
        System.out.println("5. Drenadoras");
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                bulbasaur.ataquePlacaje();
                break;
            case 2:
                bulbasaur.atacarLatigoCepa();
                break;
            case 3:
                bulbasaur.atacarHojaAfilada();
                break;
           
            case 4:
                bulbasaur.atacarDrenaje();
                break;
            default:
            System.out.println("Opción no válida");
                break;
        }
        break;
        
    default:
    System.out.println("Opción no válida");
        break;
}      
sc.close();  
    }    
    
}
