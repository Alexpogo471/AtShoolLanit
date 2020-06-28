package homeTask3.carnivorous;

import homeTask3.food.Food;
import homeTask3.food.Meat;

public class Tiger extends Carnivorous {

    private int satiety=(int)((Math.random()*5)+1);

    public void getSatiety() {
        System.out.println("Сытость тигра: " +satiety);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            satiety++;
            System.out.println("Кормим тигра, сытость теперь: " + satiety);
        } else {
            System.out.println("Хищников нельзя кормить растениями");
        }
    }
}
