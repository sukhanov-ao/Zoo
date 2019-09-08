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

    private ArrayList cageForGrasseaters = new ArrayList(cageCapacity);
    private ArrayList cageForMeateaters = new ArrayList(cageCapacity);
//    private Cage[] cageForGrasseaters = new Cage[cageCapacity];
//    private Cage[] cageForMeateaters = new Cage[cageCapacity];

    public void addAnimal(Animal animal) {
        for (int i = 0; i < 1; i++) {
            if (forGrasseaters && animal.grasseater) {
                cageForGrasseaters.add(animal.name);
                System.out.println("В клетку для травоядных добавлен " + animal.name);
            } else if (forMeateaters && animal.meateater) {
                cageForMeateaters.add(animal.name);
                System.out.println("В клетку для плотоядных добавлен " + animal.name);
            } else {
                System.out.println("Нельзя поместить животное " + animal.name + " в клетку");
            }

        }
//        System.out.println(cageForGrasseaters);
//        System.out.println(cageForMeateaters);
    } // распределение животных по клеткам для травоядных и хищников
    public void getAnimalMeateater (int index) {
        System.out.println(cageForMeateaters.get(index));
        //return cageForMeateaters.get(index);
    }
    public void getAnimalGrasseater (int index) {
        System.out.println(cageForGrasseaters.get(index));
        //return cageForGrasseaters.get(index);
    }

}