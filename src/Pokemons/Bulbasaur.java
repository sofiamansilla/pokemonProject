package Pokemons;

import Interface.IPlant;
import Logic.Pokemon;

public class Bulbasaur extends Pokemon implements IPlant {

    public Bulbasaur() {
    }

    @Override
    public void attackTackle() {
        System.out.println("Hello! I'm Bulbasaur and this is my Tackle Attack");

    }

    @Override
    public void attackScratch() {
        System.out.println("Hello! I'm Bulbasaur and this is my Scratch Attack");

    }

    @Override
    public void attackByte() {
        System.out.println("Hello! I'm Bulbasaur and this is my Byte Attack");

    }

    @Override
    public void attackDrainage() {
        System.out.println("Hello! I'm Bulbasaur and this is my Drainage Attack");

    }

    @Override
    public void attackParalyze() {
        System.out.println("Hello! I'm Bulbasaur and this is my Paralyze Attack");

    }
}
