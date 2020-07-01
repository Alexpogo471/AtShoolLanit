package homeTask3.carnivorous;

import homeTask3.FoodException;
import homeTask3.food.Food;
import homeTask3.food.Meat;

public class Lion extends Carnivorous {

    private int satiety=(int)((Math.random()*5)+1);

    public void getSatiety() {
        System.out.println("Сытость льва: " +satiety);
    }

    @Override
    public void eat(Food food) throws FoodException {
        if (food instanceof Meat) {
            satiety++;
            System.out.println("Кормим льва, сытость теперь: " + satiety);
        } else {
            throw new FoodException("Хищников нельзя кормить растениями");
        }
    }
}
