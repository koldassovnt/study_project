package design_patterns.behavioural.memento;

public class TextEditor {
    private final TextWindow textWindow;

    public TextEditor(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    private TextWindowState savedTextWindow;

    public void hitSave() {
        savedTextWindow = textWindow.save();
    }

    public void hitUndo() {
        textWindow.restore(savedTextWindow);
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public String print() {
        return savedTextWindow.text();
    }
}
