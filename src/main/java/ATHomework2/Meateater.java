package ATHomework2;

public abstract class Meateater extends Animal {
    public Meateater(String name, int hungry) {
        super(name, hungry);
        meateater = true;
    }

    @Override
    public boolean eat(Meat meat) {
        hungry += meat.value;
        return hungry >= 0;
    }

    @Override
    public boolean eat(Grass grass) {
        System.out.println("Я не буду есть траву!");
        return hungry < 0;
    }

    @Override
    public abstract void areYouHungry();
}