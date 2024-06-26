package OOPS.Polymorphism;

public class MainOverloading {
    // Normal main()
    public static void main(String[] args)
    {
        System.out.println("Hi Geek (from main)");
        MainOverloading.main("Geek");
    }

    // Overloaded main methods
    public static void main(String arg1)
    {
        System.out.println("Hi, " + arg1);
        MainOverloading.main("Dear Geek", "My Geek");
    }
    public static void main(String arg1, String arg2)
    {
        System.out.println("Hi, " + arg1 + ", " + arg2);
    }
}
