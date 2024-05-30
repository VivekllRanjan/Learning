package OOPS.ContructorBasics;

public class CopyConstructors {
    int re,im;

    public CopyConstructors(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public CopyConstructors(CopyConstructors old) {
        this.re = old.re;
        this.im = old.im;
    }
}
