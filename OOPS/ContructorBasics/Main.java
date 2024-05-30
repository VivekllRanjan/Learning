package OOPS.ContructorBasics;

public class Main {
    public static void main(String[] args) {
        CopyConstructors c = new CopyConstructors(2,5);
        CopyConstructors v = new CopyConstructors(c);
        System.out.println(c==v);
        CopyConstructors b = c;
        System.out.println(c==b);
        System.out.println("Same "+ c.re +"+j"+c.im);

    }

}
