package Genums;

public enum Operation {
    PLUS {public int apply(int a, int b) {return a + b;}},
    MINUS {public int apply(int a, int b) {return a - b;}};

    public abstract int apply(int a, int b);
}
