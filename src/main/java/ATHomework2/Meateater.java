package ATHomework2;

abstract class Meateater extends Animal {
    public Meateater(String name, int hungry) {
        super(name, hungry);
        meateater = true;
    }

    @Override
    public boolean eat (Meat pork) {
        hungry += pork.value;
        pork.value = 0;
        return hungry >= 0;
    }
}
