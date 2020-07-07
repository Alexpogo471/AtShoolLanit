package homeTask3.herbivore;

import homeTask3.FoodException;
import homeTask3.food.Food;

public class Duck extends Herbivore {
    private int satiety = (int) ((Math.random() * 5) + 1);

    public String getSatiety() {
        return "Сытость утки: " + satiety;
    }

    @Override
    public void eat(Food food)  {
        if (food == Food.PLANTS) {
            satiety++;
            System.out.println("Кормим утки, сытость теперь: " + satiety);
        } else {
            System.out.println("Травоядных нельзя кормить мясом");
        }

    }

    @Override
    public String toString() {
        return "Сытость утки: " + satiety;
    }
}
