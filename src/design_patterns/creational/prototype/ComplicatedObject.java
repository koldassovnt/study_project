package design_patterns.creational.prototype;

public class ComplicatedObject implements Copyable {
    private Type type;
    public enum Type {
        ONE, TWO
    }

    @Override
    public ComplicatedObject copy() {
        ComplicatedObject complicatedObject = new ComplicatedObject();
        complicatedObject.type = this.type;

        return complicatedObject;
    }
    public void setType(Type type) {
        this.type = type;
    }
}
