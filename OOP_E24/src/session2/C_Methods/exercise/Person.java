package session2.C_Methods.exercise;


/**
 * Exercise:
 * Start from Person class in A_ClassesAndObjects.
 *     - Add a method that returns whether the person is or not under the legal age (18 years old).
 *     - Add a method that returns a String formatted as, e.g., "Anders, Madsen, 28, Above Legal Age"
 *       or "Thomas, Nielsen, 14, Below Legal Age"
 */
class Main {
    private String firstName;
    private String lastName;
    private int age;

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.getFormattedInfo());


        person.firstName = "John";
        person.lastName = "Smith";
        person.age = 17;

        System.out.println(person.getFormattedInfo());
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
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.age);
    }

    public String getFormattedInfo() {
        String ageCheck;

        if (checkLegalAge()) { ageCheck = "Above legal age" ; }
        else { ageCheck = "Below legal age" ; }


        return this.firstName + ", " + this.lastName + " " + this.age + ", " + ageCheck;
    }

    public boolean checkLegalAge() {
        if (this.age > 18) {
            return true;
        } else {
            return false;
        }
    }
}
