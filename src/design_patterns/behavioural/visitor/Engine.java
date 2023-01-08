package design_patterns.behavioural.visitor;

public class Engine implements Car {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
