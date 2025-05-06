package org.example;
/**
 * La classe Person rappresenta una persona con nome, cognome, età e indirizzo.
 * È immutabile e viene creata tramite la classe PersonBuilder.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    /**
     * Costruttore che accetta un builder per creare l'oggetto Person.
     * @param builder L'istanza di PersonBuilder usata per creare l'oggetto.
     */
    Person(PersonBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.age = builder.getAge();
        this.address = builder.getAddress();
    }

    /** @return Il nome della persona. */
    public String getFirstName() { return firstName; }

    /** @return Il cognome della persona. */
    public String getLastName() { return lastName; }

    /** @return L'età della persona. */
    public int getAge() { return age; }

    /** @return L'indirizzo della persona. */
    public String getAddress() { return address; }

    /** Imposta il nome della persona. */
    public void setFirstName(String firstName) { this.firstName = firstName; }

    /** Imposta il cognome della persona. */
    public void setLastName(String lastName) { this.lastName = lastName; }

    /** Imposta l'età della persona. */
    public void setAge(int age) { this.age = age; }

    /** Imposta l'indirizzo della persona. */
    public void setAddress(String address) { this.address = address; }

    /**
     * Restituisce una rappresentazione testuale dell'oggetto Person.
     * @return Stringa con i dati della persona.
     */
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
