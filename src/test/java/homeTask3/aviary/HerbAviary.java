package homeTask3.aviary;

import homeTask3.Animal;
import homeTask3.herbivore.Herbivore;

public class HerbAviary extends Aviary {

    private int size = 0;
    private int counter = 0;

    public HerbAviary(int size) {
            this.size = size;
        System.out.println("Размер вольера: "+ size);
    }


    public void addAnimal(Herbivore herbivore) {
        if (counter >= size) {
            System.out.println("В вольер больше не помещаются животные");
            return;
        }
        counter++;
        System.out.println("Количество животных в вольере увеличилось, и составляет: " + counter);
    }
}
