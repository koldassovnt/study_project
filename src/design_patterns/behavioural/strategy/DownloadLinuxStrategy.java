package design_patterns.behavioural.strategy;

public class DownloadLinuxStrategy implements Strategy {
    @Override
    public void download(String file) {
        System.out.println("linux download: " + file);
    }
}
