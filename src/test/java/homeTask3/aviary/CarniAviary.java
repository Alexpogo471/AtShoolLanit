package homeTask3.aviary;

import homeTask3.Animal;
import homeTask3.carnivorous.Carnivorous;
import homeTask3.herbivore.Herbivore;

import java.util.ArrayList;
import java.util.List;

public class CarniAviary extends Aviary {

    private int size;
    private final List<Carnivorous> carnivorousList = new ArrayList<>();

    public CarniAviary(int size) {
        if (1 <= size) {
            this.size = size;
            System.out.println("Размер вольера: "+ size);
        } else System.out.println("Вольер должен вмещать >= 1 животного");
    }


    public void addAnimal(Animal animal) {
        if (animal instanceof Carnivorous) {
            if (carnivorousList.size() >= size) {
                System.out.println("В вольер больше не помещаются животные");
                return;
            }
            carnivorousList.add((Carnivorous) animal);
            System.out.println("Количество животных в вольере увеличилось, и составляет: " + carnivorousList.size());
        } else {
            System.out.println("Вы пытаетесь добавить травоядного в вольер для хищников, не надо так");
        }
    }
}
