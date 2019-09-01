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

    public Animal(boolean animalType) {
        this.meateater = animalType;
    }

    public boolean eat(Food food)  {
        hungry += food.value;
        food.value = 0;
        return hungry >= 0;
    }
    public abstract void areYouHungry();
}