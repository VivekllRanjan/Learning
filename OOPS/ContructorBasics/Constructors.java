package OOPS.ContructorBasics;

public class Constructors {

    public static void main(String[] args) {
        Demo q = new Demo("Default");
        int d = Demo.x * Demo.y;
        int f = q.a + q.b;

        System.out.println(d);
        System.out.println(f);

        Demo s = new Demo();

        System.out.println(Demo.x*Demo.y);
        System.out.println(s.a+s.b);

    }
    public static class Demo {
        static int x=5;
        static int y=6;

        int a=2,b=2;

        public Demo(String s) {
            System.out.println("Default");
        }

        public Demo() {
            x=2;
            y=5;
            this.a = 3;
            this.b = 10;
            System.out.println("Hello");
        }
    }

}


//class Constructors {
//
//    static String str;
//
//    public Constructors(){
//        System.out.println("In constructor");
//        str="Hello World";
//    }
//
//    public static void main(String[] args) {
//        Constructors c=new Constructors();
//
//        System.out.println(str);
//
//    }
//
//
//}