package Pokemons;

import Interface.IElectric;
import Logic.Pokemon;

public class Pikachu extends Pokemon implements IElectric {
    @Override
    protected void attackTackle() {
        System.out.println("Hello! I'm Pikachu and this is my Tackle Attack");

    }

    @Override
    protected void attackScratch() {
        System.out.println("Hello! I'm Pikachu and this is my Scratch Attack");

    }

    @Override
    protected void attackByte() {
        System.out.println("Hello! I'm Pikachu and this is my Byte Attack");

    }

    @Override
    public void attackThunderImpact() {
        System.out.println("Hello! I'm Pikachu and this is my Impact Thunder Attack");

    }

    @Override
    public void attackThunderFist() {
        System.out.println("Hello! I'm Pikachu and this is my Thunder Fist Attack");

    }
}
