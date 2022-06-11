package lab8_2;

import java.security.SecureRandom;
import java.util.*;

public class UtilFunctions {

    public int getRandom(int max){
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(max);
    }

    public Map<String, Integer> getMaxAndIndex(List<Animal> animalList){
        int maxSpeed = animalList.get(0).getSpeed();
        String animalName = animalList.get(0).getClass().getSimpleName();
        Map<String, Integer> resultMap = new HashMap<>();
        for (Animal animal : animalList) {
            if (animal.getSpeed() > maxSpeed){
                maxSpeed = animal.getSpeed();
                animalName = animal.getClass().getSimpleName();
            }
        }
        resultMap.put(animalName, maxSpeed);
        return resultMap;
    }
}

