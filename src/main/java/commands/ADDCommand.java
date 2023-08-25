package commands;

import data.Dragon;
import data.DragonReadFromConsole;
import manager.MessageToSer;

public class ADDCommand implements Command{

    @Override
    public void execute(MessageToSer messageToSer) {
        messageToSer.setMessage("add");
        Dragon dragon = DragonReadFromConsole.readDragon();
        messageToSer.setDragon(dragon);
    }

    @Override
    public String getName() {
        return "add";
    }
}
