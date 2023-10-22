package Logic;

public abstract class Pokemon {

    protected int numPokedex;
    protected String name;
    protected double weight;
    protected String gender;
    protected int season;

    protected abstract void attackTackle();
    protected abstract void attackScratch();
    protected abstract void attackByte();


}
