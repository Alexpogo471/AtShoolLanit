package homeTask3.herbivore;

import homeTask3.food.Food;
import homeTask3.food.Plants;

public class Duck extends Herbivore{
    private int satiety=(int)((Math.random()*5)+1);

    public void getSatiety() {
        System.out.println("Сытость утки: " +satiety);
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Plants){
            satiety++;
            System.out.println("Кормим утки, сытость теперь: "+satiety);
        } else {
            System.out.println("Травоядных нельзя кормить мясом");
        }

    }
}
