package lab8_2;

public class Horse extends Animal{

    private static int MAX_SPEED = 75;
    private int speed = 0;

    public Horse() {
        this.speed = new UtilFunctions().getRandom(MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
