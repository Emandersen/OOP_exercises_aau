package session2.A_ClassesAndObjects.exercise;

/**
 * Exercise:
 * a) Write a class to represent a person. A person has a first name, last name, and an age.
 * b) Write code that create a person object and outputs the person's information as a string
 * formatted as "Anders, Madsen, 28".
 */
class Main {
    private String firstName;
    private String lastName;
    private int age;

    public static void main(String[] args) {
        Person person = new Person();
        person.printInfo();

        person.firstName = "John";
        person.lastName = "Smith";
        person.age = 20;
        person.printInfo();

    }

}

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    Person() {
        this.firstName = "Anders";
        this.lastName = "Madsen";
        this.age = 28;
    }

    public void printInfo() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);

    }
}
