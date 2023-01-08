package design_patterns.structural.proxy;

public class RealImage implements Image {
    private final String file;

    public RealImage(String file) {
        this.file = file;
        load(file);
    }

    private void load(String file) {
        System.out.println("Загрузка " + file);
    }

    @Override
    public void display() {
        System.out.println("Просмотр " + file);
    }
}
