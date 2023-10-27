package Encapsulation;

public class Main
{
    public static void main(String[] args) {
        Employee somebody = new Employee("Jack", "Riddler", (byte) 34, 123456789, 150000);
        System.out.println(somebody.speak());
    }
}
