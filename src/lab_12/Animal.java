package lab_12;

import java.security.SecureRandom;

public class Animal {

    private static final int MAX_SPEED = 100;
    private int speed = 0;

    protected FlyBehaviour flyBehaviour;

    public Animal() {
        this.speed = new SecureRandom().nextInt(MAX_SPEED);
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isFlyable(){
        return flyBehaviour.fly();
    }

}
