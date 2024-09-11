package Pokemon;

// Pikachu subclass
class Pikachu extends Pokemon {
    public Pikachu(String name) {
        super(name, "electric");  // Calling parent constructor with type "electric"
    }

    @Override
    public void attack() {
        System.out.println("Pikachu attacks!");
    }
}
