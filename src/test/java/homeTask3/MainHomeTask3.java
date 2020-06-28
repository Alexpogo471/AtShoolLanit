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
        HerbAviary herbAviary = new HerbAviary(0);
        herbAviary.addAnimal(lemur);
        herbAviary.addAnimal(giraffe);
        herbAviary.addAnimal(lemur);
        herbAviary.addAnimal(new Giraffe());
        herbAviary.addAnimal(new Lemur());
        herbAviary.addAnimal(new Lemur());
        herbAviary.addAnimal(new Lemur());
        System.out.println("\n--------------------\n");

        CarniAviary carniAviary = new CarniAviary(3);
        carniAviary.addAnimal(new Lion());
        carniAviary.addAnimal(new Lion());
        carniAviary.addAnimal(new Tiger());
        carniAviary.addAnimal(new Lion());
        carniAviary.addAnimal(new Lemur());

        CarniAviary carniAviary1 = new CarniAviary(1);
        carniAviary1.addAnimal(new Lemur());
        carniAviary1.addAnimal(new Lion());



    }
}
