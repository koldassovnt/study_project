package design_patterns.behavioural.interpreter;

public class InterpreterTest {
    public static void main(String[] args) {
        String str = "TesT";
        Context context = new Context();

        Expression lowerExpression = new LowerExpression(str);
        str = lowerExpression.interpret(context);
        System.out.println(str);

        Expression upperExpression = new UpperExpression(str);
        str = upperExpression.interpret(context);
        System.out.println(str);
    }
}
