package commands;

import manager.MessageToSer;

public class HelpCommand implements Command{
    @Override
    public void execute(MessageToSer messageToSer) {
        messageToSer.setMessage("help");
    }

    @Override
    public String getName() {
        return "help";
    }
}
