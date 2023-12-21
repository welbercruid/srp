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

    public String getName() {
        return name;
    }
    public String getAbility() {
        return ability;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

//    public String getType() {
//        return type;
//    }

//    public void setType(String type) {
//        this.type = type;
//    }

//    public int getLevel() {
//        return level;
//    }

//    public void setLevel(int level) {
//        this.level = level;
//    }

    @Override
    public String toString() {
        return "Pokemon {" +
                "\nnombre= " + name + ", \ntipo= " + type + ", \nnivel= " + level + ", \nhabilidad= " + ability + "\n}";
    }
}
