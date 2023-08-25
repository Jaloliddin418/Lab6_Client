package commands;

import manager.MessageToSer;

public interface Command {
    void execute(MessageToSer messageToSer);
    String getName();
}
