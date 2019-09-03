package ATHomework2;

public class Giraffe extends Grasseater {
    public Giraffe(String name, int hungry) {
        super(name, hungry);
    }

    @Override
    public void areYouHungry() {
        if (hungry >= 0) {
            System.out.println(name +": Спасибо, ты меня накормил! " + hungry);
        } else {
            System.out.println(name + ": Я все еще хочу кушать " + hungry);
        }
    }
}
