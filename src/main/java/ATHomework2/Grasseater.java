package ATHomework2;

public abstract class Grasseater extends Animal{
    public Grasseater(String name, int hungry) {
        super(name, hungry);
        grasseater = true;
    }

    @Override
    public boolean eat(Grass grass) {
        hungry += grass.value;
        return hungry >= 0;
    }

    @Override
    public boolean eat(Meat meat) {
        System.out.println("Я не буду есть мясо!");
        return hungry < 0;
    }

    @Override
    public abstract void areYouHungry();


}
