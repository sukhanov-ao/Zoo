package ATHomework2;

public abstract class Animal implements AnimalInfo {
   protected int hungry;
    public String name;
    public boolean meateater;
    public boolean grasseater;

    public Animal(String name, int hungry) {
        this.name = name;
        this.hungry = this.hungry;
    }

    public abstract boolean eat(Meat meat) throws WrongFoodException;
    public abstract boolean eat (Grass grass) throws WrongFoodException;
    public abstract void areYouHungry();

}