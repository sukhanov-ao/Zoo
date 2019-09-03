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

    private ArrayList animalList = new ArrayList(cageCapacity);
    public void addAnimal(Animal animal) {
        int i = 0;
        if ( i < cageCapacity) {
            if (forGrasseaters == animal.grasseater) {
                animalList.add(animal);
                System.out.println("В клетку добавлен " + animal.name);
                //i++;
            } else {
                System.out.println("Нельзя поместить животное в клетку");
            }
        }else {
            System.out.println("Нельзя поместить животное в клетку. Клетка заполнена");
        }
    }

    public void getAnimal(Animal animal) {
        System.out.println(animalList.indexOf(animal));
    }

}