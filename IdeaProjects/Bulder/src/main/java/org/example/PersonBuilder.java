package org.example;


public class PersonBuilder {
    private final String firstName;
    private final String lastName;
    private int age = 0;
    private String address = "";

    public PersonBuilder(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("First name and last name are required.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(this);
    }

    // Getter per Person
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getAddress() { return address; }
}
