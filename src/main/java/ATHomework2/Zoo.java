import ATHomework2.*;

public class Zoo {

    public static void feedAnimal(Animal animal){
        Pork[] pieceOfPork = new Pork[20];
        for (int i = 0; i < pieceOfPork.length; i++) {
            pieceOfPork[i] = new Pork();
        }

        for (int i = 0; i < pieceOfPork.length && !animal.eat(pieceOfPork[i]); i++) {
            animal.areYouHungry();
        }
        animal.eat(pieceOfPork);
        animal.areYouHungry();
        for (Pork pork : pieceOfPork) {
            if (pork.value == 0){
                System.out.println("От мяса ничего не осталось.");
            } else {
                System.out.println("Этот кусок мяса не съели.");
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