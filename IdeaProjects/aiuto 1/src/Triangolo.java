
// Implementazione della classe Triangolo
class Triangolo implements Forma {
    private double base, altezza;

    // Costruttore
    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    // Implementazione del metodo per calcolare l'area
    @Override
    public double calcolaArea() {
        return (base * altezza)*0.5;
    }
}
