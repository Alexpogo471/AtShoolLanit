package homeTask3.aviary;

import homeTask3.Animal;
import homeTask3.herbivore.Herbivore;

import java.util.ArrayList;
import java.util.List;

public class HerbAviary extends Aviary {

    private int size;
    private final List<Herbivore> herbivoreList = new ArrayList<>();

    public HerbAviary(int size) {
        if (1 <= size) {
            this.size = size;
            System.out.println("Размер вольера: "+ size);
        } else System.out.println("Вольер должен вмещать >= 1 животного");
    }


    public void addAnimal(Animal animal) {
        if (animal instanceof Herbivore) {
            if (herbivoreList.size() >= size) {
                System.out.println("В вольер больше не помещаются животные");
                return;
            }
            herbivoreList.add((Herbivore) animal);
            System.out.println("Количество животных в вольере увеличилось, и составляет: " + herbivoreList.size());
        } else {
            System.out.println("Вы пытаетесь добавить хищника в вольер для травоядных, не надо так");
        }
    }
}
