package commands;

import manager.MessageToSer;

public class SumOfAgeCommand implements Command{
    @Override
    public void execute(MessageToSer messageToSer) {
        messageToSer.setMessage("sum_of_age");
    }

    @Override
    public String getName() {
        return "sum_of_age";
    }
}
