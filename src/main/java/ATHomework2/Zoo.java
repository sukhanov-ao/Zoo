package ATHomework2;

public class Zoo {

    public static void feedAnimal(Animal animal) {
        Meat[] porks = new Pork[10];
        Meat[] steaks = new Steak [4];
        Grass[] drygrasses = new Drygrass[15];
        Grass[] cabbages = new Cabbage[5];

        for (int i = 0; i < porks.length; i++) {
            porks[i] = new Pork();
        }
        for (int i = 0; i < steaks.length; i++) {
            steaks[i] = new Steak();
        }
        for (int i = 0; i < drygrasses.length; i++) {
            drygrasses[i] = new Drygrass();
        }
        for (int i = 0; i < cabbages.length; i++) {
            cabbages[i] = new Cabbage();
        }

        for (int i = 0; i < porks.length && !animal.eat(porks[i]); i++) {
            animal.areYouHungry();
        }
        for (int i = 0; i < drygrasses.length && !animal.eat(drygrasses[i]); i++) {
            animal.areYouHungry();
        }
        for (int i = 0; i < cabbages.length && !animal.eat(cabbages[i]); i++) {
            animal.areYouHungry();
        }
        for (int i = 0; i < steaks.length && !animal.eat(steaks[i]); i++) {
            animal.areYouHungry();
        }

        for (Meat pork : porks) {
            if (pork.value == 0) {
                System.out.println("От мяса ничего не осталось.");
            } else {
                System.out.println("Этот кусок мяса не съели.");
//                animal.areYouHungry();
            }
        }
        for (Grass grass : drygrasses) {
            if (grass.value == 0) {
                System.out.println("От травы ничего не осталось.");
            } else {
                System.out.println("Эту траву  не съели. ");
                animal.areYouHungry();
            }
        }
    }

    public static void main(String[] args) {

        Animal melman = new Giraffe("Melman", -100);
        Hippo gloria = new Hippo("Gloria", -100);
        Sloth flash = new Sloth("Flash", -100);
        Animal alex = new Lion("Alex", -100);
        Tiger tigger = new Tiger("Tigger", -57);
        Wolf akela = new Wolf("Akela", -200);
        feedAnimal(melman);
        feedAnimal(gloria);
        feedAnimal(flash);
        feedAnimal(alex);
        feedAnimal(tigger);
        feedAnimal(akela);

        Cage cageForMeateaters = new Cage(1, true, false);
        Cage cageForGrassEaters = new Cage(3, false, true);
        cageForGrassEaters.addAnimal(melman);
        cageForGrassEaters.addAnimal(gloria);
        cageForGrassEaters.addAnimal(flash);
        cageForMeateaters.addAnimal(alex);
        cageForMeateaters.addAnimal(tigger);
        cageForMeateaters.addAnimal(akela);
        cageForMeateaters.getAnimal(akela);
        cageForGrassEaters.getAnimal(gloria);
    }
}