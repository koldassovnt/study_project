package design_patterns.structural.flyweight;

public class Factory {
    private final Flyweight[] pool;

    public Factory(int maxRows) {
        pool = new Flyweight[maxRows];
    }

    public Flyweight getFlyweight(int row) {
        if (pool[row] == null) {
            pool[row] = new Flyweight(row);
        }
        return pool[row];
    }
}
