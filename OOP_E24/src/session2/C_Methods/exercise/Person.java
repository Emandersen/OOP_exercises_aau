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
    public String citizenship;

    Person() {
        this.firstName = "Anders";
        this.lastName = "Madsen";
        this.age = 28;
        this.citizenship = "dk";
    }

    boolean checkLegalAge() { return this.age > 18 ; }

    boolean isDanishCitizen() { return this.citizenship.equals("dk"); }

    boolean canVote() { return this.checkLegalAge() && this.isDanishCitizen(); }

    public String getFormattedInfo() {

        // Using ternary operation to create an if else statement, (Condition) ? (True expression) : (False expression)
        String ageCheck = checkLegalAge() ? "Above legal age" : "Below legal age";

        return this.firstName + ", " + this.lastName + " " + this.age + ", " + ageCheck;
    }

    public void printInfo() {
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.age);
    }
}
