package commands;

import manager.MessageToSer;

public class ReorderCommand implements Command{
    @Override
    public void execute(MessageToSer messageToSer) {
        messageToSer.setMessage("reorder");
    }

    @Override
    public String getName() {
        return "reorder";
    }
}
