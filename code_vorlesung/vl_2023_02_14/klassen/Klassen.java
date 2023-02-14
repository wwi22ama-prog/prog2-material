package code_vorlesung.vl_2023_02_14.klassen;

import java.util.List;

public class Klassen {
    public static void main(String[] args) {
        // Ein neues Objekt vom Typ City erzeugen:
        City c1 = new City();


        // Die Attribute der Stadt mit Werten belegen:
        c1.name = "Mannheim";
        c1.distance = 0;


        // Ein weiteres Objekt erzeugen, dieses Mal mit dessen Konstruktor:
        City c2 = new City();
        c2.name = "Hamburg";
        c2.distance = 568;

        // Noch ein paar Städte:
        

        // Alle Orte in eine Liste speichern:
        

        // Alle Orte ausgeben:
        

        // Den Ort mit der weitesten Entfernung ausgeben:
        

        // Den Ort mit der kürzesten Entfernung ausgeben:
        
    }

    /**
     * farthestCity liefert zu einer Liste von Städten die am weitesten entfernte.
     * @param cities Die Liste der Städte.
     * @return Die Stadt aus cities, deren distance-Attribut am größten ist.
     */
    public static City farthestCity(List<City> cities) {
        City farthest = null;
        // TODO
        return farthest;
    }

    /**
     * nearestCity liefert zu einer Liste von Städten die mit der geringsten Entfernung.
     * @param cities Die Liste der Städte.
     * @return Die Stadt aus cities, deren distance-Attribut am kleinsten ist.
     */
    public static City nearestCity(List<City> cities) {
        City nearest = null;
        // TODO
        return nearest;
    }
}
