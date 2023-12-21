import Poke.Attack;
import Poke.Evolve;
import Poke.Pokemon;
public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", 4, "Thunder Shock");
        System.out.println(pikachu);

        Attack attackPokemon = new Attack();
        attackPokemon.attack(pikachu);

        Evolve evolvePokemon = new Evolve();
        evolvePokemon.evolve(pikachu);

    }
}