package nested_example;

/**
 * Nested classes are divided into two categories: non-static and static.
 * Non-static nested classes are called inner classes.
 * Nested classes that are declared static are called static nested classes
 * <p>
 * A nested class is a member of its enclosing class.
 * Non-static nested classes (inner classes) have access to other members of the enclosing class,
 * even if they are declared private. Static nested classes do not have access to other members
 * of the enclosing class. As a member of the OuterClass, a nested class can be declared
 * private, public, protected, or package private.
 * (Recall that outer classes can only be declared public or package private.)
 */
public class OuterClass {

    String outerField = "Outer field";
    static String staticOuterField = "Static outer field";

    public void localInnerClass() {

        class LocalInner {
            public String localInnerField;
        }

        LocalInner asd = new LocalInner();
        asd.localInnerField = "Local inner field";

        System.out.println(asd.localInnerField);

    }

    public void callAnonClass() {
        AnonClassInterface anonClass = () -> System.out.println("Anonymous Class Call");
        anonClass.callAnonClass();
    }

    class InnerClass {

        static {
            System.out.println("Static block in InnerClass");
        }

        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {
        void accessMembers(OuterClass outer) {
            // Compiler error: Cannot make a static reference to the non-static
            //     field outerField
            // System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inner class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessMembers(outerObject);

        System.out.println("\nLocal inner class:");
        System.out.println("--------------------");
        outerObject.localInnerClass();

        System.out.println("\nAnonymous class:");
        System.out.println("--------------------");
        outerObject.callAnonClass();

        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMembers(outerObject);
    }
}
