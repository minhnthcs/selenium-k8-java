package lab_12;

import lab9.Animal;

import java.util.*;

public class AnimalRacing {

    public static void main(String[] args) {
        new AnimalRacing().animalRacing(Arrays.asList(new Tiger(), new Dog(), new Eager(), new Horse(), new Chicken()));
    }

    public void animalRacing(List<lab_12.Animal> animalList){
        List<lab_12.Animal> nonFlyableAnimal = new ArrayList<>();
        for (lab_12.Animal animal : animalList) {
            if (!animal.isFlyable()){
                nonFlyableAnimal.add(animal);
            }
        }
        System.out.printf("All non-flyable animal list: %s\n", nonFlyableAnimal);

        Map<Integer, List<lab_12.Animal>> speedRecord = new HashMap<>();
        for (lab_12.Animal animal : nonFlyableAnimal) {
            if (!speedRecord.containsKey(animal.getSpeed())){
                System.out.println(animal.getSpeed());
                speedRecord.put(animal.getSpeed(), new ArrayList(Arrays.asList(animal)));
            }else {
                speedRecord.get(animal.getSpeed()).add(animal);
            }
        }

        // Find max speed from speedRecord map
        Integer maxSpeed = Collections.max(speedRecord.keySet());

        // Print all winner Animal with max speed
        List<String> listOfWinner = new ArrayList<>();
        for (lab_12.Animal animal : speedRecord.get(maxSpeed)) {
            listOfWinner.add(animal.getClass().getSimpleName());
        }
        System.out.printf("The winner speed is: %d and the winners are: %s", maxSpeed, listOfWinner);
    }
}
