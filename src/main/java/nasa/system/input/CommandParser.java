package nasa.system.input;

import java.util.ArrayList;
import java.util.List;

public class CommandParser implements Parsable {
    private Readable reader;
    private List<String> commands = new ArrayList<>();

    public CommandParser(Readable input) {
        this.reader = input;
    }

    public List<String> parse(){
        commands = reader.readInputs();
        //validate the inputs
        return commands;
    }
}
