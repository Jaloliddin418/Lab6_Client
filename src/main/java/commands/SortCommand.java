package commands;

import manager.MessageToSer;

public class SortCommand implements Command{
    @Override
    public void execute(MessageToSer messageToSer) {
        messageToSer.setMessage("sort");
    }

    @Override
    public String getName() {
        return "sort";
    }
}
