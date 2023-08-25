package reader;

import commands.Command;
import exceptions.NoLIneFoundException;
import manager.LineInterpreter;
import manager.MessageToSer;

import java.util.*;

public class ReaderFromConsole {
   private final HashSet<Command> commandHashSet = new HashSet<>();
    private final ArrayDeque<String> history = new ArrayDeque<>();
    private boolean isHasNext = true;
    private String input;
    private String[] args;

    public void addCommand(Command command) {
        commandHashSet.add(command);
    }



    public MessageToSer getMessageToSer(LineInterpreter interpreter) throws NoSuchElementException{

            interpreter.nextLine();

        input = interpreter.getAllWords()[0];
        args = interpreter.getAllWords();
        MessageToSer messageToSer = new MessageToSer();
            if (args.length >= 2) {
                messageToSer.setArg(new String[]{args[1]});
            }
            for (Command cmd : commandHashSet) {
                if (cmd.getName().equals(input)) {
                    cmd.execute(messageToSer);
                    break;
                }
            }
            messageToSer.setMessage(input);
        return messageToSer;
    }
//    public void readLine(LineInterpreter interpreter) {
//            try {
//                interpreter.nextLine();
//            } catch (NoSuchElementException e) {
//                return;
//            }
//            input = interpreter.getAllWords()[0];
//            args = interpreter.getAllWords();
//            //  setMessageToSer(new MessageToSer());
//    }
}


