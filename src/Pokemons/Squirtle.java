package Pokemons;

import Interface.IWater;
import Logic.Pokemon;

public class Squirtle extends Pokemon implements IWater {


    public Squirtle() {
    }

    @Override
    public void attackTackle() {
        System.out.println("Hello! I'm Squirtle and this is my Tackle Attack");

    }


    @Override
    public void attackScratch() {



        System.out.println("Hello! I'm Squirtle and this is my Scratch Attack");

    }

    @Override
    public void attackByte() {
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
