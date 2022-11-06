/*
 * The abstract superclass Monster defines the expected common behaviors via abstract methods
 */

abstract public class Monster {
    // Private instance variable
    private String name;

    // Constructs a Monster instance with the given name
    public Monster(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    // Defines common behavior for all its subclasses
    abstract public String attack(); 
}
