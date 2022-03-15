package pl.pasko;

public class WindowMessage extends Message{

    private String windowMessage;

    public WindowMessage() {
    }

    @Override
    String getMessage() {
        this.windowMessage = "This class is a WindowMassage";
        return windowMessage;
    }
}
