package lab8_2;

import java.lang.reflect.Array;
import java.util.*;

public class RacingAnimalTest {

    UtilFunctions utilFunctions = new UtilFunctions();

    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);

        for (Animal animal : animalList) {
            System.out.printf("%s : %d \n", animal.getClass().getSimpleName(), animal.getSpeed());
        }
        new RacingAnimalTest().getAnimalWinner(animalList);
    }

    public void getAnimalWinner(List<Animal> animalList){

        Map<String, Integer> resultMap = new HashMap<>();
//        resultMap = utilFunctions.getMaxAndIndex(animalList);
//
//        // Get key and value of result Map for animalName and speed
//        Map.Entry<String,Integer> entry = resultMap.entrySet().iterator().next();
//        String animalName = entry.getKey();
//        Integer speed = entry.getValue();
//        System.out.printf("Winner is %s, with speed: %d", animalName, speed );

        Map<Integer, List<Animal>> speedRecord = new HashMap<>();
        for (Animal animal : animalList) {
            if (!speedRecord.containsKey(animal.getSpeed())){
                // speedRecord.put(animal.getSpeed(), List.of(animal));
                speedRecord.put(animal.getSpeed(), new ArrayList(Arrays.asList(animal)));
            } else {
                speedRecord.get(animal.getSpeed()).add(animal);
            }
        }

        // Find max speed from speedRecord map
        Integer maxSpeed = Collections.max(speedRecord.keySet());

        // Print all winner Animal with max speed
        List<String> listOfWinner = new ArrayList<>();
        for (Animal animal : speedRecord.get(maxSpeed)) {
            listOfWinner.add(animal.getClass().getSimpleName());
        }

        System.out.printf("The winner speed is: %d and the winners are: %s", maxSpeed, listOfWinner.toString());
    }
}
