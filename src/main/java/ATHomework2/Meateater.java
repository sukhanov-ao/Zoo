package ATHomework2;

public abstract class Meateater extends Animal {
    public Meateater(String name, int hungry) {
        super(name, hungry);
        meateater = true;
    }

    public void eat (Grass grass) {
        System.out.println("Я не ем траву!");
    }
    public void eat (Meat meat) {
        hungry += meat.value;
        meat.value = 0;
        System.out.print("Я съел мясо");
    }

    @Override
    public abstract void areYouHungry();
}