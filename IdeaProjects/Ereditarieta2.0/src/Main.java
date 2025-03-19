
// Classe principale con il metodo main
public class Main {
    public static void main(String[] args) {
        // Creazione delle istanza
        Rettangolo rettangolo = new Rettangolo(10.0, 6.0);
        Triangolo triangolo= new Triangolo(7.0,9.0);

        // Stampa i risultati
        System.out.println("L'area del rettangolo è di " + rettangolo.calcolaArea() + " metri quadrati.");
        System.out.println("L'area del triangolo è di " + triangolo.calcolaArea() + " metri quadrati.");
    }
}