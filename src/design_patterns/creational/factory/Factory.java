package design_patterns.creational.factory;

public class Factory {
    public OS getCurrentOS(String inputOs) {
        return switch (inputOs) {
            case "windows" -> new WindowsOs();
            case "linux" -> new LinuxOs();
            case "mac" -> new MacOs();
            default -> null;
        };
    }

    public static void main(String[] args) {
        String win = "linux";
        Factory factory = new Factory();
        OS os = factory.getCurrentOS(win);
        os.getOS();
    }
}
