package Logic;

import Pokemons.Bulbasaur;
import Pokemons.Charmander;
import Pokemons.Pikachu;
import Pokemons.Squirtle;

public class Main {

    public static void main(String[] args) {

        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        squirtle.attackScratch();
        squirtle.attackHydroBomb();
        charmander.attackScratch();
        charmander.attackFlameThrower();
        bulbasaur.attackScratch();
        bulbasaur.attackDrainage();
        pikachu.attackScratch();
        pikachu.attackThunderImpact();


    }
}
