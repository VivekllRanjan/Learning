package OOPS.ConstructorChaining;

public class ClassSuper {
    int x;
    public ClassSuper() {
        this(5);
        System.out.println("Base First constructor");
        System.out.println(x);
    }

    public ClassSuper(int a) {
        this(a,10);
        System.out.println("Base Second");
        this.x +=1;
        System.out.println("x=" +x);
    }
    public ClassSuper(int a, int b){
        System.out.println("Base Third: "+ a*b);
        this.x = 5;
        System.out.println("x=" +x);
    }
}
