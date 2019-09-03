package ATHomework2;

import java.util.ArrayList;

public class Cage {
    public int cageCapacity;
    public boolean forMeateaters;
    public boolean forGrasseaters;

    public Cage(int cageCapacity, boolean forMeateaters, boolean forGrasseaters) {
        this.cageCapacity = cageCapacity;
        this.forMeateaters = forMeateaters;
        this.forGrasseaters = forGrasseaters;
    }

    public ArrayList animalList = new ArrayList(cageCapacity);
    public void addAnimal (Animal animal) {
        if (cageCapacity > 0) {
            if (forGrasseaters && animal.grasseater) {
                animalList.add(animal);
                System.out.println("В клетку для травоядных добавлен " + animal.name);
            }
            else if (forMeateaters && animal.meateater) {
                animalList.add(animal);
                System.out.println("В клетку для хищников добавлен " + animal.name);
            }
        } else {
            System.out.println("Нельзя создать клетку отрицательного размера");
        }
    }
}