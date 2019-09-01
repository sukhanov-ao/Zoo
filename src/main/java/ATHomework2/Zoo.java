package ATHomework2;

public class Zoo {

    public static void feedAnimal(Animal animal){
        Pork [] porks= new Pork[3];
        Grass[] grasses = new Grass[3];
        for (int i = 0; i < porks.length; i++) {
            porks[i] = new Pork();
            grasses[i] = new Grass();
        }

        for (int i = 0; i < porks.length && !animal.eat(porks[i]); i++) {
            animal.areYouHungry();
        }
        for (Pork pork : porks) {
            if (pork.value == 0){
                System.out.println("От мяса ничего не осталось.");
            } else {
                System.out.println("Этот кусок мяса не съели.");
//                animal.areYouHungry();
            }
        }
        for (int i = 0; i < grasses.length && !animal.eat(grasses[i]); i++) {
            animal.areYouHungry();
        }
        for (Grass grass : grasses) {
            if (grass.value == 0){
                System.out.println("От травы ничего не осталось.");
            } else {
                System.out.println("Эту траву  не съели.");
                animal.areYouHungry();
            }
        }
    }

    public static void main(String[] args) {
//        Monkey bob = new Monkey("Bob", -100);
//        Ptichka charlie = new Ptichka("charlie", -100);
//        Giraffe melman = new Giraffe("Melman", -100);
//        Hippo gloria = new Hippo("Gloria", -100);
        //       Sloth flash = new Sloth("Flash", -100);
        Lion alex = new Lion("Alex", -50);
//        Tiger tigger = new Tiger("Tigger", -100);
//        Wolf akela = new Wolf("Akela", -100);
//        feedAnimal(bob);
//       feedAnimal(charlie);
//        feedAnimal(melman);
//        feedAnimal(gloria);
//        feedAnimal(flash);
        feedAnimal(alex);
//        feedAnimal(tigger);
//        feedAnimal(akela);
    }
}