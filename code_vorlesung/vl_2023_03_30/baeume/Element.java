package code_vorlesung.vl_2023_03_30.baeume;

/** Datenstruktur für Elemente eines binären Suchbaums. */
public class Element {
    String de;
    String en;
    Element left;
    Element right;

    /** Konstruktor: Erwartet Werte für de und en
     *  und erzeugt damit ein neues Element. */
    public Element(String de, String en) {
        this.de = de;
        this.en = en;
    }

    /** toString liefert eine menschenlesbare Repräsenation des Elements.
     *  Wird z.B. von System.out.println() verwendet.
     */
    public String toString() {
        return String.format("%s:%s", de, en);
        // return de + ":" + en;
    }

    /** insert erwartet Werte für de und en und fügt ein neues Element
     *  mit diesen Werten in den binären Suchbaum ein.
     */
    public void insert(String de, String en) {
        // TODO
    }
}
