package homeTask3;


import homeTask3.aviary.Aviary;
import homeTask3.aviary.HerbAviary;
import homeTask3.carnivorous.Lion;
import homeTask3.carnivorous.Tiger;
import homeTask3.food.Food;
import homeTask3.herbivore.Duck;
import homeTask3.herbivore.Giraffe;
import homeTask3.herbivore.Lemur;

public class MainHomeTask3 {
    public static void main(String[] args)  {

        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Duck duck = new Duck();
        Lemur lemur = new Lemur();
        Giraffe giraffe = new Giraffe();

        Food meat =  Food.MEAT;
        Food plants = Food.PLANTS;
        lemur.getSatiety();
        try {
            lemur.eat(plants);
        } catch (FoodException e) {
            e.printStackTrace();
        }
        try {
            lemur.eat(plants);
        } catch (FoodException e) {
            e.printStackTrace();
        }

        try {
            lemur.eat(meat);
        } catch (FoodException e) {
            e.printStackTrace();
        }
        try {
            lion.eat(plants);
        } catch (FoodException e) {
            e.printStackTrace();
        }
        System.out.println("\n--------------------\n");
        Aviary aviary = new HerbAviary(4);
        aviary.addAnimal(new Lion());
        aviary.addAnimal(new Lemur());
        aviary.addAnimal(new Duck());
        aviary.addAnimal(new Tiger());
        aviary.addAnimal(new Tiger());
        aviary.addAnimal(new Tiger());
        aviary.addAnimal(new Giraffe());
        aviary.addAnimal(new Giraffe());
        aviary.addAnimal(new Giraffe());

    }
}
