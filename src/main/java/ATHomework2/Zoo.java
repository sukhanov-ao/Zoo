package ATHomework2;

public class Zoo {

    public static void feedAnimal(Animal animal) throws WrongFoodException {
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

/*        for (Meat pork : porks) {
            if (pork.getValue() == 0) {
                System.out.println("От мяса ничего не осталось.");
            } else {
                System.out.println("Этот кусок мяса не съели.");
                animal.areYouHungry();
            }
        }
        for (Grass grass : drygrasses) {
            if (grass.getValue() == 0) {
                System.out.println("От травы ничего не осталось.");
            } else {
                System.out.println("Эту траву  не съели. ");
                animal.areYouHungry();
            }
        }*/ // проверка, что еда кончается.
    }

    public static void main(String[] args) {
//Кормление животных
        Animal melman = new Giraffe("Melman", -100);
        Animal gloria = new Hippo("Gloria", -100);
        Animal flash = new Sloth("Flash", -100);
        Animal alex = new Lion("Alex", -100);
        Animal tigger = new Tiger("Tigger", -57);
        Animal akela = new Wolf("Akela", -200);
        try {
            feedAnimal(melman);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        try {
            feedAnimal(gloria);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        try {
            feedAnimal(flash);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        try {
            feedAnimal(alex);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        try {
            feedAnimal(tigger);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }
        try {
            feedAnimal(akela);
        } catch (WrongFoodException e) {
            e.printStackTrace();
        }


//Помещение животных в клетки и обращение к ним
        Cage cageForMeateaters = new Cage(3, true, false);
        Cage cageForGrassEaters = new Cage(2, false, true);
        cageForGrassEaters.addAnimal(melman);
        cageForGrassEaters.addAnimal(gloria);
        cageForGrassEaters.addAnimal(flash);
        cageForMeateaters.addAnimal(alex);
        cageForMeateaters.addAnimal(tigger);
        cageForMeateaters.addAnimal(gloria);
        cageForMeateaters.getAnimalMeateater(0);
        cageForGrassEaters.getAnimalGrasseater(1);

        akela.voice();
        alex.voice();
        tigger.voice();
        melman.voice();
        gloria.voice();
        flash.voice();

    }
}