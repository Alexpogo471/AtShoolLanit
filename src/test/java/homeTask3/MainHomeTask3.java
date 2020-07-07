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
import org.apache.logging.log4j.core.util.JsonUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainHomeTask3 {

    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args)  {

        Gson gson = new Gson();

        System.out.println("Достаем из файла объект duck");

        String duckFromFile = "";
        try {
            FileReader reader = new FileReader("note.txt");
            StringBuilder fileDuck = new StringBuilder();
            int c;
            while ((c=reader.read())!=-1){
                fileDuck.append((char)c);
            }
            duckFromFile = fileDuck.toString();
            System.out.println("Утка из файла: "+duckFromFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Duck deserializedDuck = gson.fromJson(duckFromFile,Duck.class);
        System.out.println("Объект из файла: "+ deserializedDuck.getSatiety());

        System.out.println("\n--------------------\n");

        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Duck duck = new Duck();
        Lemur lemur = new Lemur();
        Giraffe giraffe = new Giraffe();

        Food meat =  Food.MEAT;
        Food plants = Food.PLANTS;
        lemur.getSatiety();


        System.out.println("\n--------------------\n");
        log.info(duck);
        duck.eat(plants);
        String jsonDuck = gson.toJson(duck);
        log.info("Пишем в лог: "+jsonDuck);

        System.out.println("Пишем в файл объект duck с полем: "+ duck.getSatiety());
        try {
            FileWriter writer = new FileWriter("note.txt",false);
            writer.write(jsonDuck);
            writer.close();
        } catch (IOException e) {
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
