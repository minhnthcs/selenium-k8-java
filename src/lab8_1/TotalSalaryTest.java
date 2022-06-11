package lab8_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TotalSalaryTest {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        Employee FTE_1 = new FullTimeEmployee();
        Employee FTE_2 = new FullTimeEmployee();
        Employee FTE_3 = new FullTimeEmployee();
        Employee FTE_4 = new FullTimeEmployee();
        Employee CE_1 = new ContractEmployee();
        Employee CE_2 = new ContractEmployee();
        Employee CE_3 = new ContractEmployee();

        int totalSalary = new TotalSalaryTest().totalSalary(Arrays.asList(FTE_1, FTE_2, FTE_3, CE_1, CE_2, FTE_4, CE_3));
        System.out.printf("Total salary of employees in the company is: %d\n", totalSalary);
    }

    public int totalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }

        return totalSalary;
    }
}
