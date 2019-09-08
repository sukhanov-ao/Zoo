package ATHomework2;

public abstract class Meateater extends Animal implements AnimalInfo {
    public Meateater(String name, int hungry) {
        super(name, hungry);
        meateater = true;
    }

    @Override
    public boolean eat(Meat meat) {
        hungry += meat.getValue();
        return hungry >= 0;
    }

    @Override
    public boolean eat(Grass grass) throws WrongFoodException {
        throw new WrongFoodException("Попытка накормить хищника травой");
    }

    @Override
    public abstract void areYouHungry();
}