package Poke;

public class Attack {
    public void attack(Pokemon pokemon) {
        System.out.println(pokemon.getName() + " ataca con un " + pokemon.getAbility() + "!");
    }
}