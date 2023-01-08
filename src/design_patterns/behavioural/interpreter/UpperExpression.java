package design_patterns.behavioural.interpreter;

public class UpperExpression implements Expression {

    private final String s;

    public UpperExpression(String s) {
        this.s = s;
    }

    @Override
    public String interpret(Context context) {
        return context.getUpperCase(s);
    }
}
