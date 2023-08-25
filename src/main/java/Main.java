import commands.*;
import manager.LineInterpreter;
import reader.ReaderFromConsole;
import response.ClientHandler;

public class Main {
    private static final int RECONNECT_INTERVAL = 50000;
    public static void main(String[] args) {
        LineInterpreter lineInterpreter = new LineInterpreter(System.in);
        ClientHandler clientHandler = new ClientHandler();
        clientHandler.setReaderFromConsole(new CommandAdder(clientHandler).getReaderFromConsole());
        clientHandler.clientConnect(lineInterpreter);

//        MessageToSer messageToSer = new MessageToSer();
//        ReaderFromConsole readerFromConsole = new ReaderFromConsole();
//        ExecuteScriptCommand executeScriptCommand = new ExecuteScriptCommand(readerFromConsole);
//        LineInterpreter lineInterpreter = new LineInterpreter(System.in);
//        CommandAdder commandAdder = new CommandAdder();
//        commandAdder.commandList(readerFromConsole);
////        readerFromConsole.addCommand(new ADDCommand());
////        readerFromConsole.addCommand(new ClearCommand());
////        readerFromConsole.addCommand(new ExecuteScriptCommand(readerFromConsole));
////        readerFromConsole.addCommand(new FilterContainsNameCommand());
////        readerFromConsole.addCommand(new HelpCommand());
////        readerFromConsole.addCommand(new HistoryCommand());
////        readerFromConsole.addCommand(new InfoCommand());
////        readerFromConsole.addCommand(new MaxByCoordinatesCommand());
////        readerFromConsole.addCommand(new RemoveByIDCommand());
////        readerFromConsole.addCommand(new ReorderCommand());
////        readerFromConsole.addCommand(new ShowCommand());
////        readerFromConsole.addCommand(new SortCommand());
////        readerFromConsole.addCommand(new SumOfAgeCommand());
////        readerFromConsole.addCommand(new UpdateByIDCommand());
//
//        try {
//
//            while (true) {
//                Socket socket = new Socket("localhost", 1234);
//                ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
//                ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
//                System.out.print("Введите команду (exit для выхода): ");
//
//
////                    lineInterpreter.nextLine();
////                String command = lineInterpreter.getAllWords()[0];
////                if (command.equals("add")){
////                    var dragon = DragonReadFromConsole.readDragon();
////                    messageToSer.setMessage("add");
////                    messageToSer.setDragon(dragon);
////                }
////                if(command.equals("update_id")){
////                    messageToSer.setMessage("update_id");
////                    var dragon = DragonReadFromConsole.readDragon();
////                    messageToSer.setDragon(dragon);
////                }
////
////                if (command.equals("exit")) {
////                    return;
////                }
////
////                String[] words = lineInterpreter.getAllWords();
////                if (words.length >= 2) {
////                        messageToSer.setArg(new String[]{words[1]});
////                    }
////
////                messageToSer.setMessage(command);
//
////                if(lineInterpreter.getAllWords()[0].equals("execute_script")){
////                    executeScriptCommand.execute(messageToSer);
////                }
//                messageToSer = readerFromConsole.getMessageToSer(lineInterpreter);
////                Socket socket = new Socket("localhost", 1234);
////                ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
//                outputStream.writeObject(messageToSer.toJson());
//                outputStream.flush();
//
////                ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
//                ResponseToClient response = ResponseToClient.fromJson((String) inputStream.readObject());
//                System.out.println(response);
//
//                outputStream.close();
//                inputStream.close();
//                socket.close();
//            }
//            // reader.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
