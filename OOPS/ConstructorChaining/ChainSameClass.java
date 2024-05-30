package OOPS.ConstructorChaining;
/*
Constructor chaining occurs through inheritance. A subclass constructor’s task is to call super class’s constructor first. This ensures that the creation of subclass’s object starts with the initialization of the data members of the superclass. There could be any number of classes in the inheritance chain. Every constructor calls up the chain till the class at the top is reached.

Rules of constructor chaining :

The this() expression should always be the first line of the constructor.
There should be at-least be one constructor without the this() keyword (constructor 3 in above example).
Constructor chaining can be achieved in any order.

 */
public class ChainSameClass {
    int x;
    public ChainSameClass() {
        this(5);
        System.out.println("First constructor");
        System.out.println(x);
    }

    public ChainSameClass(int a) {
        this(a,10);
        System.out.println("Second");
        this.x +=1;
        System.out.println("x=" +x);
    }
    public ChainSameClass(int a, int b){
        System.out.println("Third: "+ a*b);
        this.x = 5;
        System.out.println("x=" +x);
    }
}
