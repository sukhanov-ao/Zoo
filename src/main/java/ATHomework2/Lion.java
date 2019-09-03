package ATHomework2;

public class Lion extends Meateater {
    public Lion(String name, int hungry) {
        super(name, hungry);
    }

    @Override
    public void areYouHungry() {
        if (hungry >= 0) {
            System.out.println(name + ": Спасибо, ты меня накормил! " + hungry);
        } else {
            System.out.println(name + ": Я все еще хочу кушать " + hungry);
        }
    }
}
