package lab9;

import java.sql.Array;
import java.util.*;

public class AnimalRace {

    public static void main(String[] args) {
        Animal.AnimalBuilder animalBuilder = new Animal.AnimalBuilder();
        Animal tiger = animalBuilder.setName("Tiger").setFlyable(false).build();
        Animal dog = animalBuilder.setName("Dog").setFlyable(false).build();
        Animal horse = animalBuilder.setName("horse").setFlyable(false).build();
        Animal bird = animalBuilder.setName("Bird").setFlyable(true).build();
        Animal duck = animalBuilder.setName("Duck").setFlyable(true).build();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(horse);
        animalList.add(dog);
        animalList.add(bird);
        animalList.add(duck);
        System.out.printf("All animal list: %s\n",animalList.toString());

        List<Animal> nonFlyableAnimal = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyable()){
                nonFlyableAnimal.add(animal);
            }
        }
        System.out.printf("All non-flyable animal list: %s\n", nonFlyableAnimal.toString());

        Map<Integer, List<Animal>> speedRecord = new HashMap<>();
        for (Animal animal : nonFlyableAnimal) {
            if (!speedRecord.containsKey(animal.getSpeed())){
                speedRecord.put(animal.getSpeed(), new ArrayList(Arrays.asList(animal)));
            }else {
                speedRecord.get(animal.getSpeed()).add(animal);
            }
        }

        // Find max speed from speedRecord map
        Integer maxSpeed = Collections.max(speedRecord.keySet());

        // Print all winner Animal with max speed
        List<String> listOfWinner = new ArrayList<>();
        for (Animal animal : speedRecord.get(maxSpeed)) {
            listOfWinner.add(animal.getName());
        }

        System.out.printf("The winner speed is: %d and the winners are: %s", maxSpeed, listOfWinner.toString());

    }
}
