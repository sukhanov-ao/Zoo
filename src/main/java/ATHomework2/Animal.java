package ATHomework2;

public abstract class Animal {
    protected int hungry;
    public String name;
    public boolean meateater;
    public boolean grasseater;

    public Animal(String name, int hungry) {
        this.name = name;
        this.hungry = hungry;
    }

//    public abstract boolean eat (Food food);
    public abstract boolean eat(Meat meat);
    public abstract boolean eat (Grass grass);
    public abstract void areYouHungry();
}