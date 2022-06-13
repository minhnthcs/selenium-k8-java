package lab8_2;

public class Tiger extends Animal {
    private static int MAX_SPEED = 100;
    private Integer speed = 0;

    public Tiger() {
//        this.speed = new UtilFunctions().getRandom(MAX_SPEED);
        this.speed = 50;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
