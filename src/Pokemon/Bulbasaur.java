package Pokemon;

class Bulbasaur extends Pokemon {
    public Bulbasaur(String name) {
        super(name, "grass");  // Calling parent constructor with type "grass"
    }

    public void talk() {
        System.out.println("Bulbasaur says: I'm a grass-type Pokémon!");
    }

    @Override
    public void attack(){
        System.out.println("Bulbasaur attacks!");
    }
}