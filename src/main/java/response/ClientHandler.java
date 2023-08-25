package response;

import commands.ExecuteScriptCommand;
import exceptions.NoLIneFoundException;
import manager.LineInterpreter;
import manager.MessageToSer;
import reader.ReaderFromConsole;
import response.ResponseToClient;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.NoSuchElementException;

public class ClientHandler {
    private static final int RECONNECT_INTERVAL = 10000;

    private MessageToSer messageToSer = new MessageToSer();
//    LineInterpreter lineInterpreter = new LineInterpreter(System.in);
    private ReaderFromConsole readerFromConsole;
    public ClientHandler() {

    }
    public ClientHandler(ReaderFromConsole readerFromConsole) {
        this.readerFromConsole = readerFromConsole;
    }

    public void setReaderFromConsole(ReaderFromConsole readerFromConsole) {
        this.readerFromConsole = readerFromConsole;
    }

    public void clientConnect(LineInterpreter lineInterpreter) {
        try {
            while (true) {
                try {
                    messageToSer = readerFromConsole.getMessageToSer(lineInterpreter);
                }catch(NoSuchElementException e){
                    return;
                }

                Socket socket = new Socket("localhost", 1234);
                ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                outputStream.writeObject(messageToSer.toJson());
                outputStream.flush();

                ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
                ResponseToClient response = ResponseToClient.fromJson((String) inputStream.readObject());
                System.out.println(response);

                outputStream.close();
                inputStream.close();
                socket.close();
            }
        } catch (Exception e) {
            System.out.println("Не удалось подключиться к серверу. Повторная попытка подключения через " +
                    RECONNECT_INTERVAL + " мс");
            try {
                Thread.sleep(RECONNECT_INTERVAL);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

    }
}
