package homeTask3;

import homeTask3.aviary.CarniAviary;
import homeTask3.aviary.HerbAviary;
import homeTask3.carnivorous.Lion;
import homeTask3.carnivorous.Tiger;
import homeTask3.food.Food;
import homeTask3.food.Meat;
import homeTask3.herbivore.Giraffe;
import homeTask3.herbivore.Lemur;

public class MainHomeTask3 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Lemur lemur = new Lemur();
        Giraffe giraffe = new Giraffe();
        CarniAviary aviary = new CarniAviary(5);
        aviary.addAnimal(lemur);
        aviary.addAnimal(new Lion());
        aviary.addAnimal(new Lion());
        aviary.addAnimal(new Lion());
        aviary.addAnimal(new Lion());
        aviary.addAnimal(new Lion());
        aviary.addAnimal(new Lion());
        System.out.println("\n--------------------\n");
        HerbAviary herbAviary = new HerbAviary(4);
        herbAviary.addAnimal(new Lion());
        herbAviary.addAnimal(new Giraffe());
        herbAviary.addAnimal(new Lemur());
        herbAviary.addAnimal(new Lemur());
        herbAviary.addAnimal(new Lemur());
        herbAviary.addAnimal(new Lemur());
        herbAviary.addAnimal(new Lemur());

       Food meat = new Meat();
        giraffe.getSatiety();
        giraffe.eat(meat);

        lion.getSatiety();
        lion.eat(meat);
    }
}
