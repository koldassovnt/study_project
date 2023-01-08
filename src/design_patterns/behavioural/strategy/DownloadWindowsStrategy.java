package design_patterns.behavioural.strategy;

public class DownloadWindowsStrategy implements Strategy {
    @Override
    public void download(String file) {
        System.out.println("windows download: " + file);
    }
}
