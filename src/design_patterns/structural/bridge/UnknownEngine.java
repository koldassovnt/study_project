package design_patterns.structural.bridge;

public class UnknownEngine implements Engine {
    @Override
    public void setEngine(){
        System.out.println("unknown");
    }
}
