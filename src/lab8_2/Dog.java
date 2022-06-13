package lab8_2;

public class Dog extends Animal{

    private static int MAX_SPEED = 60;
    private Integer speed = 0;

    public Dog() {
//         this.speed = new UtilFunctions().getRandom(MAX_SPEED);
        this.speed = 40;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
