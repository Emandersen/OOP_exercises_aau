package session2.E_Encapsulation.exercise;

/**
 * Exercise:
 *  * Now a Person can have a first name, a last name and, optionally, a middle name. And also an age.
 *  * Create constructors for this class.
 *  * Create the getter and setters that you think are needed here.
 *  * Write code in the main method that illustrates the use of the getters and setters.
 **/

/**
 * Example solution
 */
class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Frank", "Davis");
        Person person2 = new Person("Mary", "J.", "Smith");

        System.out.println(person1.getFormattedInfo());
        System.out.println(person2.getFormattedInfo());

        System.out.println(person1.getAge());
        System.out.println(person2.getAge());

        person1.setAge(17);
        person2.setAge(18);

        System.out.println(person1.getFormattedInfo());
        System.out.println(person2.getFormattedInfo());
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

    boolean hasMiddleName() { return this.middleName != null; }

    boolean isLegalAge() { return this.age > 18 ; }

    boolean isDanishCitizen() { return this.citizenship.equals("dk"); }

    boolean canVote() { return this.isLegalAge() && this.isDanishCitizen(); }

    public String getFormattedInfo() {

        // Using ternary operation to create an if else statement, (Condition) ? (True expression) : (False expression)
        String ageCheck = isLegalAge() ? "Above legal age" : "Below legal age";
        String middleName = hasMiddleName() ? (this.middleName + ", ") : "";

        return this.firstName + ", " + middleName + this.lastName + " " + this.age + ", " + ageCheck;
    }

    public void printInfo() {
        System.out.println(this.firstName);
        System.out.println(this.lastName);
        System.out.println(this.age);

    }

    // Getters
    public String getFirstName() { return this.firstName; }
    public String getMiddleName() { return this.middleName; }
    public String getLastName() { return this.lastName; }
    public int getAge() { return this.age; }
    public String getCitizenship() { return this.citizenship; }

    // Setters
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
    public void setCitizenship(String citizenship) {
        if (citizenship.length() == 2) {
            this.citizenship = citizenship;
        }
    }
}


