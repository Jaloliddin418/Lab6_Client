package commands;
import reader.ReaderFromConsole;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class CommandStore{
    private final HashMap<String,Command> commands = new HashMap<>();
   public void put(String str,Command cmd){
       commands.put(str,cmd);
   }
   public void setCommands(){

   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandStore that = (CommandStore) o;
        return commands.equals(that.commands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commands);
    }
}
