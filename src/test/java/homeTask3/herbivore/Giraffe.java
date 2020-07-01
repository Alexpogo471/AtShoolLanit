package homeTask3.herbivore;

import homeTask3.FoodException;
import homeTask3.food.Food;
import homeTask3.food.Plants;

public class Giraffe extends Herbivore {

    private int satiety=(int)((Math.random()*5)+1);

    public void getSatiety() {
        System.out.println("Сытость жирафа: " +satiety);
    }

    @Override
    public void eat(Food food) throws FoodException {
        if (food instanceof Plants){
            satiety++;
            System.out.println("Кормим жирафа, сытость теперь: "+satiety);
        } else {
            throw new FoodException("Травоядных нельзя кормить мясом");
        }

    }
}
