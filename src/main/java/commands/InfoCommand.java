package commands;

import manager.MessageToSer;

public class InfoCommand implements Command{
    @Override
    public void execute(MessageToSer messageToSer) {
        messageToSer.setMessage("info");
    }

    @Override
    public String getName() {
        return "info";
    }
}
