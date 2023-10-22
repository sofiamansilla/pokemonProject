package Pokemons;

import Interface.IWater;
import Logic.Pokemon;

public class Squirtle extends Pokemon implements IWater {
    @Override
    protected void attackTackle() {
        System.out.println("Hello! I'm Squirtle and this is my Tackle Attack");

    }

    public Squirtle() {
    }

    @Override
    protected void attackScratch() {



        System.out.println("Hello! I'm Squirtle and this is my Scratch Attack");

    }

    @Override
    protected void attackByte() {
        System.out.println("Hello! I'm Squirtle and this is my Byte Attack");

    }

    @Override
    public void attackHydroBomb() {
        System.out.println("Hello! I'm Squirtle and this is my HydroBomb Attack");

    }

    @Override
    public void attackBubbles() {
        System.out.println("Hello! I'm Squirtle and this is my Bubble Attack");

    }

    @Override
    public void attackWaterGun() {
        System.out.println("Hello! I'm Squirtle and this is my Water Gun Attack");

    }
}
