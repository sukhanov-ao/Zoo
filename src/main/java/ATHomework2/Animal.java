package ATHomework2;

import java.awt.*;

public abstract class Animal {
    protected int hungry;
    public final String name;
    public boolean meateater;
    public boolean grasseater;

    public Animal( String name, int hungry) {
        this.hungry = hungry;
        this.name = name;
    }

    public abstract void areYouHungry();

//    public abstract boolean eat();
    public boolean eat(Meat meat) {
            hungry += meat.value;
            meat.value = 0;
            return hungry >= 0;
    }

    public void animalType() {
        if (meateater = true) {
            System.out.println("меня зовут " + name + " и я хищник");
        }
        else if (grasseater = true) {
            System.out.println("меня зовут " + " и я травоядный");
        }
    }
}