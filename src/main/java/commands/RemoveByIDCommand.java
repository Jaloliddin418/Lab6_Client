package commands;

import manager.MessageToSer;

public class RemoveByIDCommand implements Command{
    @Override
    public void execute(MessageToSer messageToSer) {
        messageToSer.setMessage("remove_by_id");
    }

    @Override
    public String getName() {
        return "remove_by_id";
    }
}
