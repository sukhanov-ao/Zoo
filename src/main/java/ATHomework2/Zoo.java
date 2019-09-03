package ATHomework2;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {

    public static void feedAnimal(Animal animal) {
        Meat[] porks = new Pork[10];
        Grass[] grasses = new Drygrass[10];

        for (int i = 0; i < porks.length; i++) {
            porks[i] = new Pork();
            grasses[i] = new Drygrass();
        }

        for (int i = 0; i < porks.length && !animal.eat(porks[i]); i++) {
            animal.areYouHungry();
        }
        for (int i = 0; i < grasses.length && !animal.eat(grasses[i]); i++) {
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
        for (Grass grass : grasses) {
            if (grass.value == 0) {
                System.out.println("От травы ничего не осталось.");
            } else {
                System.out.println("Эту траву  не съели. ");
                animal.areYouHungry();
            }
        }
    }

    public static void main(String[] args) {

//        Monkey bob = new Monkey("Bob", -100);
//        Ptichka charlie = new Ptichka("charlie", -100);
        Animal melman = new Giraffe("Melman", -100);
//        Hippo gloria = new Hippo("Gloria", -100);
        //       Sloth flash = new Sloth("Flash", -100);
        Animal alex = new Lion("Alex", -100);
//        Tiger tigger = new Tiger("Tigger", -100);
//        Wolf akela = new Wolf("Akela", -100);
//        feedAnimal(bob);
//       feedAnimal(charlie);
        feedAnimal(melman);
//        feedAnimal(gloria);
//        feedAnimal(flash);
        feedAnimal(alex);
//        feedAnimal(tigger);
//        feedAnimal(akela);

        Cage cageForMeateaters = new Cage(5, true);
        Cage cageForGrassEaters = new Cage(3, false);
        cageForMeateaters.addAnimal(alex);
        cageForGrassEaters.addAnimal(melman);


    }
}