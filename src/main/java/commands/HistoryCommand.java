package commands;

import manager.MessageToSer;

public class HistoryCommand implements Command {
    @Override
    public void execute(MessageToSer messageToSer) {
        messageToSer.setMessage("history");
    }

    @Override
    public String getName() {
        return "history";
    }
}
