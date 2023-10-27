package Encapsulation;

import java.text.NumberFormat;

public class Employee extends Person
{
    private int salary;
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

    public Employee(String firstName, String lastName, Byte age, Integer ssn, int salary) {
        super(firstName, lastName, age, ssn);
        this.salary = salary;
    }

    public String speak() {
        return "My name is: " + getFirstName() + " " + getLastName() + ".\nMy salary is: " + currencyFormatter.format((int)salary);
    }
}