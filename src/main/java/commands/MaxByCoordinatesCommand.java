package commands;

import manager.MessageToSer;

public class MaxByCoordinatesCommand implements Command{
    @Override
    public void execute(MessageToSer messageToSer) {
        messageToSer.setMessage("max_by_coordinates");
    }

    @Override
    public String getName() {
        return "max_by_coordinates";
    }
}
