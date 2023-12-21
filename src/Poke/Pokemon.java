package Poke;

public class Pokemon {
    private String name;
    private String type;
    private int level;

    public Pokemon(String name, String type, int level) {
        this.name = name;
        this.type = type;
        this.level = level;
    }
    public void attack() {
        System.out.println(name + " ataca con un Thunder Shock!");
    }
    public void evolve() {
        System.out.println("Falta expe para evolucionar " + name + ". A seguir bicheando!");
    }

    @Override
    public String toString() {
        return "Pokemon {" +
                "\nnombre= " + name + ", \ntipo= " + type + ", \nnivel= " + level + "\n}";
    }
}
