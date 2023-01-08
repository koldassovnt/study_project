package design_patterns.creational.singleton;

public enum SingletonBetterVersion {
    INSTANCE;

    public void setUp() {
        System.out.println("setUp");
    }
}
