package lab9;

import java.security.SecureRandom;

public class Animal {

    private static final int MAX_SPEED = 100;
    private String name = "";
    private int speed = 0;
    private boolean flyable = true;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    protected Animal(AnimalBuilder animalBuilder) {
        this.name = animalBuilder.name;
        this.flyable = animalBuilder.flyable;
        this.speed = (new SecureRandom()).nextInt(100);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }

    // builder inner class
    public static class AnimalBuilder {
        String name = "";
        int speed = 0;
        boolean flyable = true;


        public AnimalBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AnimalBuilder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
