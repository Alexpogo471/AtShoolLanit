package homeTask3;


import com.google.gson.Gson;
import homeTask3.aviary.Aviary;
import homeTask3.aviary.HerbAviary;
import homeTask3.carnivorous.Lion;
import homeTask3.carnivorous.Tiger;
import homeTask3.food.Food;
import homeTask3.herbivore.Duck;
import homeTask3.herbivore.Giraffe;
import homeTask3.herbivore.Lemur;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainHomeTask3 {

    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args)  {


        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Duck duck = new Duck();
        Lemur lemur = new Lemur();
        Giraffe giraffe = new Giraffe();

        Food meat =  Food.MEAT;
        Food plants = Food.PLANTS;
        lemur.getSatiety();

        log.info(duck);

        duck.eat(plants);
        Gson gson = new Gson();
        String s = gson.toJson(duck);
        log.info(s);


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
