package homeTask3.herbivore;

import homeTask3.food.Food;

public class Giraffe extends Herbivore {

    private int satiety;
    @Override
    public void eat(Food food) {
        satiety++;
    }
}
