package commands;

import manager.MessageToSer;

import java.util.Scanner;

public class FilterContainsNameCommand implements Command{

    @Override
    public void execute(MessageToSer messageToSer) {
        messageToSer.setMessage("filter_contains_name");
    }

    @Override
    public String getName() {
        return "filter_contains_name";
    }
}
