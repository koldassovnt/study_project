package design_patterns.creational.factory;

public class LinuxOs implements OS{
    @Override
    public void getOS() {
        System.out.println("set up for linux");
    }
}
