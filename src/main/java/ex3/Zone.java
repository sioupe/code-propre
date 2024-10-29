package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {
    protected List<Animal> animals;

    public Zone() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);

    };


}
