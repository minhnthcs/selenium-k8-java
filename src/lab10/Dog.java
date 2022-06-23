package lab10;

import java.security.SecureRandom;

public class Dog extends Animal{

    private int speed = 0;
    private static final int MAX_SPEED = 60;


    public Dog() {
        this.speed = (new SecureRandom()).nextInt(MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
