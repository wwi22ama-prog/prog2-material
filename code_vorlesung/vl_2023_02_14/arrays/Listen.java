package code_vorlesung.vl_2023_02_14.arrays;

import java.util.ArrayList;
import java.util.List;

public class Listen {
    public static void main(String[] args) {
        // Eine Liste von Zahlen erzeugen:
        

        // Über die Zahlen iterieren und sie ausgeben:
        

        // ... oder per Funktion:
        

        // Die Primzahlen aus numbers heraussammeln und ausgeben:
        

        // Eine Liste von Strings erzeugen und ein paar Werte hinzufügen:
        List<String> cities  = new ArrayList<>();
        

        // Die Liste ausgeben:
        printList(cities);

        // Abfrage, ob die Liste bestimmte Städte enthält:
        

        // Ausgabe der Abfrageergebnisse:
        

    }

    /**
     * Generische Funktion zum Ausgeben einer Liste auf die Konsole.
     * Diese Funktion ist unabhängig vom konkreten Elementtyp.
     * @param <T> Typ der Elemente in der Liste.
     * @param list Die auszugebende Liste.
     */
    public static <T> void printList(List<T> list) {
        // TODO
    }

    /**
     * primes liefert zu einer Liste aus Zahlen diejenigen davon, die Primzahlen sind.
     * @param numbers Die eingehende Liste der Zahlen.
     * @return Die Primzahlen, die in numbers vorkommen.
     */
    public static List<Integer> primes(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();

        // TODO
        return result;
    }

    /**
     * isPrime prüft, ob eine Zahl eine Primzahl ist.
     * @param n Die zu prüfende Zahl.
     * @return true, falls n eine Primzahl ist, ansonsten false.
     */
    public static boolean isPrime(int n) {
        // TODO
        return true;
    }
}
