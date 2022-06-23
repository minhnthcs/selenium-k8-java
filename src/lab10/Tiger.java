package lab10;

import java.security.SecureRandom;

public class Tiger extends Animal{

    private int speed = 0;
    private static final int MAX_SPEED = 100;


    public Tiger() {
        this.speed = (new SecureRandom()).nextInt(MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
