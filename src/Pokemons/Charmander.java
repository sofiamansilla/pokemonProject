package Pokemons;

import Interface.IFire;
import Logic.Pokemon;

public class Charmander extends Pokemon implements IFire {

    public Charmander() {
    }

    @Override
    public void attackTackle() {
        System.out.println("Hello! I'm Charmander and this is my Tackle Attack");

    }

    @Override
    public void attackScratch() {
        System.out.println("Hello! I'm Charmander and this is my Scrath Attack");

    }

    @Override
    public void attackByte() {
        System.out.println("Hello! I'm Charmander and this is my Byte Attack");

    }

    @Override
    public void attackFireFist() {
        System.out.println("Hello! I'm Charmander and this is my Fire fist Attack");

    }

    @Override
    public void attackFlameThrower() {
        System.out.println("Hello! I'm Charmander and this is my Flame Thrower Attack");

    }

    @Override
    public void attackEmber() {
        System.out.println("Hello! I'm Charmander and this is my Ember Attack");

    }
}
