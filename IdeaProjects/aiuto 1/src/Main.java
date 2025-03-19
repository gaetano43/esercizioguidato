
// Classe principale per testare il programma
public class Main {
    public static void main(String[] args) {
        //Crea le istanze
        Forma rettangolo = new Rettangolo(10, 5);
        Forma triangolo = new Triangolo(8, 4);

        //stampa i risultati
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Area del triangolo: " + triangolo.calcolaArea());
    }
}