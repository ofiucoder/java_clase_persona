package dev.ofiucoder.javaclasepersona;

public class Person {
    private String firstName;
    private String lastName;
    private String idNumber;
    private int yearOfBirth;
    private String countryOfBirth;
    private char gender;

    public Person(String firstName, String lastName, String idNumber, int yearOfBirth, String countryOfBirth, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.yearOfBirth = yearOfBirth;
        this.countryOfBirth = countryOfBirth;
        this.gender = gender;
    }

    public void printDetails() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Year of Birth: " + yearOfBirth);
        System.out.println("Country of Birth: " + countryOfBirth);
        System.out.println("Gender: " + gender);
    }
}

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Alberto", "Casas", "123456789", 1983, "COLOMBIA", 'M');
        Person person2 = new Person("Maria", "Castelblanc", "987654321", 1995, "Canada", 'F');
        Person person3 = new Person("Apple", "Computer", "AA7654321", 1979, "USA", '0');

        person1.printDetails();
        System.out.println();
        person2.printDetails();
        System.out.println();
        person3.printDetails();

    }
}