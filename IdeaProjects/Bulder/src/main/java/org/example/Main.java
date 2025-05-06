package org.example;
/**
 * Classe principale che crea oggetti Person usando PersonBuilder.
 */
public class Main {
    /**
     * Metodo principale di esecuzione.
     * @param args Argomenti da linea di comando (non usati qui).
     */
    public static void main(String[] args) {
        // Creo la prima persona con tutti i campi
        Person person1 = new PersonBuilder("Mario", "Rossi")
                .age(35)
                .address("Via Milano 1")
                .build();

        // Creo una persona solo con nome e cognome
        Person person2 = new PersonBuilder("Giulia", "Verdi")
                .build();

        // Stampo i dati delle persone
        System.out.println(person1);
        System.out.println(person2);
    }
}
