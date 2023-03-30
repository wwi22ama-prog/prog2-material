package code_vorlesung.vl_2023_03_30.baeume;

public class Element {
    String de;
    String en;
    Element left;
    Element right;

    public Element(String de, String en) {
        this.de = de;
        this.en = en;
    }

    public String toString() {
        return String.format("%s:%s", de, en);
        // return de + ":" + en;
    }

    public void insert(String de, String en) {
        
    }
}
