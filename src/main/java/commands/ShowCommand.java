package commands;

import manager.MessageToSer;

public class ShowCommand implements Command{
    @Override
    public void execute(MessageToSer messageToSer) {
        messageToSer.setMessage("show");
    }

    @Override
    public String getName() {
        return "show";
    }
}
