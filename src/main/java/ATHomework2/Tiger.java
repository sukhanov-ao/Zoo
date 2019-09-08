package ATHomework2;

public class Tiger extends Meateater implements AnimalInfo {
    public Tiger(String name, int hungry)
    {
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

    @Override
    public void voice() {
        System.out.println("Grrrrmeow!");
    }
}