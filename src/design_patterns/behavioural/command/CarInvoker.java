package design_patterns.behavioural.command;

public class CarInvoker {
    public Command command;

    public CarInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
