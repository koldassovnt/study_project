package design_patterns.creational.singleton;

public class SingletonTest {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.setUp();

        SingletonBetterVersion.INSTANCE.setUp();
    }
}
