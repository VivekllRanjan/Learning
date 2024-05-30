package OOPS.SingletonClass;

public class SingletonC {
    static SingletonC obj = null;

    private SingletonC() {
    }
    public static SingletonC getInstance(){
        if(obj==null) {
            obj = new SingletonC();
            return obj;
        }
        return obj;
    }
}
