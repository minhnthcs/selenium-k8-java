package lab8_1;

public class ContractEmployee extends Employee{

    private final static int SALARY = 4000;
    private int salary = 0;

    public ContractEmployee() {
        this.salary = SALARY;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }
}
