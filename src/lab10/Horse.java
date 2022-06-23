package lab10;

import java.security.SecureRandom;

public class Horse extends Animal{

    private int speed = 0;
    private static final int MAX_SPEED = 75;


    public Horse() {
        this.speed = (new SecureRandom()).nextInt(MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
