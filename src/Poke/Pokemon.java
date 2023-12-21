package Poke;

public class Pokemon {
    private String name;
    private String type;
    private int level;
    private String ability;

    public Pokemon(String name, String type, int level, String ability) {
        this.name = name;
        this.type = type;
        this.level = level;
        this.ability = ability;
    }
    public void attack() {
        System.out.println(name + " ataca con un " + ability + "!");
    }
    public void evolve() {
        System.out.println("Falta expe para evolucionar. A seguir bicheando " + name + "!");
    }

    @Override
    public String toString() {
        return "Pokemon {" +
                "\nnombre= " + name + ", \ntipo= " + type + ", \nnivel= " + level + ", \nhabilidad= " + ability + "\n}";
    }
}
