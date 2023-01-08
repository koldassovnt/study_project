package design_patterns.behavioural.visitor;

public class Wheel implements Car {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
