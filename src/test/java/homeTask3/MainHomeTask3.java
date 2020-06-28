package homeTask3;

import homeTask3.aviary.CarniAviary;
import homeTask3.carnivorous.Lion;
import homeTask3.carnivorous.Tiger;
import homeTask3.herbivore.Giraffe;
import homeTask3.herbivore.Lemur;

public class MainHomeTask3 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Lemur lemur = new Lemur();
        Giraffe giraffe = new Giraffe();
        CarniAviary aviary = new CarniAviary(5);
        aviary.addAnimal(lion);
        aviary.addAnimal(new Lion());
        aviary.addAnimal(new Lion());
        aviary.addAnimal(new Lion());
        aviary.addAnimal(new Lion());
        aviary.addAnimal(new Lion());
        aviary.addAnimal(new Lion());
    }
}
