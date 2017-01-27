package model;

public class Senior extends Employee {

    @Override
    public void calculateSalary() {
        System.out.println("Salary = " + baseRate * 5);
    }
}