package commands;

import data.Dragon;
import data.DragonReadFromConsole;
import manager.MessageToSer;

public class UpdateByIDCommand implements Command{
    @Override
    public void execute(MessageToSer messageToSer) {
        messageToSer.setMessage("update_id");
        Dragon dragon = DragonReadFromConsole.readDragon();
        messageToSer.setDragon(dragon);
    }

    @Override
    public String getName() {
        return "update_id";
    }
}
