package commands;

import reader.ReaderFromConsole;
import response.ClientHandler;

public class CommandAdder {
    private ReaderFromConsole readerFromConsole = new ReaderFromConsole();
    public CommandAdder(ClientHandler clientHandler) {
        readerFromConsole.addCommand(new ADDCommand());
        readerFromConsole.addCommand(new ClearCommand());
        readerFromConsole.addCommand(new ExecuteScriptCommand(clientHandler));
        readerFromConsole.addCommand(new FilterContainsNameCommand());
        readerFromConsole.addCommand(new HelpCommand());
        readerFromConsole.addCommand(new HistoryCommand());
        readerFromConsole.addCommand(new InfoCommand());
        readerFromConsole.addCommand(new MaxByCoordinatesCommand());
        readerFromConsole.addCommand(new RemoveByIDCommand());
        readerFromConsole.addCommand(new ReorderCommand());
        readerFromConsole.addCommand(new ShowCommand());
        readerFromConsole.addCommand(new SortCommand());
        readerFromConsole.addCommand(new SumOfAgeCommand());
        readerFromConsole.addCommand(new UpdateByIDCommand());
    }

    public ReaderFromConsole getReaderFromConsole() {
        return readerFromConsole;
    }
}
