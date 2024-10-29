package ex3;

import java.util.List;

public abstract class Zone {
    protected List<Animal> animals;

    public void addAnimal(Animal animal){
        animals.add(animal);
    };


}
