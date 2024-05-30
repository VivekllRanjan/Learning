package OOPS.ContructorBasics;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<>();
        Arr.add((int) 'a');
        Arr.add(45);
        int x= Arr.get(1);
        System.out.println(x);
    }
}
