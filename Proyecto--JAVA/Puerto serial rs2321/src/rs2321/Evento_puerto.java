package rs2321;

public class Evento_puerto extends java.awt.event.ActionEvent {

    private String readed;

    public Evento_puerto(Object source, int id, String command, String readed) {
        super(source, id, command);
        this.readed = readed;

    }

    public String getReaded() {
        return this.readed;
    }
}
