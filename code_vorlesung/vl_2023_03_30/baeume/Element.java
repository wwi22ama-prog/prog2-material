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
        if (de.compareTo(this.de) < 0) {
            insertLeft(de, en);
        } else {
            insertRight(de, en);
        }
    }

    private void insertLeft(String de, String en) {
        if (left == null) {
            left = new Element(de, en);
            return ;
        }
        left.insert(de, en);
    }

    private void insertRight(String de, String en) {
        if (right == null) {
            right = new Element(de, en);
            return ;
        }
        right.insert(de, en);
    }

    public String inOrder() {

        String leftstring = (left != null) ? left.inOrder() : "";
        String rootstring = this.toString();
        String rightstring = (right != null) ? right.inOrder() : "";

        return String.format("%s%s\n%s", leftstring, rootstring, rightstring);

        /* Alternative Schreibweise
        String leftstring = "";
        if (left != null) {
            leftstring = left.inOrder();
        }
        */
    }
}
