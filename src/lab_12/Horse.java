package lab_12;

import java.security.SecureRandom;

public class Horse extends Animal{

    private static final int MAX_SPEED = 70;
    private int speed = 0;

    public Horse(){
        flyBehaviour = new FlyNoWay();
        this.speed = new SecureRandom().nextInt(MAX_SPEED);
    }
    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name=" + this.getClass().getSimpleName() +
                ", speed=" + speed +
                '}';
    }
}
