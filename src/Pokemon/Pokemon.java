package Pokemon;

class Pokemon {
    // Private fields
    private String name;
    private String type; // earth, wind, water, electric, fire

    // Constructor
    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for type
    public void setType(String type) {
        this.type = type;
    }

    public void attack(){};

}