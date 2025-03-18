
// Classe principale con il metodo main
public class Main {
    public static void main(String[] args) {
        // Creazione di un'istanza di Forma
        Forma forma = new Forma();

        // Creazione le istanza
        Rettangolo rettangolo = new Rettangolo(10, 6);
        Triangolo triangolo= new Triangolo(7.0,9.0);
        // Chiamata ai metodi calcolaArea
        forma.calcolaArea();
        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}