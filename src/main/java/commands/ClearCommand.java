package commands;

import manager.MessageToSer;

public class ClearCommand implements Command{
    @Override
    public void execute(MessageToSer messageToSer) {
        messageToSer.setMessage("clear");
    }

    @Override
    public String getName() {
        return "clear";
    }
}
