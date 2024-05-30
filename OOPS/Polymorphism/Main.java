package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Parent obj = new SubClass();
        obj.print(); //Shadowing
    }
}
