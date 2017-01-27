package model;

public class Middle extends Employee {

    @Override
    public void calculateSalary() {
        System.out.println("Salary = " + baseRate * 2);
    }
}