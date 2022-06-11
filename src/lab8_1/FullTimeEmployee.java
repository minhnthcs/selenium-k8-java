package lab8_1;

public class FullTimeEmployee extends Employee{

    private final static int SALARY = 5000;
    private int salary = 0;

    public FullTimeEmployee() {
        this.salary = SALARY;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }
}
