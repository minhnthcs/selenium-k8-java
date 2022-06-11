package lab8_2;

public class Tiger extends Animal {
    private static int MAX_SPEED = 100;
    private int speed = 0;

    public Tiger() {
        this.speed = new UtilFunctions().getRandom(MAX_SPEED);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
