package ex3;
public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Mammifere("Gazelle","HERBIVORE"));
		zoo.addAnimal(new Mammifere("Zèbre",  "HERBIVORE"));
		zoo.addAnimal(new Mammifere("Lion",  "HERBIVORE"));
		zoo.addAnimal(new Mammifere("Panthère", "CARNIVORE"));
		zoo.addAnimal(new Poisson("Requin blanc",  "HERBIVORE"));
		zoo.addAnimal(new Poisson("Truite dorée",  "HERBIVORE"));
		zoo.addAnimal(new Reptile("Boa constrictor",  "CARNIVORE"));
		zoo.addAnimal(new Reptile("Python",  "CARNIVORE"));
		zoo.afficherListeAnimaux();
	}

}