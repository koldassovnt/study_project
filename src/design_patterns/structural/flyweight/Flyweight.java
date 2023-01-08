package design_patterns.structural.flyweight;

public class Flyweight {
    private final int row;

    public Flyweight(int row) {
        this.row = row;
        System.out.println("ctor: " + this.row);
    }

    void report(int col) {
        System.out.print(" " + row + col);
    }
}
