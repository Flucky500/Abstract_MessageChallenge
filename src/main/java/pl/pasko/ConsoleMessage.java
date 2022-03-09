package pl.pasko;

public class ConsoleMessage extends Message{

    private String consoleMessage;

    public ConsoleMessage() {
    }

    @Override
    String getMessage() {
        this.consoleMessage = "This class is a ConsoleMessage";
        return consoleMessage;
    }
}
