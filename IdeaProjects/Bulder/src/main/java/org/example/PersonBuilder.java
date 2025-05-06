package org.example;
/**
 * Classe per costruire oggetti Person in modo flessibile.
 * Richiede nome e cognome, mentre età e indirizzo sono opzionali.
 */
public class PersonBuilder {
    private final String firstName;
    private final String lastName;
    private int age = 0;
    private String address = "";

    /**
     * Costruttore con campi obbligatori.
     * @param firstName Nome della persona.
     * @param lastName Cognome della persona.
     * @throws IllegalArgumentException se nome o cognome sono null.
     */
    public PersonBuilder(String firstName, String lastName) {
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("Nome e cognome sono obbligatori.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Imposta l'età della persona.
     * @param age Età.
     * @return L'oggetto PersonBuilder per concatenare altri metodi.
     */
    public PersonBuilder age(int age) {
        this.age = age;
        return this;
    }

    /**
     * Imposta l'indirizzo della persona.
     * @param address Indirizzo.
     * @return L'oggetto PersonBuilder per concatenare altri metodi.
     */
    public PersonBuilder address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Costruisce l'oggetto Person con i dati forniti.
     * @return Un nuovo oggetto Person.
     */
    public Person build() {
        return new Person(this);
    }

    /** @return Il nome. */
    public String getFirstName() { return firstName; }

    /** @return Il cognome. */
    public String getLastName() { return lastName; }

    /** @return L'età. */
    public int getAge() { return age; }

    /** @return L'indirizzo. */
    public String getAddress() { return address; }
}
