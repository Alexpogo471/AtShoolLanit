package homeTask3.carnivorous;

import homeTask3.FoodException;
import homeTask3.food.Food;

public class Tiger extends Carnivorous {

    private int satiety=(int)((Math.random()*5)+1);

    public void getSatiety() {
        System.out.println("Сытость тигра: " +satiety);
    }

    @Override
    public void eat(Food food) throws FoodException {
        if (food == Food.MEAT) {
            satiety++;
            System.out.println("Кормим тигра, сытость теперь: " + satiety);
        } else {
            throw new FoodException("Хищников нельзя кормить растениями");
        }
    }
}
