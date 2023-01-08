package design_patterns.behavioural.interpreter;

public class LowerExpression implements Expression {
    private final String s;

    public LowerExpression(String s) {
        this.s = s;
    }

    @Override
    public String interpret(Context context) {
        return context.getLowerCase(s);
    }
}
