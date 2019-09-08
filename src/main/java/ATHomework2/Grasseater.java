package ATHomework2;

public abstract class Grasseater extends Animal implements AnimalInfo {

    public Grasseater(String name, int hungry) {
        super(name, hungry);
        grasseater = true;
    }

    @Override
    public boolean eat(Grass grass) {
        hungry += grass.getValue();
        return hungry >= 0;
    }

    @Override
    public boolean eat(Meat meat) throws WrongFoodException {
        throw new WrongFoodException("Попытка накормить травоядное мясом");
    }

    @Override
    public abstract void areYouHungry();
}
