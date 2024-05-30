package OOPS.SingletonClass;

public class Main {
    public static void main(String[] args) {
        SingletonC ob1 = SingletonC.getInstance();
        SingletonC ob2 = SingletonC.getInstance();
        System.out.println(ob1==ob2);

    }
}
