package session2.D_Constructors.exercise;



/**
 * Exercise:
 *  * Now a Person can have a first name, a last name and, optionally, a middle name.
 *  a) Create two constructors for this class.
 *      * A constructor to create Person objects with middle name.
 *      * A constructor to create Person objects without middle name.
 *  b) Add a method that return true/false to indicate if the person has or does not have a middle name.
 *  c) Add a method that outputs the person's information as a string formatted as:
 *      * E.g. ”Anders, Madsen” if there is no middle name.
 *      * E.g. ”Anders, M., Madsen” if there is a middle name.
 **/
class Main {
    public static void main(String[] args) {
        Person person = new Person("Frank", "Davis");
        Person person1 = new Person("Mary","James" ,"Smith");

        System.out.println(person.getFormattedInfo());
        System.out.println(person1.getFormattedInfo());
    }
}


public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String citizenship;

    Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = 28;
        this.citizenship = "dk";
    }

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.middleName = null;
        this.lastName = lastName;
        this.age = 28;
        this.citizenship = "dk";
    }

    boolean checkMiddleName() { return this.middleName != null; }

    boolean checkLegalAge() { return this.age > 18 ; }

    boolean isDanishCitizen() { return this.citizenship.equals("dk"); }

    boolean canVote() { return this.checkLegalAge() && this.isDanishCitizen(); }

    public String getFormattedInfo() {

        // Using ternary operation to create an if else statement, (Condition) ? (True expression) : (False expression)
        String ageCheck = checkLegalAge() ? "Above legal age" : "Below legal age";
        String middleName = checkMiddleName() ? (this.middleName + ", ") : "";

        return this.firstName + ", " + middleName + this.lastName + " " + this.age + ", " + ageCheck;
    }

    public void printInfo() {
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.age);

    }
}

