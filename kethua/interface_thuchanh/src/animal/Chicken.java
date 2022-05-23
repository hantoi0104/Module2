package animal;

import endile.Endile;

public class Chicken extends  Animal implements Endile {

    @Override
    public String makeSound() {
        return "Ò Ó O O";
    }

    @Override
    public String howtoEat() {
        return "Mổ thịt";
    }
}
