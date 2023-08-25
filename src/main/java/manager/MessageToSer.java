package manager;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import data.Dragon;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Arrays;

public class MessageToSer implements Serializable {

    private static final long serialVersionUID = 1234566L;
    private String message;
    private String []arg;
    private Dragon dragon;

    public MessageToSer(){}

    public MessageToSer(String message, String[] arg) {
        this.message = message;
        this.arg = arg;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String []getArg() {
        return arg;
    }

    public void setArg(String[] arg) {
        this.arg = arg;
    }

    public Dragon getDragon() {
        return dragon;
    }

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }
    public String toJson() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        return mapper.writeValueAsString(this);
    }
    public MessageToSer fromJson(String json) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        return mapper.readValue(json, MessageToSer.class);
    }

    public String toString() {
        return "MessageToSer{" +
                "message = '" + message + '\'' +
         ", arg = " + Arrays.toString(arg) +
                ", dragon = " + dragon +
                '}';
    }
}