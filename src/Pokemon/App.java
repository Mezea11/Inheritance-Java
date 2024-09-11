package Pokemon;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) throws Exception {
       
        Pikachu p1 = new Pikachu("David");
        Pikachu p2 = new Pikachu("Laura");

        Bulbasaur b1 = new Bulbasaur("Susan");
        Bulbasaur b2 = new Bulbasaur("Tom");

/*         Pokemon currentPokemon = p1;
 */
        //Polymorphism
        ArrayList<Pokemon> pokedex = new ArrayList<>();


        pokedex.add(p1);
        pokedex.add(p2);
        pokedex.add(b1);
        pokedex.add(b2);

        b2.talk();

        b2.attack();

        p1.attack();

        for (Pokemon pokemon : pokedex) {
            System.out.println(pokemon.getName() + " is a " + pokemon.getType());
        }
    }
}
