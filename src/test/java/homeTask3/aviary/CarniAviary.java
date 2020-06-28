package homeTask3.aviary;

import homeTask3.Animal;
import homeTask3.carnivorous.Carnivorous;
import homeTask3.herbivore.Herbivore;

public class CarniAviary extends Aviary {

    private int size = 0;
    private int counter = 0;

    public CarniAviary(int size) {
        if (1 <= size) {
            this.size = size;
            System.out.println("Размер вольера: "+ size);
        } else System.out.println("Вольер должен вмещать < 1 животного");
    }


    public void addAnimal(Carnivorous carnivorous) {
        if (counter>=size){
            System.out.println("В вольер больше не помещаются животные");
            return;
        }
        counter++;
        System.out.println("Количество животных в вольере увеличилось, и составляет: "+ counter);
    }
}
