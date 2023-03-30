package code_vorlesung.vl_2023_03_30.baeume;

public class Main {
    public static void main(String[] args) {
        Element root = new Element("Haus", "house");

        //root.left = new Element("Fahrrad", "bicycle");
        root.insert("Fahrrad", "bicycle");
        root.right = new Element("Sonne", "sun");
        root.right.right = new Element("Wald", "forest");
        root.right.right.right = new Element("Wald", "wood");
        root.right.left = new Element("Holz", "wood");

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(root);
        System.out.println(root.left);
        System.out.println(root.right);
        System.out.println(root.right.right);
        System.out.println(root.right.right.right);
        System.out.println(root.right.left);
        System.out.println();

        System.out.println(root.inOrder());
    }
}
