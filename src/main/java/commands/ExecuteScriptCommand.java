package commands;

import manager.LineInterpreter;
import manager.MessageToSer;
import reader.ReaderFromConsole;
import response.ClientHandler;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayDeque;

public class ExecuteScriptCommand implements Command{
    private final ArrayDeque<String> history = new ArrayDeque<>();
    private final ClientHandler clientHandler;

    public ExecuteScriptCommand(ClientHandler clientHandler) {
        this.clientHandler = clientHandler;
    }



    public void execute(MessageToSer messageToSer) {

        if(messageToSer.getArg().length == 0){
            return;
        }
        String fileName;
        String fileContent;
        try {
            fileName = String.valueOf(messageToSer.getArg()[0]);
                InputStream reader = new FileInputStream(fileName);

            if (history.contains(fileName)) {
                history.clear();
                return;
            }
            history.add(fileName);
            clientHandler.clientConnect(new LineInterpreter(reader));
        } catch (Exception e) {
            System.out.println((e instanceof FileNotFoundException ?
                    "File not found" : "Not enough params or error reading file"));
        }
    }



    public String getName() {
        return "execute_script";
    }
}
