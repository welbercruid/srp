import Poke.Pokemon;
public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", 4, "Thunder Shock");
        System.out.println(pikachu);
        pikachu.attack();
        pikachu.evolve();
    }
}